package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> someBingoNumbers = Arrays.asList(
                "N40", "N36",
                "B12", "B6",
                "G53", "G29", "g65",
                "I26", "I17",
                "071");


        List<String> gNumbers = new ArrayList<>();

//        someBingoNumbers.forEach(number->{
//            if(number.toUpperCase().startsWith("G")){
//
//                //can use gNumbers inside the forEach to add but the reference is final so can't reassign it eg const in JS
//
//                gNumbers.add(number);
//                System.out.println(number);
//            }
//        });

//        gNumbers.sort((String s1, String s2)-> s1.compareTo(s2));
//        gNumbers.forEach((String s)-> System.out.println(s));

//        the above commented lines boil down to this one line below

//        https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html

        someBingoNumbers.stream().map(String::toUpperCase).filter(s->s.startsWith("G")).sorted().forEach(System.out::println);

        }
    }

