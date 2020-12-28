package Multithread;

public class Main {
    public static void main(String[] args) {

        //start a new countdown class
        Countdown countdown1 = new Countdown();
//        Countdown countdown2 = new Countdown();

        //new countdown thread
        CountdownThread t1 = new CountdownThread(countdown1);

        //set its name
        t1.setName("Thread 1");
        CountdownThread t2 = new CountdownThread(countdown1);
        t2.setName("Thread 2");

//        start runs the run method of t1, which just triggers the countdown in the Countdown class
        t1.start();

        t2.start();

    }


}

// create a thread
class CountdownThread extends Thread {
    private Countdown threadCountdown;

    // take in the
    public CountdownThread(Countdown countdown){
        threadCountdown = countdown;

    }

    public void run(){
        threadCountdown.doCountdown();
    }
}
