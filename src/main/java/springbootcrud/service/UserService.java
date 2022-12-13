package springbootcrud.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springbootcrud.model.User;
import springbootcrud.repository.UserRepository;

import java.util.List;


@Service
@Transactional(readOnly = true)
public class UserService {


    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(long id) {
        return userRepository.getReferenceById(id);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Transactional
    public void saveUser(User user) {
        userRepository.saveAndFlush(user);
    }

    @Transactional
    public void removeUserById() {
        userRepository.deleteAllInBatch();
    }
}
