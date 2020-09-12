package fun.luomo.bridge;

/**
 * @author Luomo
 * @date 2020/9/12 10:07
 */
public class Client {
    public static void main(String[] args) {
        Computer c = new Laptop(new Lenovo());
        c.sale();
    }
}
