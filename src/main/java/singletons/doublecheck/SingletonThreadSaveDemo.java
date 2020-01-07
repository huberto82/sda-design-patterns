package singletons.doublecheck;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class SingletonThreadSaveDemo {
    public static void main(String[] args) {
        SingletonThreadSafe singleton = SingletonThreadSafe.getInstance();
    }
}
