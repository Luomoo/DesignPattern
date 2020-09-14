package fun.luomo.templateMethod;

/**
 * @author Luomo
 * @date 2020/9/13 21:28
 */
public class Client {
    public static void main(String[] args) {
        BankTemplateMethod btm = new DrawMoney();
        btm.process();
        BankTemplateMethod btm2 = new BankTemplateMethod() {
            @Override
            public void transact() {
                System.out.println("存钱");
            }
        };
        btm2.process();

    }
}

class DrawMoney extends BankTemplateMethod{

    @Override
    public void transact() {
        System.out.println("取款");
    }
}
