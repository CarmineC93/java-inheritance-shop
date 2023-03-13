package org.lessons.java;

public class Headphones extends Product {
    //ATTRIBUTES
    private String color;
    private boolean wireless;

    //CONSTRUCTORS
    public Headphones(String color, boolean wireless, String name, String description, double price, int iva){
        super(name, description, price, iva);
        this.color = color;
        this.wireless= wireless;
    }
}
