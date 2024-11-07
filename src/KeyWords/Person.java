package KeyWords;

public class Person {

//    public final double PI;
    public static int Cout=0;

    private String name;//Указывает доступ эттой переменной

    public Person(String name) {
        this.name = name;// создаёт переменную
        Cout++;
//        PI=3.14;

    }

    public String getName() {
        return name;//возврощает значение переменной
    }

    public void setName(String name) {//name указвает на просто переменную name что снизу
        this.name = name;// this -указывает значение в private String name;
    }
    public void fio(){
        System.out.println("Имя : " + name);

    }

}
