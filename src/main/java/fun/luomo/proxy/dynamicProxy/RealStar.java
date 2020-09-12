package fun.luomo.proxy.dynamicProxy;

/**
 * @author Luomo
 * @date 2020/9/12 9:24
 */
public class RealStar implements Star {
    @Override
    public void confer() {
        System.out.println("RealStar.confer");
    }

    @Override
    public void signContract() {
        System.out.println("RealStar.signContract");
    }

    @Override
    public void bookTicket() {
        System.out.println("RealStar.bookTicket");
    }

    @Override
    public void sing() {
        System.out.println("RealStar(本人).sing");
    }

    @Override
    public void collectMoney() {
        System.out.println("RealStar.collectMoney");
    }
}
