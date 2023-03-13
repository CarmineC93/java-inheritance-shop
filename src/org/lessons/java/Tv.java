package org.lessons.java;

public class Tv  extends Product{
    //ATTRIBUTES
    private int inches;
    private boolean smart;

    //CONSTRUCTORS
    public Tv(){

    }

    public Tv(int inches, boolean smart, String name, String description, double price, int iva){
        super(name, description, price, iva);
        this.inches = inches;
        this.smart= smart;
    }

}
