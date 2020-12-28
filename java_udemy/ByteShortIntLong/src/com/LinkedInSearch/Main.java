package com.LinkedInSearch;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myValue= 1000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Min Value = " + myMinIntValue);
        System.out.println("Integer Max Value = " + myMaxIntValue);

        byte myMinByteValue= Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        //challenge
        byte byteVar= 20;
        short shortVar = 1000;
        int intVar = 100000;
        long longVar = 50000L + 10L + 10*(byteVar + shortVar + intVar);
        System.out.println("longVar " + longVar);



    }


}
