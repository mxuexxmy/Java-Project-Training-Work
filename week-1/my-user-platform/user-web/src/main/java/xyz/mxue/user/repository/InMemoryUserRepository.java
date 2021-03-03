package xyz.mxue.user.repository;

import xyz.mxue.user.domain.User;

import java.util.Collection;

/**
 * @author mxuexxmy
 * @date 3/3/2021$ 8:01 PM$
 */
public class InMemoryUserRepository implements UserRepository{

    @Override
    public boolean save(User user) {
        return false;
    }

    @Override
    public boolean deleteById(Long userId) {
        return false;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public User getById(Long userId) {
        return null;
    }

    @Override
    public User getByNameAndPassword(String userName, String password) {
        return null;
    }

    @Override
    public Collection<User> getAll() {
        return null;
    }
}
