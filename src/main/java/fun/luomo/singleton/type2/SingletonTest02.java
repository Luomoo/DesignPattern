package fun.luomo.singleton.type2;

import org.junit.Test;

/**
 * @author Luomo
 * @date 2020/7/12 17:27
 */
public class SingletonTest02 {
    public static void main(String[] args) {
        System.out.println("111");
    }

    @Test
    public void fun1() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("instance1 = " + instance1);
        System.out.println("instance2 = " + instance2);
    }
}

class Singleton {
    private static Singleton instance;

    private Singleton() {

    }
    static {
        instance = new Singleton();
    }

    public static Singleton getInstance() {
        return instance;
    }

}
