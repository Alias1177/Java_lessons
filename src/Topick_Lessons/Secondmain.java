package Topick_Lessons;

public class Secondmain {
    public static void main(String[] args) {
        String name ="Alik";
        String name1="Alik";
        String name2= new String("Alik");
        System.out.println(name==name1);//выводит true , name1 является ссылкой на name
        System.out.println(name==name2);//выводит false , name2 является оригинальным значением
        System.out.println(name);
    }

}
