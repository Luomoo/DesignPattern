package fun.luomo.adapter;

/**
 * @author Luomo
 * @date 2020/8/20 16:40
 */
public class Client {
    public void test1(Target t){
        t.handleRequest();
    }

    public static void main(String[] args) {
        Client c = new Client();

//        Adaptee adaptee = new Adaptee();
//
//        Target target = new Adapter();
//
//        c.test1(target);

        Adaptee adaptee = new Adaptee();

        Target target = new Adapter2(adaptee);

        c.test1(target);




    }
}
