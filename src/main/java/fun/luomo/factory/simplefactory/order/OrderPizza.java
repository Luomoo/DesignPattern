package fun.luomo.factory.simplefactory.order;

import fun.luomo.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Luomo
 * @date 2020/7/22 10:11
 */
public class OrderPizza {

   /* public OrderPizza() {
        Pizza pizza = null;

        String orderType;
        do {
            orderType = gettype();

            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName("希腊");
            } else if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName("奶酪");
            } else if (orderType.equals("pepper")) {
                pizza = new PepperPizza();
                pizza.setName("胡椒");
            } else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }*/

    SimpleFactory factory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory factory) {
        setFactory(factory);

    }

    public void setFactory(SimpleFactory factory) {
        String orderType = "";
        this.factory = factory;

        do {

            orderType = gettype();
            pizza = this.factory.createPizza(orderType);

            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("失败");
                break;
            }

        } while (true);
    }


    private String gettype() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = reader.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }

    }
}
