package concurency_1;

public class HelloWorldPrinter implements Runnable {

    @Override
    public void run(){
        //Write a code that we want to execute from the new thread.
        System.out.println("Hello World Printer from Thread: "+Thread.currentThread().getName());
    }
}
