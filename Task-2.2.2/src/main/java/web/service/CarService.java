package web.service;

import web.model.Car;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarService {
    private List<Car> cars;

    public CarService() {
        cars = Arrays.asList(
                new Car("Rayfield", "Aerondight S9", 2075),
                new Car("Quadra", "Turbo-R 740", 2072),
                new Car("Mizutani", "Shion MZ2", 2070),
                new Car("Thorton", "Galena Rattler", 2068),
                new Car("Chevillon", "Emperor 620 Ragnar", 2073)
        );
    }

    public List<Car> getCars(int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
