package peaksoft.daos;

import peaksoft.models.Car;

import java.util.List;

public interface CarDao {

    List<Car> getAllCars();

    void addCar(Car car);

    Car getById(Long id);

    void updateCar(Car car, Long id);

    void deleteCar(Long id);

    Car get(Long id);
}
