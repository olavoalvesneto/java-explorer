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
public class Customer {

    public Customer(String name, int measurement) {
        this.name = name;
        setSize(measurement);
    }

    private String name;
    private String size;

    private Clothing[] items;

    public void addItems(Clothing[] someItems) {
        items = someItems;
    }

    public double getTotalClothingCost() {
        double total = 0.0;

        for (Clothing item : items) {
            total += item.getPrice();
        }

        return total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSize(int measurement) {
        switch (measurement) {
            case 1, 2, 3:
                size = "S";
                break;
            case 4, 5, 6:
                size = "M";
                break;
            case 7, 8, 9:
                size = "L";
                break;
            default:
                size = "XL";
        }

    }

    public Clothing[] getItems() {
        return items;
    }

}
