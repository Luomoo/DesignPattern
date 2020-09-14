package fun.luomo.observer;

/**
 * @author Luomo
 * @date 2020/9/14 13:46
 */
public class ConcreteSubject extends Subject {

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.notifyAllObserver();
    }
}
