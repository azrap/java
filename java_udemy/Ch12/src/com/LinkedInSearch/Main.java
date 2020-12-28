package com.LinkedInSearch;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	// write your code here

        HashSet<String> set = new HashSet<String>();

        set.add(" Jane");
        set.add(" Jenny");
        set.add(" Jim");
        set.add(" John");
        set.add(" Joe");


        System.out.println("this is a set: " + set);


        Iterator<String> itr = set.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }







    }
}
