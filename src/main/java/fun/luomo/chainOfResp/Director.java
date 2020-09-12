package fun.luomo.chainOfResp;

/**
 * @author Luomo
 * @date 2020/9/12 19:02
 */
public class Director extends Leader {


    public Director(String name) {
        super(name);
    }

    @Override
    public void HandleRequest(LeaveRequest request) {
        if (request.getLeaveDays() < 3) {
            System.out.println("员工：" + request.getEmpName() + "请假" + request.getLeaveDays() + "天");
            System.out.println("主任：" + this.name + "审批通过 ");
        } else {
            if (this.nextLeader != null) {
                this.nextLeader.HandleRequest(request);

            }
        }
    }
}

