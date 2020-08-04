package fun.luomo.factory.simplefactory.pizza;

/**
 * @author Luomo
 * @date 2020/7/22 10:10
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给希腊披萨准备材料");
    }
}
