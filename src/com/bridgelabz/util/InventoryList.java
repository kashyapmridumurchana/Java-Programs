/*******************************************************************************
 *																				*
 *  @author  Mridumurchana Kashyap												*
 *  @version 1.0																*
 *  @since   19.12.2018															*
 *  **************************************************************************/
package com.bridgelabz.util;

import java.util.ArrayList;
import java.util.List;

public class InventoryList {

    private String inventoryName;
   
    List<Inventory> listOfInventories = new ArrayList<Inventory>();

    public String getInventoryName() {
        return inventoryName;
    }

    public void setInventoryName(String inventoryName) {
        this.inventoryName = inventoryName;
    }

    public List<Inventory> getListOfInventories() {
        return listOfInventories;
    }

    public void setListOfInventories(List<Inventory> listOfInventories) {
        this.listOfInventories = listOfInventories;
    }

}