package fun.luomo.observer;

/**
 * @author Luomo
 * @date 2020/9/14 13:47
 */
public class ObserverA implements Observer {
    private int myState;

    @Override
    public void update(Subject subject) {
        myState = ((ConcreteSubject) subject).getState();
    }

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }
}
