package cm.belrose.personhandleexception.controller;

import cm.belrose.personhandleexception.controller.exception.ResourceNotFoundException;
import cm.belrose.personhandleexception.dto.CarDto;
import cm.belrose.personhandleexception.service.CarService;
import cm.belrose.personhandleexception.service.exception.CarServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping(path = "/car")
    public Optional<CarDto> saveCar(@RequestBody CarDto car){
        return carService.save(car);
    }

    @GetMapping(path = "/car/{id}")
    public Optional<CarDto> findById(@PathVariable Long id) throws ResourceNotFoundException, CarServiceException {
        try {
            CarDto car = carService.findById(id).get();
            if (car == null) {
                throw new ResourceNotFoundException("Car not found");
            }
            return Optional.of(car);
        } catch (CarServiceException e) {
            throw  new CarServiceException("Internal Server Exception");
        }
    }


    @GetMapping(path = "/cars")
    public List<CarDto> findAll(){
        return carService.findAll();
    }
}
