package fun.luomo.factory.simplefactory.order;

import fun.luomo.factory.simplefactory.pizza.Pizza;
import fun.luomo.factory.simplefactory.pizza.CheesePizza;
import fun.luomo.factory.simplefactory.pizza.GreekPizza;
import fun.luomo.factory.simplefactory.pizza.PepperPizza;

/**
 * @author Luomo
 * @date 2020/7/22 10:25
 */
public class SimpleFactory {
    public Pizza createPizza(String orderType) {

        System.out.println("简单工厂模式");
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒");
        }

        return pizza;

    }

}
