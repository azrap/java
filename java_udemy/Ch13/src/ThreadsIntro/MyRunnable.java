package ThreadsIntro;

import static ThreadColor.ANSI_GREEN;

public class MyRunnable implements Runnable{

    @Override
    public void run() {

        System.out.println( ANSI_GREEN + "Hello from myRunnable implementation of run");
    }
}

