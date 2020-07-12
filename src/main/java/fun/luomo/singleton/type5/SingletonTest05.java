package fun.luomo.singleton.type5;

import org.junit.Test;

/**
 * @author Luomo
 * @date 2020/7/12 18:14
 */
public class SingletonTest05 {
    public static void main(String[] args) {
        System.out.println("123asd");
        System.out.println("哈哈哈哈");
    }

    @Test
    public void fun1() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("双重检查");
        System.out.println("instance1 = " + instance1);
        System.out.println("instance2 = " + instance2);
    }
}

class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
