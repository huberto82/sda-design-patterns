package singletons;

public class SingletonStaticBlock {
    public static final String CONST = "CONST EXAMPlE";
    private static final SingletonStaticBlock INSTANCE;

    static {
        System.out.println("static block executed");
        INSTANCE = new SingletonStaticBlock();
    }

    private SingletonStaticBlock(){
        System.out.println("Singleton created");
    }

    static public SingletonStaticBlock getInstance(){
        return INSTANCE;
    }
}