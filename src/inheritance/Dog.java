package inheritance;


public class Dog extends Animal{
    public String color;
    public Dog(String name, int age,String color) {
        super(name, age);
        this.color=color;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!!!");
    }
    public  void overload(){
        System.out.println("Empty");
    }
    public  void overload(String name){
        System.out.println("Name : "+ name);
    }
}
