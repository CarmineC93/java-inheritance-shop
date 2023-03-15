package org.lessons.java;

import java.util.Arrays;
import java.util.Random;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;


public class Product {

        Random rnd = new Random();
    /*
    - codice (numero intero)
    - nome
    - descrizione
    - prezzo
    - iva*/

        private int code;
        private String name;
        private String description;
        private BigDecimal price;
        private BigDecimal iva;

        //CONSTRUCTORS
        public Product() {
            code = rnd.nextInt(1,10000);
        }

        public Product(String name, String description, BigDecimal price, BigDecimal iva){
            code = rnd.nextInt(1,10000);
            this.name = name;
            this.description = description;
            this.price = price;
            this.iva = iva;
        }

        //GETTER & SETTER
        public int getCode() {
            return code;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getDescription() {
            return description;
        }
        public void setDescription(String description) {
            this.description = description;
        }
        public  BigDecimal getPrice() {
            return price;
        }
        public void setPrice(BigDecimal price) {
            this.price = price;
        }
        public BigDecimal getIva() {
            return iva;
        }
        public void setIva(BigDecimal iva) {
            this.iva = iva;
        }

        //METHOD

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", iva=" + iva +
                ", prezzo ivato=" + priceWithIva() +
                '}';
    }

        public BigDecimal priceWithIva() {
            BigDecimal priceWithIva = price.multiply(iva);
            return price.add(priceWithIva).setScale(2, RoundingMode.HALF_EVEN);
        }


        //method to calc discount
        public BigDecimal getDiscountedPrice(boolean withIva){
            BigDecimal priceToDiscount = withIva ? priceWithIva() : price;
            return price.subtract(price.multiply(new BigDecimal("0.02")));
        }



}
