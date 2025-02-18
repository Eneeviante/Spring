package hiber.service;

import hiber.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    User findById(Long id);
    List<User> getAll();
    void update(long id, User user);
    void delete(long id);
}
