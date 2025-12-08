package concurency_2.print_numbers_1_to_100.executers;


public class NumberPrinter implements Runnable {
//    public static void main(String[] args) {
//
//    }
    private int number;
    NumberPrinter(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Printing number: "+ number +"From thread"+ Thread.currentThread().getName());
    }
}
