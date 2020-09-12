package fun.luomo.chainOfResp;

/**
 * @author Luomo
 * @date 2020/9/12 19:02
 */
public class GeneralManager extends Leader {


    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void HandleRequest(LeaveRequest request) {
        if (request.getLeaveDays() < 30) {
            System.out.println("员工：" + request.getEmpName() + "请假" + request.getLeaveDays() + "天");
            System.out.println("总经理：" + this.name + "审批通过 ");
        } else {
            System.out.println("请假不通过");
        }
    }
}

