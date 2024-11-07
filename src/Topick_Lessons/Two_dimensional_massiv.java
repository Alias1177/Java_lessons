package Topick_Lessons;

//Двумерные массивы
public class Two_dimensional_massiv {
    public static void main(String[] args) {
        int[][]array=new int[5][5];
        for (int i = 0; i < array.length; i++) {//цикл для первого элемента массива "оболочка массива"
            for (int j = 0; j < array[i].length; j++) {// цикл для внутрянки массива
                array[i][j]=1;//заменяем дефолтовское инт на еденицы, обычная подмена значений массива

                System.out.print(array[i][j]+"");//конкатинация массива

            }
            System.out.println();

        }

    }
}
//Выводит пять нулей по горизонтаои и вертикали, образуя форму похожую на таблицу
//Если сделать подмену то можно изменить значения array[i][j]=1;