package shaun.services;

import java.util.Set;

/**
 * Created by Shaun Mesias on 2016/08/16.
 */
public interface Services<E,ID> {
    E create(E entity);

    E readById(ID id);

    Set<E> readAll();

    E update(E entity);

    void delete(E entity);
}
