package Topick_Lessons;

public class Massiv {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {//цикл будет выполнятся столько раз сколько длина массива i<array.lenght
            array[i] = i;
            System.out.println(array[i]);

        }
        String[] str = {"One", "Two", "Tree"};
        for (int i = 0; i < str.length; i++) {
            array[i] = i;
            System.out.println(str[i]);

        }
        str[1] = "Five";//замена индекса массива
        for (int i = 0; i < str.length; i++) {
            array[i] = i;
            System.out.println(str[i]);
        }
    }
}
//Обьяснение в тетради Example