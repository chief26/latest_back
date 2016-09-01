package shaun.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import shaun.domain.Person;

/**
 * Created by Shaun Mesias on 2016/08/22.
 */
@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
}
