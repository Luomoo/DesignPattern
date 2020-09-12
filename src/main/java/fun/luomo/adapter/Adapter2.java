package fun.luomo.adapter;

/**
 * 适配器
 *
 * @author Luomo
 * @date 2020/8/20 16:41
 */
public class Adapter2 implements Target {

    Adaptee adaptee;

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleRequest() {
        adaptee.request();
    }
}
