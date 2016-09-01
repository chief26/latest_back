package shaun.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shaun.domain.Person;
import shaun.repository.PersonRepository;
import shaun.services.IPersonService;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Shaun Mesias on 2016/08/22.
 */
@Service
public class PersonServiceImpl implements IPersonService{
    @Autowired
    PersonRepository repository;

    @Override
    public Person create(Person entity) {
        return repository.save(entity);
    }

    @Override
    public Person readById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Set<Person> readAll() {
        Iterable<Person> personIterable = repository.findAll();
        Set<Person> result = new HashSet<Person>();
        for (Person person : personIterable) {
            result.add(person);
        }
        return result;
    }

    @Override
    public Person update(Person entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Person entity) {
        repository.delete(entity);
    }
}
