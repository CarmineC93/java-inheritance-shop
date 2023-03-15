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

    //METHODS
    @Override
    public String toString(){
        return "Tv{"+
                super.toString() + '\'' +
                "inches= " + inches +
                ", smart= " + smart +
                '}';
    }

    @Override
    public BigDecimal getDiscountedPrice(boolean withIva){
        BigDecimal priceToDiscount = withIva ? priceWithIva() : getPrice();
        if(!smart){
            return priceToDiscount.subtract(priceToDiscount.multiply(new BigDecimal("0.05")));
        } else{
            return super.getDiscountedPrice(withIva);
        }
    }

}
