package Topick_Lessons;

public class Continue_and_Break {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {//если нечётные цифры делить без остатка то получается 0, значит цикл проходит дальше
                continue;//прирывает цикл для чётных цифр и продолжает для нечётных
            }
            if (i > 7) {
                break;//если условие выше выполняется, остонавливавет цикл

            }
            System.out.println(i);
        }
    }
}