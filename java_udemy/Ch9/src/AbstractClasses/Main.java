package AbstractClasses;

public class Main {

    public static void main (String [] args) {

        Dog boba = new Dog("Golden Retriever");

        boba.breathe();
        boba.eat();

        Parrot squaks = new Parrot("Yago");

        squaks.breathe();
        squaks.eat();
        squaks.fly();


    }
}
