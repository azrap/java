
package com.LinkedInSearch;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Lambda expression will override or execute interfaces with single method (such as Runnable for Threads has only the run method) in the javascripty way below

        new Thread(()-> {
            System.out.println("Print from zee runnable");
            System.out.println("Line 2");
            System.out.println("This is line 3");
        }).start();

        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim Doe", 32);
        Employee azra = new Employee("Azra Doe", 36);
        Employee jill = new Employee("Jill dream", 30);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(azra);
        employees.add(jill);

        employees.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
            System.out.println("inside the forEach");
        });
//

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee e1, Employee e2) {
//                return e1.getName().compareTo(e2.getName());
//            }
//        });

//        the above turns into the below when using lambda functions:

        //whenever we see an anonymous class definition that only overrides one method, we can use a lambda function

        //the below sort the employees by ascending order

        Collections.sort(employees, (e1, e2) -> e1.getName().compareTo(e2.getName()));

        for (Employee employee: employees){
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
            System.out.println("not inside the foreach");
        }

//        String sillyString = doStringStuff(new UpperConcat() {
//
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        }, employees.get(0).getName(), employees.get(1).getName());


//        step 3: we want to use and override the upperAndConcat method inside UpperConcat. Single method, so Lambda works well.
        // it knows which interface you're talking about because you're telling it in the object type (UpperConcat)
        UpperConcat uc = (s1, s2) -> {
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        };

        String sillyString = doStringStuff( uc
        , employees.get(0).getName(), employees.get(1).getName());

        System.out.println(sillyString);



        AnotherClass anotherClass = new AnotherClass();

        String s = anotherClass.doSomething();

        System.out.println(s);
    }





    //    step 2: function doStringSTuff takes the UpperConcat interface, and two strings, and returns the computation

    public final  static String doStringStuff(UpperConcat uc, String s1, String s2){
        return uc.upperAndConcat(s1,s2);
    }

}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

// step 1) define an interface UpperConcat. It has one method that takes in 2 strings. Remember, ekxact method def comes later in interfaces.
interface UpperConcat {
    public String upperAndConcat(String s1, String s2);
}

class AnotherClass {
    public String doSomething(){

        //if variable is declared outside the lambda function, it must be final i.e. its value cannot be modified inside the lambda function (eg this i).
        //that's because lambdas may not be immediately evaluated so we don't want some thread modifying and messing up the lambda
        //similarly vars that get modified inside the lambda can't be changed outside it
        int i = 0;

        UpperConcat uc = (s1,s2)-> {
            System.out.println("The lambda expressions class is 's name is: " + getClass().getSimpleName());
            System.out.println("i in te lambda = " + i);
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        };

        System.out.println("AmotherClass is 's name is: " + getClass().getSimpleName());
        return Main.doStringStuff(uc, "String1", "String2");
    }



}






