package singletons;
public class SingletonStaticBlockDemo {
    public static void main(String[] args) {
        System.out.println(SingletonStaticBlock.CONST);
        System.out.println("***************");
        System.out.println(SingletonStaticBlock.getInstance());
    }
}
