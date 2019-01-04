package com.hanlu.test;

import com.hanlu.mapper.IdCardMapper;
import com.hanlu.mapper.PersonMapper;
import com.hanlu.mapper.impl.IdCardDaoImpl;
import com.hanlu.mapper.impl.PersonDaoImpl;
import com.hanlu.pojo.Person;
import org.junit.Test;

/**
 * @author HMY
 * @date 2018/12/22-8:34
 */
public class PersonTest {

    @Test
    public void findPersonById(){
        PersonMapper personMapper = new PersonDaoImpl();
        Person person = personMapper.findPersonById(2);
        System.out.println(person);
    }
    @Test
    public void findPersonById2(){
        PersonMapper personMapper = new PersonDaoImpl();
        Person person = personMapper.findPersonById2(1);
        //System.out.println(person.getAge());
        System.out.println(person);
    }
}
