package org.lessons.java;

public class Smartphone extends Product{

    //ATTRIBUTES
    private int codeIMEI;
    private int ram;

    //CONSTRUCTORS

    public Smartphone(int codeIMEI, int ram, String name, String description, double price, int iva){
        super(name, description, price, iva);
        this.codeIMEI = codeIMEI;
        this.ram = ram;
    }

}
