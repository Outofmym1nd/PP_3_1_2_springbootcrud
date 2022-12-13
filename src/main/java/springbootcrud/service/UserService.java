package springbootcrud.service;

import springbootcrud.model.User;

import java.util.List;

public interface UserService {

    User getUser(long id);

    List<User> getAllUsers();

    void saveUser(User user);

    void removeUserById();
}
