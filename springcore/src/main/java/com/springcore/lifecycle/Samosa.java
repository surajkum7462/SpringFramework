package com.springcore.lifecycle;

public class Samosa {
    
    private double price;

    // Default constructor (no-argument)
    public Samosa() {
        super();
    }

    // Parameterized constructor
    public Samosa(double price) {
        super();
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
    	System.out.println("Setting price");
        this.price = price;
    }

    @Override
    public String toString() {
        return "Samosa [price=" + price + "]";
    }
    
    public void init()
    {
    	System.out.println("Inside init method");
    }
    
    public void destroy()
    {
    	System.out.println("Inside destroy method");
    }
}
