package sample;

import java.util.LinkedList;
import java.util.List;

public class Model {
    private  int count ;
    public interface Listener{
        void onChange(Model model);
    }
    private List<Listener> listeners= new LinkedList<>();
    public void addListener(Listener listener){
        listeners.add(listener);

    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
        notifyObservers();
    }

    private void notifyObservers() {
        listeners.stream().forEach(l -> {l.onChange(this);});
    }
}
