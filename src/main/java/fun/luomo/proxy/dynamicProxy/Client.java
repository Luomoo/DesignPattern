package fun.luomo.proxy.dynamicProxy;


import java.lang.reflect.Proxy;

/**
 * @author Luomo
 * @date 2020/9/12 9:43
 */
public class Client {
    public static void main(String[] args) {
        Star realStar = new RealStar();

        StarHandler handler = new StarHandler(realStar);

        Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                new Class[]{Star.class},
                handler);

        proxy.sing();

    }
}
