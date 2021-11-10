/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duke.choice;

import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;
import java.net.InetAddress;
import java.net.UnknownHostException;

import java.util.Arrays;

/**
 *
 * @author Olavo Alves
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

  //      double total = 0.0;
  //      int average = 0;
  //      int count = 0;

  //      Customer c1 = new Customer("Pink", 3);

        System.out.println("Welcome to Duke Choice Shop ");

        //System.out.println("Min. Price: " + Clothing.MIN_PRICE);

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing item3 = new Clothing("Green Scarf", 5.0, "S");
        Clothing item4 = new Clothing("Blue T-Shirt", 10.5, "S");

        Clothing[] items = {item1, item2, item3, item4};
        
        
        try {
            ItemList list = new ItemList(items);
            Routing routing = Routing.builder().get("/items", list).build();
            ServerConfiguration config = ServerConfiguration.builder()
                    .bindAddress(InetAddress.getLocalHost())
                    .port(8888).build();
            WebServer ws = WebServer.create(config, routing);
            ws.start();
            
            
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
        
//        c1.addItems(items);

//        System.out.println("Customer is " + c1.getName() + " Size: " + c1.getSize() + "," + c1.getTotalClothingCost());

//        for (Clothing item : c1.getItems()) {
//            if (item.getSize().equals("L")) {
//                count++;
//                average += item.getPrice();
//            }
//        }


//        try {
//            average = (count == 0) ? 0 : average / count;
//            System.out.println("Avergage price: " + average + ", Count " + count);
//        } catch (ArithmeticException e) {
//            System.out.println("Dont divide by zero");
//        }

//        Arrays.sort(c1.getItems());
//        for (Clothing item : c1.getItems()) {
//            System.out.println("Items " + item);
//        }
    }
}
