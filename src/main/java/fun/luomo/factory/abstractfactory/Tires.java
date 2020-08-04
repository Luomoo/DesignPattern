package fun.luomo.factory.abstractfactory;

/**
 * @author Luomo
 * @date 2020/8/4 16:06
 */
public interface Tires {
    void revolve();
}

class LuxuryTires implements Tires {

    @Override
    public void revolve() {
        System.out.println("旋转快");
    }
}

class LowTires implements Tires {

    @Override
    public void revolve() {
        System.out.println("旋转慢");
    }
}