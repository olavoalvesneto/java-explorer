/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duke.choice;

/**
 *
 * @author Olavo Alves
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double total = 0.0;
        int measurement = 8;

        Customer c1 = new Customer();
        c1.setName("Pink");
        c1.setSize("S");
        c1.setSize(measurement);

        System.out.println("Welcome to Duke Choice Shop ");

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing item3 = new Clothing();
        Clothing item4 = new Clothing();

        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);

        item2.setDescription("Orange T-Shirt");
        item2.setPrice(10.50);
        item2.setSize("S");

        item3.setDescription("Green Scarf");
        item3.setPrice(5.0);
        item3.setSize("S");

        item4.setDescription("Blue T-Shirt");
        item4.setPrice(10.50);
        item4.setSize("S");

        Clothing[] items = {item1, item2, item3, item4};
        c1.addItems(items);

        System.out.println("Customer is " + c1.getName() + " Size: " + c1.getSize() + "," + c1.getTotalClothingCost());
        
        for (Clothing item : c1.getItems()) {
            System.out.println("Items " + item.getDescription());
        }
        
    }
}
