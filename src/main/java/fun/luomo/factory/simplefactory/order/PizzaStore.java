package fun.luomo.factory.simplefactory.order;

/**
 * @author Luomo
 * @date 2020/7/22 10:18
 */
public class PizzaStore {
    public static void main(String[] args) {

//        new OrderPizza();
        new OrderPizza(new SimpleFactory());
        System.out.println("退出");

    }

}
