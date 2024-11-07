package Scaner;


import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);//считиваем информацию с консоли
        String name = sc.nextLine();//присваевает эту информацию переменной

        Person person = new Person(name);// эту переменную присваевать в конструктор
        person.fio();//выводить
    }


    }
// вводим в консоль имя и получаем результат