package cm.belrose.personhandleexception.service;

import cm.belrose.personhandleexception.dto.PersonDto;
import cm.belrose.personhandleexception.model.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {

    Optional<PersonDto> save(PersonDto p);

    Optional<PersonDto> findById(PersonDto p);

    List<PersonDto> findAll();

    void delete(Long id);
}
