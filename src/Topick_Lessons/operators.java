package Topick_Lessons;

public class operators {
    public static void main(String[] args) {
        int p=21;
        int l= 32;
        int k = 12;
        System.out.println(p!=l);//сравнивает две переменных
        System.out.println(p>=l);
        System.out.println(p<=l);
        System.out.println(p>l);
        System.out.println(p<l);
        System.out.println(p==l);
        System.out.println(p==l && l ==k);//&&-и   добовляет условие (l==k????) если хоть одно значение ровно false, выводит false
        System.out.println(p==l || l ==k);//   ||-или, если хоть одно значение ровно true, выводит true




        int i =1;//создали переменную
         i=i+1;//записали в неё новое значение
        i++;//присой значение переменной на еденицу больше
        i--;//присой значение переменной на еденицу меньше
        i+=5;//анологично записи i=i+1,только прибавляет 5
        i-=3;//анологично записи i=i+1,только отнимает 3
        System.out.println(i);// вывели новое значение переменной


        int a=1;
        int b= 2;
        int c = a+b;
        double x = (double) a/b;//(double) для чёткого приведения к типу переменной
        int y = a*b;
        int g = a-b;
        int o = a%b;// остаток по делению

        System.out.println(c);
        System.out.println(x);
        System.out.println(y);
        System.out.println(g);
        System.out.println(o);
    }
}
