package fun.luomo.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Luomo
 * @date 2020/9/14 13:42
 */
public class Subject {
    protected List<Observer> list = new ArrayList<>();

    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    public void notifyAllObserver(){
        for (Observer observer : list) {
            observer.update(this);
        }
    }


}
