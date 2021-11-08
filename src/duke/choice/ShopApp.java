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
        Double total = 0.0;
        Customer c1 = new Customer();
        c1.setName("Pink");
        c1.setSize("S");
        System.out.println("Welcome to Duke Choice Shop " + c1.getName());

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

        Clothing[] itens = {item1, item2, item3, item4};
        int measurement = 3;

        switch (measurement) {
            case 1, 2, 3:
                c1.setSize("S");
                break;
            case 4, 5, 6:
                c1.setSize("M");
                break;
            case 7, 8, 9:
                c1.setSize("L");
                break;
            default:
                c1.setSize("X");
        }

        for (Clothing item : itens) {
            if (c1.getSize().equals(item.getSize())) {
                System.out.println("Item ," + item.getDescription() + "," + item.getPrice() + "," + item.getSize());
                total += (item.getPrice() * (1 + tax));
                
                if (total > 15) {
                    break;
                }
            }
        }
        System.out.println("Total : " + total);

    }

}
