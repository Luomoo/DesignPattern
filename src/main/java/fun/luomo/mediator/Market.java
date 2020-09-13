package fun.luomo.mediator;

/**
 * @author Luomo
 * @date 2020/9/13 19:59
 */
public class Market implements Department {

    private Mediator m;

    public Market(Mediator m) {
        this.m = m;
        m.register("market", this);
    }

    @Override
    public void selfAction() {
        System.out.println("接项目");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作,项目承接进度，需要资金");

        m.command("financial");
    }
}
