package cm.belrose.personhandleexception.service.impl;

import cm.belrose.personhandleexception.dto.PersonDto;
import cm.belrose.personhandleexception.model.Person;
import cm.belrose.personhandleexception.service.PersonService;

import java.util.List;
import java.util.Optional;

public class PersonServiceImpl implements PersonService {

    @Override
    public Optional<PersonDto> save(PersonDto p) {
        return Optional.empty();
    }

    @Override
    public Optional<PersonDto> findById(PersonDto p) {
        return Optional.empty();
    }

    @Override
    public List<PersonDto> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
