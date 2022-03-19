package peaksoft.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import peaksoft.daos.CarDao;
import peaksoft.models.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarDao carDao;

//    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }

    @Override
    public void addCar(Car car) {
        carDao.addCar(car);
    }

    @Override
    public Car getById(Long id) {
        return carDao.getById(id);
    }

    @Override
    public void updateCar(Car car, Long id) {
        carDao.updateCar(car, id);
    }

    @Override
    public void deleteCar(Long id) {
        carDao.deleteCar(id);
    }

    @Override
    public Car get(Long id) {
        return carDao.get(id);
    }
}
