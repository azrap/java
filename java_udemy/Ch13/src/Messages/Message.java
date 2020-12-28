package Messages;

class Message {
    private String message;
    private boolean empty = true;


//    read method reads the message from the Message class
// syncrhonized because we don't want another thread to be running

    public synchronized String read() {
        while (empty) {
            try{
                wait();
            } catch (InterruptedException e){

            }

        }
        empty = true;
        notifyAll();
        return message;
    }


//    write method writes the message to the Message class


    public synchronized void write(String message) {

// while loop gets triggered to if message.write() has just been run, setting empty = false;

        while (!empty) {

            try{
                //wait until empty gets set to true on the read() via the notifyAll;
                wait();
            } catch (InterruptedException e){

            }

        }

        empty = false;
        this.message = message;
        notifyAll();

    }
}
