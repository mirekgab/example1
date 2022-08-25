package pl.mirekgab.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {
    @Autowired
    CarService carService;


    @GetMapping("/")
    public ResponseEntity<Page<Car>> list(@RequestParam(defaultValue = "0") Integer pageNumber,
                                          @RequestParam(defaultValue = "2") Integer pageSize) {

        Page page = carService.findAll(PageRequest.of(pageNumber, pageSize));
        return new ResponseEntity(page, HttpStatus.OK);
    }



    @GetMapping("/add")
    public String addCars() {
        carService.save(new Car("name1", "model1"));
        carService.save(new Car("name2", "model2"));
        carService.save(new Car("name3", "model3"));
        carService.save(new Car("name4", "model4"));
        carService.save(new Car("name5", "model5"));
        carService.save(new Car("name6", "model6"));
        return "ok";
    }
}
