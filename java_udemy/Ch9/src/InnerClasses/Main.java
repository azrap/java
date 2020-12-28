package InnerClasses;



public class Main {

    public static void main (String[] args){
        Gearbox mcLaren = new Gearbox(6);
//        Note the new syntax below for making a new Gear class. needs to be mcLaren.new Gear
//        vs new Tear
       mcLaren.operateClutch(true);
       mcLaren.changeGear(1);
       mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(2);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(2000));;


    }
}
