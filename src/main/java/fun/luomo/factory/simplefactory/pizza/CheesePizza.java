package fun.luomo.factory.simplefactory.pizza;

/**
 * @author Luomo
 * @date 2020/7/22 10:09
 */
public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("给奶酪披萨准备材料");
    }
}
