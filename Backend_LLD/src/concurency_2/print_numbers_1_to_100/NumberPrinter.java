package concurency_2.print_numbers_1_to_100;

public class NumberPrinter implements Runnable {
    private int number;

    NumberPrinter(int number){
        this.number = number;

    }

    public void run(){
        System.out.println(number+ " is printed by the thread: "+Thread.currentThread().getName());
    }

}
