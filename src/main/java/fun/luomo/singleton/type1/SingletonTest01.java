package fun.luomo.singleton.type1;

import org.junit.Test;

/**
 * @author Luomo
 * @date 2020/7/12 17:27
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        System.out.println("111");
    }

   @Test
    public void fun1() {
        System.out.println("111");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Singleton instance3 = Singleton.getInstance();
        System.out.println("instance1 = " + instance1);
        System.out.println("instance2 = " + instance2);
        System.out.println("instance3 = " + instance3);
    }
}

class Singleton {
    private final static Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }

}
