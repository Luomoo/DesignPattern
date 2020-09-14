package fun.luomo.memento;

/**
 * @author Luomo
 * @date 2020/9/14 14:06
 */
public class Client {
    public static void main(String[] args) {
        CareTaker taker = new CareTaker();
        Emp emp = new Emp("AAA", 10, 100);
        System.out.println("第一次打印：" + emp);
        taker.setMemento(emp.memento());

        emp.setAge(12);
        emp.setEname("BBB");
        emp.setSalary(200);
        System.out.println("第二次打印：" + emp);

        emp.recovery(taker.getMemento());

        System.out.println("第三次打印：" + emp);
    }
}
