package fun.luomo.strategy;

/**
 * @author Luomo
 * @date 2020/9/13 21:18
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context(new NewCustomerManyStrategy());
        context.printPrice(1000);

    }
}
