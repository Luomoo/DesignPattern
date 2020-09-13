package fun.luomo.mediator;

/**
 * @author Luomo
 * @date 2020/9/13 19:59
 */
public class Financial implements Department {

    private Mediator m;

    public Financial(Mediator m) {
        this.m = m;
        m.register("financial", this);
    }

    @Override
    public void selfAction() {
        System.out.println("数钱");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作");
    }
}
