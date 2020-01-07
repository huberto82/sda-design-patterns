package singletons.eager;

public class SingletonEager{
    private String name;
    private static final SingletonEager instance = new SingletonEager();
    public static final String CONSTANCE = "CONSTANCE EXAMPLE";
    private SingletonEager(){
        this.name = "Singleton eager";
        System.out.println("SingletonEager instantiated");
    }
    static public SingletonEager getInstance(){
        return instance;
    }

    public String getName() {
        return name;
    }
}