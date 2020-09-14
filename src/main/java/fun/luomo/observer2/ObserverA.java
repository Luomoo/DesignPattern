package fun.luomo.observer2;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Luomo
 * @date 2020/9/14 13:47
 */
public class ObserverA implements Observer {
    private int myState;

    @Override
    public void update(Observable o, Object arg) {
        myState = ((ConcreteSubject) o).getState();
    }

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }
}
