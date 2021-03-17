package xyz.mxue.projects.user.service.impl;

import xyz.mxue.projects.user.domain.User;
import xyz.mxue.projects.user.repository.UserRepository;
import xyz.mxue.projects.user.repository.impl.UserRepositoryImpl;
import xyz.mxue.projects.user.service.UserService;

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
