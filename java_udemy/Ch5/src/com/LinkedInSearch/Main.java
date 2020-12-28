package com.LinkedInSearch;

public class Main {

    public static void main(String[] args){

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("jane", 35000);
        System.out.println(person2.getCreditLimit());

        VipCustomer person3 = new VipCustomer("jane", 35000, "jane@jane.com");
        System.out.println(person3.getEmailAddress());

        Wall wall1= new Wall(1.125, -1.0);
        System.out.println(wall1.getWidth());
        System.out.println(wall1.getHeight());


    }

}