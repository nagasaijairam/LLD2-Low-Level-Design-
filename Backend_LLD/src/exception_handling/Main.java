package exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y = sc.nextInt();

        System.out.println(x/y); // if y == 0, will get '/ by zero' error
        sc.close();

        readFile("Jairam");
    }

    public static void readFile(String fileName) throws FileNotFoundException,NullPointerException, IOException {
        File file  = new File(fileName);
        FileReader fileReader = new FileReader(file);
        fileReader.read();
    }
}
