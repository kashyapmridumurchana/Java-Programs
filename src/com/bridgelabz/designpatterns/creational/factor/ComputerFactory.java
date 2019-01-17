package com.bridgelabz.designpatterns.creational.factor;

public class ComputerFactory
{
	
public static FactoryComputers getComputer(String type, String ram, String hdd, String cpu)
	{
		if("PC".equalsIgnoreCase(type))
           return new Pc(ram, hdd, cpu);
		
		else if("Server".equalsIgnoreCase(type))
		return new Server(ram, hdd, cpu);

		return null;
	}

}
