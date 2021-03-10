package xyz.mxue.user.service;

import xyz.mxue.user.domain.User;

/**
 * @author mxuexxmy
 * 用户服务
 */
public interface UserService {

    /**
     * 注册用户
     *
     * @param user 用户对象
     * @return 成功返回<code>true</code>
     * @author mxuexxmy
     */
    boolean register(User user);

    /**
     * 注销用户
     *
     * @param user 用户对象
     * @return 成功返回<code>true</code>
     * @author mxuexxmy
     */
    boolean deregister(User user);

    /**
     * 更新用户信息
     *
     * @param user 用户对象
     * @return 成功返回<code>true</code>
     * @author mxuexxmy
     */
    boolean update(User user);

    /**
     * 通过用户ID查询用户信息
     *
     * @param id 用户ID
     * @return User
     * @author mxuexxmy
     */
    User queryUserById(Long id);

    /**
     * 通过姓名和密码查询用户信息
     *
     * @param name 用户名
     * @param password 密码
     * @return User
     * @author mxuexxmy
     */
    User queryUserByNameAndPassword(String name, String password);

    /**
     * 通过姓名查询用户信息
     *
     * @param name 用户名
     * @return User
     * @author mxuexxmy
     */
    User queryUserByName(String name);
}
