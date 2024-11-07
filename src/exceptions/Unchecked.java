package exceptions;

import java.util.Scanner;

public class Unchecked {
    public static void main(String[] args) {
        int number = 10;
        Scanner scanner= new Scanner(System.in);
       int i= scanner.nextInt();
        System.out.println(number/i);


    }
}
