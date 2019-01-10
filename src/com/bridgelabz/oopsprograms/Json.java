package com.bridgelabz.oopsprograms;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.util.Inventory;
import com.bridgelabz.util.InventoryList;
import com.bridgelabz.util.OopsUtility;



public class Json {
    public static void main(String[] args) throws IOException {
//        Inventory it=new Inventory();
        String str="/home/admin1/Desktop/Inventory.json";
        String file=OopsUtility.readFile(str);
        System.out.println(file);
        ObjectMapper objectMapper = new ObjectMapper();
//        List<Map<String, List<Inventory>>> list2 = objectMapper.readValue(file, new TypeReference<List<Map<String,List<Inventory>>>>(){});
//        for(Map<String, List<Inventory>> li:list2)
//        {
//        Map<String, List<Inventory>> list1 = li;
//        for (Entry<String, List<Inventory>> entry : list1.entrySet()) {
//            List<Inventory> list12 = entry.getValue();
//            for(int i=0;i<list12.size();i++)
//            {
//                Inventory it = list12.get(i);
//                System.out.println("name :"+it.getName());
//                System.out.println("weight :"+it.getWeight());
//                System.out.println("price :"+it.getPrice()+"\n");
//            }
//        }
//        List<InventoryList> list1 = new ArrayList<InventoryList>();
//        InventoryList inventoryList = new InventoryList();
//        inventoryList.setInventoryName("rice");
//        Inventory inventory = new Inventory();
//        inventory.setName("basmati");
//        inventory.setWeight(40);
//        inventory.setPrice(12);
//        List<Inventory> liInventories = new ArrayList<Inventory>();
//        liInventories.add(inventory);
//        inventoryList.setListOfInventories(liInventories);
//        list1.add(inventoryList);
//       
//       
//       
//       
//       
//        String json = objectMapper.writeValueAsString(list1);
//       
//        FileWriter fw = new FileWriter("/home/admin1/Documents/adiga_docs/Programs/Files/json1.json");
//        BufferedWriter bw = new BufferedWriter(fw);
//        bw.write(json);
//        bw.flush();
   

       
       
        List<InventoryList> list2 = objectMapper.readValue(file, new TypeReference<List<InventoryList>>() {});
       
            for(int i=0;i<list2.size();i++)
            {
                InventoryList it = list2.get(i);
                System.out.println("name :"+it.getInventoryName());
                System.out.println("name :"+it.getListOfInventories().get(0).getName());
                System.out.println("name :"+it.getListOfInventories().get(0).getPrice());
            }
        }
       
}
//        Inventory demo=objectMapper.readValue(file, Inventory.class);
//        System.out.println("name :"+demo.getName());
//        System.out.println("weight :"+demo.getWheat().get(0));
//        System.out.println("price :"+demo.getPulses().get(0)+"\n");
//       

