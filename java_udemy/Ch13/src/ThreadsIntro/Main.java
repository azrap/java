package ThreadsIntro;

import static ThreadColor.*;

public class Main {

    public static void main(String[] args){
        System.out.println(ANSI_RED + "Hello from main Thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("----another thread------");
        //enables JVM to start the run method from AnotherThread
        anotherThread.start();


        //anonymous thread below. if you run these threads, can't guarantee order in which they'll run
        new Thread(){
            public void run() {
                System.out.println( ANSI_PURPLE + "Hello from anon class thread");
            }
        }.start();

//the thread class takes a parameter in. You can input the MyRunnable class, then override it as an anonymous class below. If you replace the sout statement with super.run() it'll run the run method from MyRunnable.java
        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from the annon class implementation of run()");

                try{

                    //join() method gives another thing for the anotherThread to do after it finishes?
                    anotherThread.join(2000);//this makes it run after 2s pass instead of waiting for Another Thread to finish
                    System.out.println(ANSI_RED + "AnotherThread terminated or timed out, so I'm running due to the join above");
                } catch(InterruptedException e){
                    System.out.println(ANSI_RED + "I couldn't wait. I was interrupted");

                }
            }

        });

        myRunnableThread.start();
//        .interrupt triggers the catch in the try/catch for AnotherThread
        anotherThread.interrupt();


//        can't assume it'll run in the order it's written

        System.out.println(ANSI_CYAN + "Hello again from the main thread");

    }
}
