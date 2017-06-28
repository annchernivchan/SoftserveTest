package example.dao;

import java.util.List;

public interface InterfaceDao<T> {

    T getById(String id);
    List<T> getAll();
    void create(T entity);
    T update(T entity);
    void delete(T entity);
    void deleteById(String entityId);

}
