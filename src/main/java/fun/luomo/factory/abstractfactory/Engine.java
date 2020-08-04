package fun.luomo.factory.abstractfactory;

/**
 * @author Luomo
 * @date 2020/8/4 16:02
 */
public interface Engine {
    void run();

    void start();
}

class LuxuryEngine implements Engine {

    @Override
    public void run() {
        System.out.println("启动快");
    }

    @Override
    public void start() {
        System.out.println("自动启停");
    }
}

class LowEngine implements Engine {

    @Override
    public void run() {
        System.out.println("启动慢");
    }

    @Override
    public void start() {
        System.out.println("手动启停");
    }
}