package InnerClasses;


// static nested classes
// local classes
// inner classes
// anonymous classes


import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear=0;
    private boolean clutchIsIn;

    public Gearbox(int maxGears){
        this.maxGears=maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);

        for (int i=0; i<maxGears; i++){
            addGear(i,i*5.3);
        }

    }



    public void operateClutch(boolean in){
        this.clutchIsIn = in;
    }
    public void addGear(int number, double ratio){
        if(number>0 && number <= maxGears){
            this.gears.add(new Gear(number,ratio));
        }

    }

    public void changeGear(int newGear){
        if(newGear>=0 && (newGear<this.gears.size() && this.clutchIsIn)){
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + "selected. ");

        }
        else {
            System.out.println("Grind!!");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs){
        if(clutchIsIn){
            System.out.println("SCREEAMMM");
            return 0.0;
        }
        return revs*gears.get(currentGear).getRatio();
    }

    private class Gear {
//        ensure you are not naming inner Class fields the same as outer class fields
//        (eg GearNum vs currentGear)
        private int gearNum;
        private double ratio;

        public Gear(int gearNum, double ratio) {

            this.gearNum = gearNum;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int revs){
            return revs * (this.ratio);
        }
    }

}
