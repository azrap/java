package ThreadsIntro;


import static ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread {



    @Override
    public void run() {
        System.out.println( ANSI_BLUE + " Hello from another thread" + currentThread().getName()) ;

        try{
            Thread.sleep(5000);
        } catch(InterruptedException e){
            System.out.println(ANSI_BLUE + "another thread interrupted and woke me up");
            return;
        }

        System.out.println(ANSI_BLUE + "Five seconds have passed I'm awake");


    }
}
