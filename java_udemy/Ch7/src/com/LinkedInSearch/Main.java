package com.LinkedInSearch;

import Computer.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimensions dimensions = new Dimensions(20, 20, 5);

        Case theCase= new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27 inch", "acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 4, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.getMonitor().drawPixelAt(5,7, "blue");
        thePC.getMotherboard().loadProgram("Windows 1.0");
        thePC.getTheCase().pressPowerButton();

    }
}
