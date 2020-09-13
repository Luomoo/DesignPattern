package fun.luomo.mediator;

/**
 * @author Luomo
 * @date 2020/9/13 20:12
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new President();

        Market market = new Market(mediator);
        Development development = new Development(mediator);
        Financial financial = new Financial(mediator);

        market.selfAction();
        market.outAction();
    }
}
