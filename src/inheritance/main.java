package inheritance;

public class main {
    public static void main(String[] args) {
        Dog bobik= new Dog("Bobik",2,"Grey");
        bobik.makeSound();

        Animal animal= new Animal("Animal",12);
        animal.makeSound();
        bobik.overload();
        bobik.overload("Bobok");// перегрузка методов
    }



}
