package Printer;

public class Printer {

    private String name;
//we don't want toner level to be <0 and >100
//    initializing defaults with the constructor is better/safter for the fields
    private int tonerLevel=100;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(String name, int tonerLevel, int pagesPrinted, boolean duplex) {
        this.name = name;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex
        ;


        if (tonerLevel > 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }




    }

   public void fillToner(){
        if (tonerLevel > 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
       System.out.println("Your toner has been filled back up to " + tonerLevel + " %");
    }

    public void printPages(int numPages){
        if (numPages>0){
        this.pagesPrinted+=numPages;

    }
        else{
        numPages = 0;
        }

        System.out.println("Just printed " + numPages + " pages");
    }
}
