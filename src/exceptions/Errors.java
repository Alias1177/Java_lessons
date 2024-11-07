package exceptions;

public class Errors {
    public static void main(String[] args) {
        int i=1;
        StackOverflowGenirator(i);

    }
    public static  int StackOverflowGenirator(int i){
       return StackOverflowGenirator(i);

    }


}
