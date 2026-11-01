package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product implements Discountable{

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

    @Override
    public String getSummary (){
        return "Physical: " + getName() + " | Wight: " + weightKg;
    }

    private double discountedPrice;

    @Override
    public void applyDiscount(double rate){
        // (a) Cap the rate at 0.20 (20%)
        double cappedRate = Math.min(rate, 0.20);

        // (b) Apply the capped rate, not the original rate
        discountedPrice = getPrice() * (1 - cappedRate);
    }

    @Override
    public double getDiscountedPrice(){
        return discountedPrice;
    }
}
