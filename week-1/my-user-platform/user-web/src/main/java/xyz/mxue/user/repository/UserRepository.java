package xyz.mxue.user.repository;

import xyz.mxue.user.domain.User;

import java.util.Collection;

/**
 * @author mxuexxmy
 * 用户存储仓库
 * @since 1.0
 */
public interface UserRepository {

    boolean save(User user);

    boolean deleteById(Long userId);

    boolean update(User user);

    User getById(Long userId);

    User getByNameAndPassword(String userName, String password);

    Collection<User> getAll();
}
