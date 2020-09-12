package fun.luomo.proxy.staticProxy;

/**
 * @author Luomo
 * @date 2020/9/12 9:27
 */
public class Client {

    public static void main(String[] args) {
        RealStar real = new RealStar();
        Star proxy = new ProxyStar(real);

        proxy.confer();
        proxy.signContract();
        proxy.bookTicket();
        proxy.sing();
        proxy.collectMoney();

    }
}
