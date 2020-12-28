package com.LinkedInSearch;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(){
//        empty, call with 3 parameters, default values
        this("azra", 50000, "azraap@gmail.com");

    }

    public VipCustomer(String name, double creditLimit){
        this(name, creditLimit, "azraap@gmail.com");
//        pass on two values + have default for 3rd
    }

//this is the one that gets called by the above two
    public VipCustomer(String name, double creditLimit, String emailAddress){
        this.name=name;
        this.creditLimit=creditLimit;
        this.emailAddress=emailAddress;

    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
