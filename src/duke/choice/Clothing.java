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
public class Clothing {
   
   public final static double MIN_PRICE = 10.0; 
   public final static double TAX_RATE = 0.2;
   
   private String description;
   private double price;
   private String size = "M";
   
       public Clothing(String description, double price, String aSize) {
        this.description = description;
        this.price = price;
        this.size = aSize;
    }

   
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        //Manipulating values within the getter is not a good practice, used here for teaching purposes    
        return (price * (1 + TAX_RATE));
    }

    public void setPrice(double price) {
        //Manipulating values within the setter is not a good practice, used here for teaching purposes.
        this.price = (price > MIN_PRICE) ? price : MIN_PRICE;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
}
