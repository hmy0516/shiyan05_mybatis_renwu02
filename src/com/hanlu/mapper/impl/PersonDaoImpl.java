package com.hanlu.mapper.impl;

import com.hanlu.mapper.IdCardMapper;
import com.hanlu.mapper.PersonMapper;
import com.hanlu.pojo.Person;
import com.hanlu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * @author HMY
 * @date 2018/12/22-8:29
 */
public class PersonDaoImpl implements PersonMapper {
    public Person findPersonById(int id){
        SqlSession session = null;
        Person person = null;
        try {
            session = MybatisUtils.getSession();
            PersonMapper personMapper = session.getMapper(PersonMapper.class);
            person = personMapper.findPersonById(id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MybatisUtils.closeSession();
        }
        return person;
    }

    @Override
    public Person findPersonById2(int id) {
        SqlSession session = null;
        Person person = null;
        try {
            session = MybatisUtils.getSession();
            PersonMapper personMapper = session.getMapper(PersonMapper.class);
            person = personMapper.findPersonById2(id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MybatisUtils.closeSession();
        }
        return person;
    }
}
