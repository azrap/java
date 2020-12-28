import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int [] myIntegers = getIntegers(5);

        for(int i=0; i<myIntegers.length; i++){
            System.out.println("Element " + i + ",typed value was " + myIntegers[i]);
        }

        int [] testArr={1,5,7,10,11};
        int [] sortedInts = sortIntegers(testArr);
        printArray(sortedInts);


        }

        public static int[] getIntegers(int capacity){
            System.out.println("Enter " + capacity + " integer values. \r");
            int[] array = new int[capacity];

            for (int i=0; i<array.length;i++){
                array[i]=scanner.nextInt();
            }

            return array;
        }

        public static void printArray(int[] array){
            for (int i=0; i<array.length ; i++){
                System.out.println("Element " + i + " contents " + array[i] );
            }
        }

        public static int[] sortIntegers(int[] array){
            int[] sortedArray = Arrays.copyOf(array, array.length);
             boolean flag = true;
             int temp;
             while(flag){
                 flag = false;
                 for(int i=0; i<sortedArray.length-1; i++){
                     if(sortedArray[i] < sortedArray[i+1]){
                         temp=sortedArray[i];
                         sortedArray[i] = sortedArray[i+1];
                         sortedArray[i+1] = temp;
                         flag = true;
                     }
                 }

             }
             return sortedArray;
        }

    }



