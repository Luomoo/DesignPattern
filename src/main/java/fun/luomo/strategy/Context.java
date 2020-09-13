package fun.luomo.strategy;

/**
 * @author Luomo
 * @date 2020/9/13 21:18
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void printPrice(double s) {
        System.out.println("报价" + strategy.getPrice(s));
    }

}
