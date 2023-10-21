import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class WeatherSubject implements Subject{

    private List<Observer> observers = new ArrayList<Observer>();

    private String temperature;

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        System.out.println("start to send temperature: " + temperature);
        for (Observer observer : observers) {
            observer.receive(this.temperature);
        }
    }
}
