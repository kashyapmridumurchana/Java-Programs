package com.bridgelabz.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{

		private List<String> empList;
		
		//constructor
		public Employees()
		{
			empList = new ArrayList<String>();
		}
		
		//set
		public Employees(List<String> list){
			this.empList=list;
		}
		
		public void loadData(){
			//read all employees from database and put into the list
			empList.add("Mridu");
			empList.add("Prema");
			empList.add("Shweta");
			empList.add("Dhanush");
		}
		
		//get
		public List<String> getEmpList() {
			return empList;
		}

		@Override
		public Object clone() throws CloneNotSupportedException
		{
				List<String> temp = new ArrayList<String>();
				for(String s : this.getEmpList()){
					temp.add(s);
				}
				return new Employees(temp);
		}
		
	}

