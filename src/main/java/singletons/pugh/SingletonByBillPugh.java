package singletons.pugh;

public class SingletonByBillPugh {
    public static final String CONSTANCE = "CONSTANCE EXAMPLE";
    private String name = "Singleton by Bill Pugh";
    private SingletonByBillPugh() {
        System.out.println("Singleton By Bill Pugh instantiated");
    }
    private static class SingletonHolder {
        private static SingletonByBillPugh instance = new SingletonByBillPugh();
    }

    public static SingletonByBillPugh getInstance() {
        return SingletonHolder.instance;
    }

    public String getName() {
        return name;
    }
}
