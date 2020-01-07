package singletons.eager;



public class SingletonEagerDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("**************************");
        System.out.println(SingletonEager.CONSTANCE);
        System.out.println("**************************");
        System.out.println(SingletonEager.getInstance().getName());
    }
}
