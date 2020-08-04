package fun.luomo.factory.abstractfactory;

/**
 * @author Luomo
 * @date 2020/8/4 16:04
 */
public interface Seat {
    void massage();
}

class LuxurySeat implements Seat{

    @Override
    public void massage() {
        System.out.println("可以按摩");
    }
}
class LowSeat implements Seat{

    @Override
    public void massage() {
        System.out.println("不能按摩");
    }
}