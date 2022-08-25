package pl.mirekgab.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    @Autowired
    CarRepository carRepository;

    public Page<Car> findAll(Pageable pageable) {
        return carRepository.findAll(pageable);
    }

    public void save(Car car) {
        carRepository.save(car);
    }
}
