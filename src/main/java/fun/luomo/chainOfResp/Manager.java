package fun.luomo.chainOfResp;

/**
 * @author Luomo
 * @date 2020/9/12 19:02
 */
public class Manager extends Leader {


    public Manager(String name) {
        super(name);
    }

    @Override
    public void HandleRequest(LeaveRequest request) {
        if (request.getLeaveDays() < 10) {
            System.out.println("员工：" + request.getEmpName() + "请假" + request.getLeaveDays() + "天");
            System.out.println("经理：" + this.name + "审批通过 ");
        } else {
            if (this.nextLeader != null) {
                this.nextLeader.HandleRequest(request);

            }
        }
    }
}

