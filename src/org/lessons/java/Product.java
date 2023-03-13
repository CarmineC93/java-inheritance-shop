package org.lessons.java;

import java.text.DecimalFormat;
import java.util.Random;

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
        private double price;  // REFACTORING : CAMBIARE IN BIGDECIMAL
        private int iva;   // REFACTORING : CAMBIARE IN BIGDECIMAL

        //CONSTRUCTORS
        public Product() {
            code = rnd.nextInt(1,10000);
        }

        public Product(String name, String description, double price, int iva){
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
        public double getPrice() {
            return price;
        }
        public void setPrice(double price) {
            this.price = price;
        }
        public int getIva() {
            return iva;
        }
        public void setIva(int iva) {
            this.iva = iva;
        }

        //METHOD
        public String priceWithIva() {
            double taxedPrice = price + (price * iva / 100);
            DecimalFormat df = new DecimalFormat("0.00");
            return  df.format(taxedPrice);
        }
        public String priceWithoutIva() {
            DecimalFormat df = new DecimalFormat("0.00");
            return df.format(price);
        }
}
