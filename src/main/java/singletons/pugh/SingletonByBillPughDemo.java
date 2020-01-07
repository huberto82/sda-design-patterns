package singletons.pugh;

public class SingletonByBillPughDemo {
    public static void main(String[] args) {
        System.out.println(SingletonByBillPugh.CONSTANCE);
        System.out.println("*****************");
        System.out.println( SingletonByBillPugh.getInstance().getName());
        System.out.println("*****************");
        System.out.println( SingletonByBillPugh.getInstance().getName());
    }
}
