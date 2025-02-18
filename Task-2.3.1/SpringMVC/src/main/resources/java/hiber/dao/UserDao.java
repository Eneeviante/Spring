package hiber.dao;

import hiber.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    User findById(Long id);
    List<User> getAll();
    void update(long id, User user);
    void delete(long id);
}
