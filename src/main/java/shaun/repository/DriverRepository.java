package shaun.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import shaun.domain.Driver;

/**
 * Created by Shaun Mesias on 2016/08/16.
 */
@Repository
public interface DriverRepository extends CrudRepository<Driver, Long>{
}
