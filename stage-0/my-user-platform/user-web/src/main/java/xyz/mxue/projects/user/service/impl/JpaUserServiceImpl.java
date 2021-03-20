package xyz.mxue.projects.user.service.impl;

import xyz.mxue.projects.user.domain.User;
import xyz.mxue.projects.user.service.UserService;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.validation.Validator;

/**
 * @author mxuexxmy
 * jpa 用户服务实现
 */
public class JpaUserServiceImpl implements UserService {

    @Resource(name = "bean/EntityManager")
    private EntityManager entityManager;

    @Resource(name = "bean/Validator")
    private Validator validator;

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

    @Override
    public User queryUserByName(String name) {
        return null;
    }
}
