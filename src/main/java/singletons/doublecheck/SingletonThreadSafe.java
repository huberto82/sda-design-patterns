package singletons.doublecheck;

public class SingletonThreadSafe {
    private static SingletonThreadSafe instance;

    private SingletonThreadSafe(){
        System.out.println("SingletonThreadSave instantiated");
    }
    public static SingletonThreadSafe getInstance() {
        if (instance == null) {
            synchronized (SingletonThreadSafe.class) {
                if (instance == null) {
                    instance = new SingletonThreadSafe();
                }
            }
        }
        return instance;
    }
}
