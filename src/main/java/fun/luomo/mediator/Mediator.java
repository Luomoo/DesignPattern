package fun.luomo.mediator;

/**
 * @author Luomo
 * @date 2020/9/13 19:46
 */
public interface Mediator {
    void register(String dname,Department d);

    void command(String dname);



}
