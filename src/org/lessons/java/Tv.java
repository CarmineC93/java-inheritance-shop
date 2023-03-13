package org.lessons.java;

import java.math.BigDecimal;

public class Tv  extends Product{
    //ATTRIBUTES
    private int inches;
    private boolean smart;

    //CONSTRUCTORS
    public Tv(int inches, boolean smart, String name, String description, BigDecimal price, BigDecimal iva){
        super(name, description, price, iva);
        this.inches = inches;
        this.smart= smart;
    }

}
