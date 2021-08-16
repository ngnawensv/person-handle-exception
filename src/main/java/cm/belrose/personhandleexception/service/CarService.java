package cm.belrose.personhandleexception.service;

import cm.belrose.personhandleexception.dto.CarDto;
import cm.belrose.personhandleexception.model.Car;
import cm.belrose.personhandleexception.service.exception.CarServiceException;

import java.util.List;
import java.util.Optional;

public interface CarService {

    Optional<CarDto> save(CarDto c);

    Optional<CarDto> findById(Long id) throws CarServiceException;

    List<CarDto> findAll();

    void delete(Long id);
}
