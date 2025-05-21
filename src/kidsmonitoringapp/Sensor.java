package kidsmonitoringapp;

import java.util.ArrayList;
import java.util.List;

public class Sensor {
    private List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void detectActivity(String data) {
        if ("danger".equalsIgnoreCase(data)) {
            notifyObservers("Dangerous activity detected!");
        }
    }

    private void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }
}
