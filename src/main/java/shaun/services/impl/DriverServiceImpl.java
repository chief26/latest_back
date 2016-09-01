package shaun.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shaun.domain.Driver;
import shaun.repository.DriverRepository;
import shaun.services.IDriverService;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Shaun Mesias on 2016/08/16.
 */
@Service
public class DriverServiceImpl implements IDriverService {
    @Autowired
    DriverRepository repository;

    @Override
    public Driver create(Driver entity) {
        return repository.save(entity);
    }

    @Override
    public Driver readById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Set<Driver> readAll() {
        Iterable<Driver> driverIterable = repository.findAll();
        Set<Driver> result = new HashSet<Driver>();
        for (Driver driver : driverIterable) {
            result.add(driver);
        }
        return result;
    }

    @Override
    public Driver update(Driver entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Driver entity) {
        repository.delete(entity);
    }
}
