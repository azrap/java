package Employees;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //Lambda expression will override or execute interfaces with single method (such as Runnable for Threads has only the run method) in the javascripty way below

        new Thread(() -> {
            System.out.println("Print from zee runnable");
            System.out.println("Line 2");
            System.out.println("This is line 3");
        }).start();

        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim Doe", 32);
        Employee azra = new Employee("Azra Doe", 36);
        Employee jill = new Employee("Jill dream", 30);
        Employee joan = new Employee("Joan dream", 25);
        Employee jen = new Employee("Jen dream", 20);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(azra);
        employees.add(jill);
        employees.add(joan);
        employees.add(jen);


        //Function interface takes one parameter and returns a value
        //first type is argument type (Employee), second type is the return type (String)

        Function<Employee, String> getLastName = (Employee employee) -> {
            return employee.getName().substring(employee.getName().indexOf(" ") + 1);
        };

        String lastName = getLastName.apply(employees.get(2));
        System.out.println("Printing from Function Interface: " + lastName);

        Function<Employee, String> getFirstName = (Employee employee) -> {
            return employee.getName().substring(0, employee.getName().indexOf(" ") );
        };


        String firstName = getFirstName.apply(employees.get(2));
        System.out.println("Printing from Function Interface: " + firstName);





        printEmployeesByAge(employees, "Employees over 30", employee -> employee.getAge()>30);
        printEmployeesByAge(employees, "Employees 30 and under", employee -> employee.getAge()<=30);
        printEmployeesByAge(employees,"Employees younger than 25", employee -> employee.getAge()<25);

        IntPredicate greaterThan15 = i -> i >15;
        IntPredicate lessThan100 = i -> i <100;
        System.out.println(greaterThan15.test(10));
        int a = 11;
        System.out.println(greaterThan15.test(a+5));

//        this is how you chain predicates with an and statement. Can chain .or,.negate, .eq
        System.out.println(greaterThan15.and(lessThan100).test(500));
        System.out.println(greaterThan15.and(lessThan100).test(50));
        System.out.println(greaterThan15.and(lessThan100).test(5));

        Random random = new Random();

// the supplier interface takes no arguments and returns a result. Whenever you need to just return a result you use supplier.get()
        Supplier<Integer> randomSupplier = () -> random.nextInt(1000);
//        https://medium.com/swlh/understanding-java-8s-consumer-supplier-predicate-and-function-c1889b9423d

        for (int i = 0; i < 10; i++){
            System.out.println(randomSupplier.get());

        }


        Random random1 = new Random();

        for(Employee employee : employees){
            boolean randomBool = random1.nextBoolean();
            System.out.println("We gonna print the name or nah? "+ randomBool);
            if (randomBool){
                System.out.println(getName(getFirstName, employee));
                System.out.println(getName(getLastName, employee));
            }
        }

        Function<Employee, String> upperCase = employee -> employee.getName().toUpperCase();
        Function<String, String> theFirstName = name -> name.substring(0, name.indexOf(" "));

        Function chainedFunction = upperCase.andThen(theFirstName);

        System.out.println("printing out chained fxn: " + chainedFunction.apply(employees.get(0)));


        //BiFunction takes two arguments and returns one:
        BiFunction<String , Employee, String> concatAge = (String name, Employee employee) -> {
            return name.concat(" " + employee.getAge());
        };

        String upperName = upperCase.apply(employees.get(0));
        System.out.println(concatAge.apply(upperName, employees.get(0)));


        IntUnaryOperator incBy5 = i -> i+5;

        System.out.println(incBy5.applyAsInt(10));

    }


    private static String getName(Function<Employee, String > getName, Employee employee){

        return getName.apply(employee);

    }


    //predicates essentially act like array.filter condition

    private static void printEmployeesByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition){

        System.out.println(ageText);
        System.out.println("+++++++++++");

        for (Employee employee: employees){
            //to use the predicate to filter, you take its name.test eg ageCondition.test
            if (ageCondition.test(employee)){
                System.out.println(employee.getName());
            }
        }

//        employees.forEach(employee -> {
//            if(employee.getAge() > 29 ) {
//                System.out.println(employee.getName());
//                System.out.println(employee.getAge());
//            }
//        });

    }
}