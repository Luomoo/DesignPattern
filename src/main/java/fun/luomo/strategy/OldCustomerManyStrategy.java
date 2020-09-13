package fun.luomo.strategy;

/**
 * @author Luomo
 * @date 2020/9/13 21:16
 */
public class OldCustomerManyStrategy implements Strategy {

    @Override
    public double getPrice(double standardPrice) {
        System.out.println("打八折");
        return standardPrice * 0.80;
    }
    
}
