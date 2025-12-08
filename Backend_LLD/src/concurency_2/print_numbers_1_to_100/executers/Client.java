package concurency_2.print_numbers_1_to_100.executers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService executerService = Executors.newFixedThreadPool(10);
        for (int i = 0; i <= 100; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            executerService.submit(numberPrinter);
        }
    }
}
