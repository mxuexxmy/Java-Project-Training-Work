package xyz.mxue.user.repository.impl;

import xyz.mxue.user.domain.User;
import xyz.mxue.user.repository.DatabaseUserRepository;
import xyz.mxue.user.repository.UserRepository;
import xyz.mxue.user.sql.DBConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

/**
 * @author mxuexxmy
 * @date 3/3/2021$ 10:31 PM$
 */
public class UserRepositoryImpl implements UserRepository {

    @Override
    public boolean save(User user) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
         connection = null;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                }catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
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
