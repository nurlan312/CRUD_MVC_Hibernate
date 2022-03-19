package peaksoft.services;

import peaksoft.models.Car;

import java.util.List;

public interface CarService {

    List<Car> getAllCars();

    void addCar(Car car);

    Car getById(Long id);

    void updateCar(Car car, Long id);

    void deleteCar(Long id);

    Car get(Long id);
}
