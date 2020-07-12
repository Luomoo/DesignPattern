package fun.luomo.singleton.type4;

import org.junit.Test;

/**
 * @author Luomo
 * @date 2020/7/12 18:14
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        System.out.println("123asd");
        System.out.println("哈哈哈哈");
    }

    @Test
    public void fun1() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("懒汉式");
        System.out.println("instance1 = " + instance1);
        System.out.println("instance2 = " + instance2);
    }
}

class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
