/********************************************************************** *********
 *   Compilation:  javac -d bin Inventory.java						           	*
 *  Execution:    java -cp bin com.bridgelabz.oopsprograms.Inventory            *
 *                                                                  			*
 *  Purpose: Create a JSON file having Inventory Details for Rice, 				*
 *           Pulses and Wheats.                                                 *
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   9.1.2018															*
 *  *****************************************************************************/
package com.bridgelabz.util;

public class Inventory 
{
	private String name;
	private double weight;
	private double price;
	
	public Inventory()
	{
		name=null;
		weight=0.0;
		price=0.0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
