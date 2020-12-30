package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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


//        https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html

        //        the above commented lines boil down to this one line below

        someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s->s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);


        Stream<String> ioNumStream = Stream.of("I26", "I27", "I27", "I28");
        Stream<String> inNumStream = Stream.of("G26", "G27", "G27", "G28");
        Stream <String> concatStream = Stream.concat(ioNumStream, inNumStream);

        System.out.println("---------------");

        //you can use .peek to print something out for debugging purposes within a chain

        System.out.println(concatStream
                .distinct()
                .peek(System.out::println)
                .count());

        Employee jane = new Employee("Jane Doe", 30);
        Employee jack = new Employee("Jack Dip", 40);
        Employee jen = new Employee("Jen Hill", 32);


        Department hr = new Department("Human Resources");

        hr.addEmployee(jane);
        hr.addEmployee(jack);

        Department accounting = new Department("Accounting");
        accounting.addEmployee(jen);

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(accounting);

        List<Employee> allEmployees = departments
                .stream()
                .flatMap(department -> department.getEmployees().stream())
                .collect(Collectors.toList());


        for (Employee e: allEmployees){
            System.out.println(e.toString());
        }



//        List<String> sortedGNumbers = someBingoNumbers
//                .stream()
//                .map(String::toUpperCase)
//                .filter(s-> s.startsWith("G"))
//                .sorted()
//                .collect(Collectors.toList());

        List<String> sortedGNumbers = someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s-> s.startsWith("G"))
                .sorted()
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);




        for (String s: sortedGNumbers){
            System.out.println(s);
        }

        Map<Integer, List<Employee>> groupedByAge = departments
                .stream()
                .flatMap(department -> department.getEmployees().stream())
                .collect(Collectors.groupingBy(employee -> employee.getAge()));


        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .reduce((e1,e2)-> e1.getAge() < e2.getAge() ? e1: e2)
                .ifPresent(System.out::println);


        //once you have a terminal operation on a stream, you can't use that stream again
        //intermediate operations are not performed until there's a terminal operation (peek is an intermediate operation to do a print.ln test)


        Stream.of("AAA", "BBB", "CCCCC")
                .filter(s->{
                    System.out.println(s);
                    return s.length()==3;
                }).count();


    }





    }

