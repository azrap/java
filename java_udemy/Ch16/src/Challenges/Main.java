package Challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {


        System.out.println("EXERCISE 1: ");

        Runnable runnable = () -> {
            String myString = "Let's split into array";
            String[] parts = myString.split(" ");

            for (String part : parts) {
                System.out.println(part);
            }
        };


        runnable.run();


        System.out.println("\nEXERCISE 2, 3: ");

//        public static String everySecondChar(String source){
//            StringBuilder returnVal = new StringBuilder();
//
//            for (int i=0; i<source.length(); i++){
//                if(i%2==1){
//                    returnVal.append(source.charAt(i));
//                }
//
//            }
//
//            return returnVal;
//        }

//takes a value returns a value maps to Function

//        the above method turns into the below for a lambda function


        Function<String, String> everySecondChar = s -> {
            StringBuilder returnVal = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();



        };

        String testy = everySecondChar.apply("1234567890");

        System.out.println(everySecondChar.apply("12345696010"));

        System.out.println("\nEXERCISE 4, 5: ");


        System.out.println(everySecondCharacter(everySecondChar, "123456211145151yayaya"));

        Supplier<String> iLoveJava = ()-> "I love java!!";


        System.out.println("\nEXERCISE 6, 7: ");

        String supplierResult = iLoveJava.get();

        System.out.println(supplierResult);


        System.out.println("\nEXERCISE 8,: ");


        Callable callMeMaybe = () -> {
           return "need to return someeethingggg";
        };

        System.out.println(callMeMaybe.call());


        System.out.println("\nEXERCISE 9,: ");
        
        List<String> topName2015 = Arrays.asList("top", "name", "of", "2015", "is", "tamisha");



        Collections.sort(topName2015);

        topName2015.forEach( name -> System.out.println(Character.toUpperCase(name.charAt(0)) + name.substring(1)));

        System.out.println("\nExercise 10: ");

        List <String> firstUpperCaseList = new ArrayList<>();

        topName2015.forEach(name-> firstUpperCaseList.add(name.substring(0,1).toUpperCase() + name.substring(1)));

        firstUpperCaseList.sort((s1,s2)-> s1.compareTo(s2));
//        can also do the above line like like this
        firstUpperCaseList.sort(String::compareTo);

        firstUpperCaseList.forEach(System.out::println);

        System.out.println("\nExercise 11: ");
        topName2015.stream()
                .map(s-> s.substring(0,1).toUpperCase()+s.substring(1))
                .sorted(String::compareTo)
                .forEach(System.out::println);


        System.out.println("\nExercise 12: ");
        System.out.println(topName2015.stream()
                .filter(s -> s.startsWith("t"))
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .count());


        System.out.println("\nExercise 14: ");
        topName2015.stream()
                .filter(s -> s.startsWith("t"))
                .map(s-> s.substring(0,1).toUpperCase()+s.substring(1))
                .peek(System.out::println)
                .sorted(String::compareTo)
                .collect(Collectors.toList());
        //need a terminal operation to run the whole stream. .collect is terminal


    }

//    Exercise 5
        public static String everySecondCharacter(Function<String, String > func, String source){
        return func.apply(source);
    };








}





