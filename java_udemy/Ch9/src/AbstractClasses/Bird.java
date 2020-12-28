package AbstractClasses;


//because it's an abstract class, you can't instantiate it directly
// eg can't go Bird bird = new Bird(name)
//
public abstract class Bird extends Animal implements CanFly {

    public Bird(String name){
        super(name);

    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " is breathing");

    }


    @Override
    public void fly(){
        System.out.println("I am flying like a Birdy bird wheeee");
    }

//    when you have an abstract class, you use abstract methods

}
