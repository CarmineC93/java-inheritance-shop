package org.lessons.java;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Smartphone extends Product{

    //ATTRIBUTES
    private int codeIMEI;
    private int ram;

    //CONSTRUCTORS

    public Smartphone(int codeIMEI, int ram, String name, String description, BigDecimal price, BigDecimal iva){
        super(name, description, price, iva);
        this.codeIMEI = codeIMEI;
        this.ram = ram;
    }

    //METHOD
    @Override
      public BigDecimal getDiscountedPrice(boolean withIva){
        BigDecimal priceToDiscount = withIva ? priceWithIva() : getPrice();
        if(ram < 32){
            return priceToDiscount.subtract(priceToDiscount.multiply(new BigDecimal("0.05")));
        } else{
            return super.getDiscountedPrice(withIva);
        }
    }


    @Override
    public String toString(){
        return "Smartphone{"+
                super.toString() + '\'' +
                "codeImei= " + codeIMEI +
                ", ram= " + ram + "GB" +
                '}';
    }
}
