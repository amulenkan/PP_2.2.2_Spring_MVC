package web.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import web.models.Car;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(1, "Mazda", "red"));
        cars.add(new Car(2, "Toyota", "silver"));
        cars.add(new Car(3, "Nissan", "black"));
        cars.add(new Car(4, "Mitsubishi", "white"));
        cars.add(new Car(5, "Subaru", "green"));
    }

    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
