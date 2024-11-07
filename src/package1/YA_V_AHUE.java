package package1;

import package2.AccessLevell;

public class YA_V_AHUE  extends AccessLevell{// extends- указывыю что класс YA_V_AHUE является наследником класса AccessLevell
    public static void main(String[] args) {
        AccessLevell obj =new AccessLevell();
        System.out.println(obj.publicVar);//даёт носту только к публичной переменной
    }
    public void Protect(){
        System.out.println(protectedVar);// получили доступ за счёт наследования

    }
}
