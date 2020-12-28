package ProducerConsumer;

import java.util.List;
import java.util.Random;



public class Main {
    public static void main(String[] args) {
    }



}


class MyProducer implements Runnable {

    private List<String> buffer;
    private String color;

    public MyProducer(List<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }

    public void run() {

    }
}
