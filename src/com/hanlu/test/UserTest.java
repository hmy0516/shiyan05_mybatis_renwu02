package com.hanlu.test;

import com.hanlu.mapper.UserMapper;
import com.hanlu.mapper.impl.UserDaoImpl;
import org.junit.Test;

/**
 * @author HMY
 * @date 2018/12/24-20:47
 */
public class UserTest {
    @Test
    public void findUserById(){
        UserMapper userMapper=new UserDaoImpl();
        System.out.println(userMapper.findUserById(1));
    }
    @Test
    public void findUserById2(){
        UserMapper userMapper=new UserDaoImpl();
        System.out.println(userMapper.findUserById2(2));
    }
}
