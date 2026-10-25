package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product{

    private double weightKg;
    private String dimensions;

    // (a): empty no-arg constructor for Jackson
    public PhysicalProduct(){}

    // (b): full constructor.
    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions){
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    //(c): getWeightKg() and getDimensions()
    public double getWeightKg(){
        return weightKg;
    }

    public String getDimensions(){
        return dimensions;
    }

}
