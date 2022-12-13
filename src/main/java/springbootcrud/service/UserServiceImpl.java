package springbootcrud.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springbootcrud.model.User;
import springbootcrud.repository.UserRepository;

import java.util.List;


@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService{


    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUser(long id) {
        return userRepository.getReferenceById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userRepository.saveAndFlush(user);
    }

    @Override
    @Transactional
    public void removeUserById() {
        userRepository.deleteAllInBatch();
    }
}
