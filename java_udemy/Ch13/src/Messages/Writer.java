package Messages;

import java.util.Random;

//producer class:
class Writer implements Runnable {
    private Message message;

    public Writer(Message message) {
        this.message = message;

    }

    public void run() {
        String messages[] = {
                "Humpty dumpty sat on a wall",
                "Humpty dumpty had a great fall",
                "All the kings horses and all the king's men",
                "Couldn't put humpty together again"

        };

        Random random = new Random();

        for (int i = 0; i < messages.length; i++) {
            message.write(messages[i]);

            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e) {


            }
        }
        message.write("finished");

    }
}
