package com.hanlu.mapper.impl;

import com.hanlu.mapper.UserMapper;
import com.hanlu.pojo.User;
import com.hanlu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * @author HMY
 * @date 2018/12/24-20:46
 */
public class UserDaoImpl implements UserMapper {
    @Override
    public User findUserById(int id) {
        User user = null;
        try {
            SqlSession sqlSession = MybatisUtils.getSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            user = userMapper.findUserById(id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MybatisUtils.closeSession();
        }
        return user;
    }

    @Override
    public User findUserById2(int id) {
        User userById2 = null;
        try {
            SqlSession session = MybatisUtils.getSession();
            UserMapper userMapper = session.getMapper(UserMapper.class);
            userById2 = userMapper.findUserById2(id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MybatisUtils.closeSession();
        }
        return userById2;
    }

    @Override
    public User findUserById3(int id) {
        SqlSession sqlSession = MybatisUtils.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User userById3 = userMapper.findUserById3(id);
        return userById3;
    }
}
