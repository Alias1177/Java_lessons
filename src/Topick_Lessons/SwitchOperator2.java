package Topick_Lessons;

public class SwitchOperator2 {
    public static void main(String[] args) {
        int a =15;
        String s=switch (a){//Присваем переменной s значение "а" после выполнения свитч оператора
            case 1 ->"One is false case" ;
            case 14->"Second is false case";
            default ->"default" ;
        };
        System.out.println(s);
    }
}
