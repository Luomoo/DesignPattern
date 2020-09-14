package fun.luomo.observer2;

import java.util.Observable;

/**
 * @author Luomo
 * @date 2020/9/14 13:54
 */
public class ConcreteSubject extends Observable {

    private int state;

    public void set(int s){
        state = s;
        setChanged();
        notifyObservers(state);
    }

    public int getState() {
        return state;
    }

}
