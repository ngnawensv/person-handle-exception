package cm.belrose.personhandleexception.repository;

import cm.belrose.personhandleexception.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long> {
}
