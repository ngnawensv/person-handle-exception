package cm.belrose.personhandleexception.repository;

import cm.belrose.personhandleexception.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
