package fun.luomo.chainOfResp;

/**
 * @author Luomo
 * @date 2020/9/12 19:08
 */
public class Client {
    public static void main(String[] args) {
        Leader a = new Director("张三");
        Leader b = new Manager("李四");
        Leader c = new GeneralManager("王五");

        a.setNextLeader(b);
        b.setNextLeader(c);

        LeaveRequest request1 = new LeaveRequest("Tom", 100, "回家");
        a.HandleRequest(request1);

    }
}
