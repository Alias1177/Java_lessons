package Scaner;

public class Person {
    private String name;//Указывает доступ эттой переменной

    public Person(String name) {
        this.name = name;// создаёт переменную
    }

    public String getName() {
        return name;//возврощает значение переменной
    }

    public void setName(String name) {
        this.name = name;// устанавливает значение в private String name;
    }
    public void fio(){
        System.out.println("Имя : " + name);//конкатинация

    }

}
