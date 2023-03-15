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

    //METHODS

    public BigDecimal getDiscount(){
        BigDecimal productToDiscount;

        if (wireless){
            productToDiscount = getPrice().multiply(new BigDecimal("0.07"));
        }else{
            productToDiscount = getPrice().multiply(new BigDecimal("0.02"));
        }
        return getPrice().subtract(productToDiscount);
    }

    //METHODS
    @Override
    public String toString(){
        return "Headphones{"+
                super.toString() + '\'' +
                "color= " + color +
                ", wireless= " + wireless +
                '}';
    }

    @Override
    public BigDecimal getDiscountedPrice(boolean withIva){
        BigDecimal priceToDiscount = withIva ? priceWithIva() : getPrice();
        if(!wireless){
            return priceToDiscount.subtract(priceToDiscount.multiply(new BigDecimal("0.07")));
        } else{
            return super.getDiscountedPrice(withIva);
        }
    }


}
