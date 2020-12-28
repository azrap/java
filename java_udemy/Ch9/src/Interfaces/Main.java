package Interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        ITelephhone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(678910);
//        timsPhone.powerOn();
        timsPhone.callPhone(678910);
        timsPhone.answer();



        Player azra = new Player("azra", 10, 15);

        Monster fazra = new Monster("fazra", 10, 15,"debate", "grrrr");

        saveObject(azra); //
        System.out.println(azra);
        loadObject(azra);
        System.out.println(azra);

        System.out.println("oh noo here comes the monstaa");
        saveObject(fazra); //
        System.out.println(fazra);
        loadObject(fazra);
        System.out.println(fazra);

    }


//    readValues below reads values from user input,
//    saves them in an array, then returns the array

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    // saveObject function takes in a player object (eg azra),
    // note, when it is implementing an interface class (ISaveable), it calls the object that (since it's not an extension)
    // writes all fields into the storage array using the object.write() function
    // then uses get(i) to print out each element;

    public static void  saveObject (ISaveable objectToSave){
        List<String> values = objectToSave.write();
        for(int i=0; i < values.size(); i++){

            System.out.println("Saving " + values.get(i) +
                    " to storage device" );
        }
    }

    // objectToLoad takes in a player object (eg. azra)
    // gets the values from user inputs in the readValues function above,
    // stores in values arrayList
    // then uses the read function to change the values of the player object
    // need to input at least as many values as the fields in player object or it will throw error
    public static  void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);

    }


}
