package org.lessons.java;

import java.math.BigDecimal;

public class Headphones extends Product {
    //ATTRIBUTES
    private String color;
    private boolean wireless;

    //CONSTRUCTORS
    public Headphones(String color, boolean wireless, String name, String description, BigDecimal price, BigDecimal iva){
        super(name, description, price, iva);
        this.color = color;
        this.wireless= wireless;
    }
}
