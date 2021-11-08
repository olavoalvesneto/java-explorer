/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duke.choice;

/**
 *
 * @author opc
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Double tax = 0.2;
        Double total;
        Customer c1 = new Customer();
        c1.setName("Pink");
        System.out.println("Welcome to Duke Choice Shop " + c1.getName());
        
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        
        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        
        item2.setDescription("Orange T-Shirt");
        item2.setPrice(10.50);
        item2.setSize("S");
        
        System.out.println("Item1 : " + item1.getDescription() + "," + item1.getPrice() + "," + item1.getSize());
        System.out.println("Item2 : " + item2.getDescription() + "," + item2.getPrice() + "," + item2.getSize());
        
        total = ((item1.getPrice() + (item2.getPrice() * 2))) * (1 + tax);
        System.out.println("Total : " + total);
        
    }
    
}
