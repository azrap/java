package Interfaces;

public class MobilePhone implements ITelephhone {

    private int myNumber;
    private boolean isRinging = false;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;

    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone powered up");

    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn){
        System.out.println("Now ringing " + phoneNumber );
        }
        else{
            System.out.println("Phone is switched off");
        }

    }

    @Override
    public void answer() {

        if(isRinging){
            System.out.println("answering the Mobile phone");
            isRinging=false;
        }
        else{
            System.out.println(" Mobile phone is not ringing, cannot answer it");
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber  == myNumber && isOn){
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
