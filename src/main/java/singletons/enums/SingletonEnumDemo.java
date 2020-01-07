package singletons.enums;

public class SingletonEnumDemo {
    public static void main(String[] args) {
        SingletonEnum.values();
        System.out.println("*************************");
        System.out.println(SingletonEnum.getInstance());
    }
}
