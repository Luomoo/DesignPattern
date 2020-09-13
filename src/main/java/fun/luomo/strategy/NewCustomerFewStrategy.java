package fun.luomo.strategy;

/**
 * @author Luomo
 * @date 2020/9/13 21:16
 */
public class NewCustomerFewStrategy implements Strategy {

    @Override
    public double getPrice(double standardPrice) {
        System.out.println("不打折原价");
        return standardPrice;
    }
}
