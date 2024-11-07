//checked exception

package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        File file= new File("text.txt");
        try {
            Scanner scanner= new Scanner(file);
            System.out.println("SMT");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("100%");
        }
    }
}
