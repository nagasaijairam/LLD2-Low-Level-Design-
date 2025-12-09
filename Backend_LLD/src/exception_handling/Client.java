package exception_handling;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Client {
    public static void main(String args[]){
        try{
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x/y);

            File f = new File("hello.txt");
            FileReader fr = new FileReader(f);

        }catch(IOException e){
            System.out.println("Hello I GOT A IO_ERROR FOR YOU --> " + e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("Hello I GOT A ERROR FOR YOU --> " + e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("Hello I GOT A INPUT_ERROR FOR YOU --> " + e.getMessage());
        }finally{
            System.out.println("Goodbye!");
        }
    }
}
