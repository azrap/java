package Interfaces;


public class DeskPhone implements ITelephhone {

    private int myNumber;
    private boolean isRinging = false;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;

    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, phone has no power button");

    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber );

    }

    @Override
    public void answer() {

        if(isRinging){
            System.out.println("answering the phone");
            isRinging=false;
        }
        else{
            System.out.println("phone is not ringing, cannot answer it");
        }


    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber  == myNumber){
            isRinging = true;
            System.out.println("Ring ring");
        } else {
            isRinging = false;
        }

        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}

//in order to be a valid class that is implementing another class, all the methods of the implemented class must
// be implemented. Can't delete any of the methods will get error