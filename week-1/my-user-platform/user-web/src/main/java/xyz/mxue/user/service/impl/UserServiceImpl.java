package xyz.mxue.user.service.impl;

import xyz.mxue.user.domain.User;
import xyz.mxue.user.service.UserService;

/**
 * @author mxuexxmy
 */
public class UserServiceImpl implements UserService {

    @Override
    public boolean register(User user) {
        return false;
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
}
