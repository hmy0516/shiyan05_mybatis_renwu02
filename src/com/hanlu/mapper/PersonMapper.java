package com.hanlu.mapper;

import com.hanlu.pojo.Person;

/**
 * @author HMY
 * @date 2018/12/21-9:49
 */
public interface PersonMapper {
    public Person findPersonById(int id);
    public Person findPersonById2(int id);
}
