package fun.luomo.singleton.type6;

import org.junit.Test;

/**
 * @author Luomo
 * @date 2020/7/12 18:14
 */
public class SingletonTest06 {
    public static void main(String[] args) {
        System.out.println("123asd");
        System.out.println("哈哈哈哈");
    }

    @Test
    public void fun1() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("静态内部类");
        System.out.println("instance1 = " + instance1);
        System.out.println("instance2 = " + instance2);
    }
}

class Singleton {

    private Singleton() {
    }
    //jvm类装载机制
    private static class SingletonInstance{
        public static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }

}
