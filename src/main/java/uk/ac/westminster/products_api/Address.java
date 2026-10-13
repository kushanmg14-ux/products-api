package uk.ac.westminster.products_api;

public class Address {
    // fields (instance variables)
    private  String  street ;
    private String city ;
    private String postcode ;


    //default constructor
    public Address(){}

    // parameterized constructor
    public Address(String street,String city,String postcode){
        this.street = street ;
        this.city = city ;
        this.postcode = postcode ;
    }

    //getters
    public String getStreet(){
        return street;
    }

    public String getCity(){
        return city;
    }

    public String getPostcode(){
        return postcode;
    }
}

