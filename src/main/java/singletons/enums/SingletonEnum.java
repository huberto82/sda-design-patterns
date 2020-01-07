package singletons.enums;

enum SingletonEnum {
    INSTANCE;
    SingletonEnum(){
        System.out.println("Singleton instance created");
    }
    public static SingletonEnum getInstance(){
        return INSTANCE;
    }
}
