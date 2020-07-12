package fun.luomo.singleton;

/**
 * @author Luomo
 * @date 2020/7/12 17:27
 */
public class SingletonTest01 {
    public static void main(String[] args) {

    }
}

class Singleton {

    private Singleton() {

    }

    private final static Singleton instance = new Singleton();

}
