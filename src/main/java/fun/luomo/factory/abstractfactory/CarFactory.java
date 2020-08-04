package fun.luomo.factory.abstractfactory;

/**
 * @author Luomo
 * @date 2020/8/4 16:09
 */
public interface CarFactory {
    Engine createEngine();

    Seat createSeat();

    Tires createTires();
}

