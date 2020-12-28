package ArrayLists;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static GroceryList groceryList = new GroceryList();


    public static void main(String[] args) {

        boolean quit = false;

        int choice = 0;

        while(!quit){
            System.out.println("Enter your choice: ");
            choice=scanner.nextInt();

            scanner.nextLine();

            switch(choice){
                case 0:
                    printInstructons();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    groceryList.removeItem();
                    break;
                case 3:
                    addItem();
                    break;
                case 4:
                    modifyItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;

            }
        }
        }

    }



