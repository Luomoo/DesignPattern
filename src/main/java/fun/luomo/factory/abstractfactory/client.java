package fun.luomo.factory.abstractfactory;

/**
 * @author Luomo
 * @date 2020/8/4 16:12
 */
public class client {
    public static void main(String[] args) {
        CarFactory factory = new LuxuryCarFactory();
        Engine engine = factory.createEngine();
        engine.run();
        engine.start();
    }
}
