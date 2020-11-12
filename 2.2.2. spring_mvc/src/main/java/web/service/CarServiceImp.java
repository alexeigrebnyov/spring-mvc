package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class CarServiceImp implements CarService{
    @Override
    public List<Car> CAR_LIST(Integer count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 525, "Blue"));
        cars.add(new Car("VAZ", 2110, "Grey"));
        cars.add(new Car("GAZ", 2410, "White"));
        cars.add(new Car("BMW", 750, "Black"));
        cars.add(new Car("Mazda", 7, "Silver"));
        List<Car> cars1 = cars.stream().limit(count).collect(Collectors.toList());
        return count ==0 ? cars:cars1;
    }
}
