package xyz.mxue.user.service.impl;

import xyz.mxue.user.domain.User;
import xyz.mxue.user.repository.UserRepository;
import xyz.mxue.user.repository.impl.UserRepositoryImpl;
import xyz.mxue.user.service.UserService;

/**
 * @author mxuexxmy
 */
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(){
        userRepository = new UserRepositoryImpl();
    }

    @Override
    public boolean register(User user) {
        if (queryUserByName(user.getName()) != null) {
            return false;
        }
        return userRepository.save(user);
    }

    @Override
    public boolean deregister(User user) {
        return false;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public User queryUserById(Long id) {
        return null;
    }

    @Override
    public User queryUserByNameAndPassword(String name, String password) {
        return null;
    }

    @Override
    public User queryUserByName(String name) {
        return userRepository.getByName(name);
    }
}
