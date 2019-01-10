package com.bridgelabz.oopsprograms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.util.InventoryList;
import com.bridgelabz.util.Inventory;
import com.bridgelabz.util.OopsUtility;

public class InventoryManagement {
    public static void main(String[] args) throws IOException {

        String str = "/home/admin1/Desktop/Inventory.json";
        ObjectMapper objectMapper = new ObjectMapper();
        List<InventoryList> list2 = new ArrayList<InventoryList>();
        InventoryList inventoryList = new InventoryList();
        List<Inventory> liInventories = new ArrayList<Inventory>();
        String file = OopsUtility.readFile(str);
        int z = 0;
        do {
            System.out.println("1.Display file\n2.Add to file\n3.Check for price\n4.exit");
            int choice = OopsUtility.userInteger();
            switch (choice) {
            case 1:
                try {
                    list2 = objectMapper.readValue(file, new TypeReference<List<Inventory>>() {});
                    OopsUtility.display(list2);
                } catch (Exception e) {
                    System.out.println("file is empty!! first add inputs on to file or select second choice");
                }
                break;
            case 2:
// list2 = objectMapper.readValue(file, new TypeReference<List<Inventory>>() {});
//  String [] arr= {"","rice","wheat","pulses"};
                System.out.println("Enter the inventory name i.e rice, wheat,pulses(in small letters)");
                String inventoryName = OopsUtility.userString();
                int op = 1, flag = 0;
                while (op == 1) {
                    for (InventoryList invenList : list2) {
                        if (inventoryName.equals(invenList.getInventoryName()))
                        { 
                            liInventories = invenList.getListOfInventories();
                            Inventory inventory = OopsUtility.insertInventoryDetail();
                            liInventories.add(inventory);
                            flag = 1;
                        }
                    }
                    if (flag == 0) {
                        Inventory inventory = OopsUtility.insertInventoryDetail();
                        liInventories.add(inventory);
                        inventoryList = OopsUtility.insertInventoryList(inventoryName, liInventories);
                        list2.add(inventoryList);
                    }
                    System.out.println("wish to add some more inventorry(1 or 0)");
                    op = OopsUtility.userInteger();
                }
               
                System.out.println("Entered elements has been added to list");
                String json = objectMapper.writeValueAsString(list2);
                OopsUtility.write(json);
                System.out.println("Inventory list has been written on to file");
                break;
            case 3:
                list2 = objectMapper.readValue(file, new TypeReference<List<Inventory>>() {});
                OopsUtility.price(list2);
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("please select correct choice");
                break;

            }
            z++;
        } while (z < 30);
    }
}

