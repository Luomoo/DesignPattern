package fun.luomo.adapter;

/**
 * 适配器
 *
 * @author Luomo
 * @date 2020/8/20 16:41
 */
public class Adapter extends Adaptee implements Target {


    @Override
    public void handleRequest() {
        super.request();
    }
}
