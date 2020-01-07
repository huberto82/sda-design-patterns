package singletons.lazy;

public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {
        System.out.println("SingletonLazy instantiated");
    }

    public static SingletonLazy getInstance() {
        if(instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }
}
