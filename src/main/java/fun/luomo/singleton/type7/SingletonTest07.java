package fun.luomo.singleton.type7;

import org.junit.Test;

/**
 * @author Luomo
 * @date 2020/7/12 22:17
 */
public class SingletonTest07 {
    @Test
    public void fun1(){
        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;
        System.out.println("singleton1.hashCode() = " + singleton1.hashCode());
        System.out.println("singleton2.hashCode() = " + singleton2.hashCode());
        singleton1.sayOK();
        singleton2.sayOK();
    }
}

enum Singleton {
    INSTANCE;

    public void sayOK() {
        System.out.println("ok!");
    }
}
