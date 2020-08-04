package fun.luomo.factory.factorymethod;

/**
 * @author Luomo
 * @date 2020/8/4 15:00
 */
public class Client {
    public static void main(String[] args) {
        Car c1 = new AudiFactory().createCar();
        c1.run();
    }
}
