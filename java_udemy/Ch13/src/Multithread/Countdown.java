package Multithread;

import ThreadColor;

// this class has 1 method - doCountdown
class Countdown {
// instance variables access the heap memory. If you want multiple heads to share same object, you use the private instance
    private int i;
    public void doCountdown() {
        String color;

        switch (Thread.currentThread().getName()) {

            case "Thread 1":
                color = ThreadColor.ANSI_CYAN;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_PURPLE;
                break;
            default:
                color = ThreadColor.ANSI_GREEN;

        }

//        to synchronize a specific code-block put it inside a synchronized (this) block:
        synchronized (this) {
//            this part of the thread will be sure not to interfere with other parts of the thread
            for (i = 10; i > 0; i--) {
                System.out.println(color + Thread.currentThread().getName() + ": i = " + i);
            }
        }
    }
}
