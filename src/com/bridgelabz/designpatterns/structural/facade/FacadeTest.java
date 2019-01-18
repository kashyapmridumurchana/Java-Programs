package com.bridgelabz.designpatterns.structural.facade;

import java.sql.Connection;

public class FacadeTest {

	public static void main(String[] args) 
	{
        String tableName="Employee";
		String path="/home/admin1/eclipse-workspace/Java-Programs";
		//generating MySql HTML report and Oracle PDF report without using Facade
		Connection con = MySqlHelper.getMySqlDBConnection();
		MySqlHelper mySqlHelper = new MySqlHelper();
		mySqlHelper.generateMySqlHTMLReport(tableName, con);
		
		Connection con1 = OracleHelper.getOracleDBConnection();
		OracleHelper oracleHelper = new OracleHelper();
		oracleHelper.generateOraclePDFReport(tableName, con1);
		
		Connection con2=AddressBook.getMyFileConnection();
		AddressBook.generateMyFileReport(path, con2);
		
		//generating MySql HTML report and Oracle PDF report using Facade
		HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
		HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
	}
	

	}


