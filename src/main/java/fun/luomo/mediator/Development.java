package fun.luomo.mediator;

/**
 * @author Luomo
 * @date 2020/9/13 19:59
 */
public class Development implements Department {

    private Mediator m;

    public Development(Mediator m) {
        this.m = m;
        m.register("development", this);
    }

    @Override
    public void selfAction() {
        System.out.println("专心科研");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作，需要资金");
    }
}
