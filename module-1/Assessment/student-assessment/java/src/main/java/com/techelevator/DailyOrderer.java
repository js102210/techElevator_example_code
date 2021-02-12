package com.techelevator;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class DailyOrderer {


   public ArrayList<FlowerShopOrder> getOrders(String path){
       ArrayList<FlowerShopOrder> orderList = new ArrayList<FlowerShopOrder>();
       Path myPath = Path.of(path);
       try (Scanner fileReader = new Scanner(myPath)){
           String line;
           while (fileReader.hasNextLine()){
               line = fileReader.nextLine();
               String[] orderLineArr = line.split(",");
               FlowerShopOrder order = new FlowerShopOrder(orderLineArr[0], Integer.parseInt(orderLineArr[1]));
               orderList.add(order);
           }
       } catch (IOException e) {
           System.out.println("Could not read the order file");
       }
       return orderList;
   }



}