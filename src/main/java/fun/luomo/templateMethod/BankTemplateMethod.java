package fun.luomo.templateMethod;

/**
 * @author Luomo
 * @date 2020/9/13 21:26
 */
public abstract class BankTemplateMethod {
    public void takeNumber() {
        System.out.println("取号");
    }

    public abstract void transact();

    public void evaluate() {
        System.out.println("反馈评分");
    }

    public final void process() {
        this.takeNumber();

        this.transact();

        this.evaluate();

    }
}
