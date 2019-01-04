package com.hanlu.mapper;

import com.hanlu.pojo.User;

/**
 * @author HMY
 * @date 2018/12/24-20:37
 */
public interface UserMapper {
    public User findUserById(int id);
    public User findUserById2(int id);
    public User findUserById3(int id);
}
