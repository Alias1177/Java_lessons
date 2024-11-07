package package2;

public class TestAccess {
    public static void main(String[] args) {
        AccessLevell obj =new AccessLevell();

        System.out.println(obj.publicVar);
        System.out.println(obj.protectedVar);
        System.out.println(obj.defoult);
       // System.out.println(obj.privateVr);не могу получить доступ изза ограничения private
    }


}
