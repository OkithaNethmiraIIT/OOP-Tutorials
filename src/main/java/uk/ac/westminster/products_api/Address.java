package uk.ac.westminster.products_api;

public class Address {

    private String street;
    private String city;
    private String postCode;

    public Address(){}

    public Address(String street, String city, String postCode){
        this.street = street;
        this.city = city;
        this.postCode = postCode;
    }

    public String getStreet(){
        return street;
    }

    public String getCity(){
        return city;
    }

    public String getPostCode(){
        return postCode;
    }
}
