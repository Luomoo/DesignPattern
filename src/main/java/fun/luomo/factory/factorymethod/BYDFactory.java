package fun.luomo.factory.factorymethod;

/**
 * @author Luomo
 * @date 2020/8/4 14:56
 */
public class BYDFactory implements carFactory {
    @Override
    public Car createCar() {
        return new BYD();
    }

}
