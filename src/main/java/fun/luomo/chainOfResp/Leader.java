package fun.luomo.chainOfResp;

/**
 * @author Luomo
 * @date 2020/9/12 18:59
 */
public abstract class Leader {
    protected String name;
    protected Leader nextLeader;

    public Leader(String name) {
        this.name = name;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    public abstract void HandleRequest(LeaveRequest request);
}
