package AbstractClasses;

public abstract class Animal {

    private String name;

    public Animal(String name){
        this.name=name;
    }

    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}

//Use Abstract class when something is a something else (eg bird is an Animal)
//Use Interface is when something has a property
// Abstract classes enable us to re-use code (eg the getName()) without needing to Instantiate the class?

