package fun.luomo.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Luomo
 * @date 2020/9/13 20:10
 */
public class President implements Mediator {

    private Map<String, Department> map = new HashMap<>();


    @Override
    public void register(String dname, Department d) {
        map.put(dname, d);
    }

    @Override
    public void command(String dname) {
        map.get(dname).selfAction();

    }
}
