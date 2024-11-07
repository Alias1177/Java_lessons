package Topick_Lessons;

public class NewOperators {
    public static void main(String[] args) {
        int example =15;
        int secondexamle=17;
        if (example>5){//создаём условие, спрашиваем example>5, если true, тогда двигаемся дальше
            example+=10;// записываем и прибавляем новое значение в переменную
            // если условия false то тогда мы не двигаемя дальше, и выводим изначальное значение переменной
        }else{//если условие false, тогда выполняется
            example-=10;
        }

        if (secondexamle>20){
            System.out.println("1 блок");
        }else if(secondexamle==19){
            System.out.println("2 блок");
        }else{
            System.out.println("secondexamle absolutly false :( ");
        }
        System.out.println(example);
    }
}
