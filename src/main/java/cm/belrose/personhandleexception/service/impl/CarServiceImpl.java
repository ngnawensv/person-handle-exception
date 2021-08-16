package cm.belrose.personhandleexception.service.impl;

import cm.belrose.personhandleexception.dto.CarDto;
import cm.belrose.personhandleexception.repository.CarRepository;
import cm.belrose.personhandleexception.service.CarService;
import cm.belrose.personhandleexception.service.exception.CarServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class CarServiceImpl implements CarService {

    private CarRepository carRepository;

    @Autowired
    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public Optional<CarDto> save(CarDto c) {
        return Optional.of(CarDto.fromEntity(carRepository.save(CarDto.toEntity(c))));
    }

    @Override
    public Optional<CarDto> findById(Long id) throws CarServiceException {
        return Optional.of(carRepository.findById(id)
                .map(cat -> CarDto.fromEntity(cat))
                //.map(CarDto::fromEntity)
                .orElseThrow(() -> new CarServiceException("Car entity with " + id + " not found")));
    }

    @Override
    public List<CarDto> findAll() {
        return carRepository.findAll().stream().map(CarDto::fromEntity).collect(Collectors.toList());
    }

    @Override
    public void delete(Long id) {
        if (id == null) {
            return;
        }
        carRepository.deleteById(id);


    }
}
