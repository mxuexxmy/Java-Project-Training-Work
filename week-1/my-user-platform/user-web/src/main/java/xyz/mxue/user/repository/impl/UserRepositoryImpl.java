package xyz.mxue.user.repository.impl;

import xyz.mxue.user.domain.User;
import xyz.mxue.user.repository.DatabaseUserRepository;
import xyz.mxue.user.repository.UserRepository;
import xyz.mxue.user.sql.DBConnectionManager;

import java.sql.*;
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
            String databaseURL = "jdbc:derby:/db/my-user-platform;create=true";
            connection = DriverManager.getConnection(databaseURL);
            statement = connection.prepareStatement(DBConnectionManager.INSERT_ONE_USER_INFO);
            statement.setString(1, user.getName());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getEmail());
            statement.setString(4, user.getPhoneNumber());
            int row = statement.executeUpdate();
            if (row > 0) {
                return true;
            }

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
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            String databaseURL = "jdbc:derby:/db/my-user-platform;create=true";
            connection = DriverManager.getConnection(databaseURL);
            statement = connection.prepareStatement(DBConnectionManager.QUERY_ONE_USER_INFO);
            statement.setString(1, userName);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            User user = new User();
            while (resultSet.next()) {
                user.setId(resultSet.getLong("id"));
                user.setName(resultSet.getString("name"));
                user.setPassword(resultSet.getString("password"));
                user.setEmail(resultSet.getString("email"));
                user.setPhoneNumber(resultSet.getString("phoneNumber"));
            }
            return user;
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
        return null;
    }

    @Override
    public Collection<User> getAll() {
        return null;
    }

    @Override
    public User getByName(String name) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            String databaseURL = "jdbc:derby:/db/my-user-platform;create=true";
            connection = DriverManager.getConnection(databaseURL);
            statement = connection.prepareStatement(DBConnectionManager.QUERY_USER_INFO_BY_NAME);
            statement.setString(1, name);
            ResultSet resultSet = statement.executeQuery();
            User user = new User();
            while (resultSet.next()) {
                user.setId(resultSet.getLong("id"));
                user.setName(resultSet.getString("name"));
                user.setPassword(resultSet.getString("password"));
                user.setEmail(resultSet.getString("email"));
                user.setPhoneNumber(resultSet.getString("phoneNumber"));
            }
            return user;
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
        return null;
    }
}
