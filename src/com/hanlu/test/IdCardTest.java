package com.hanlu.test;

import com.hanlu.mapper.IdCardMapper;
import com.hanlu.mapper.impl.IdCardDaoImpl;
import com.hanlu.pojo.IdCard;
import com.hanlu.pojo.Person;
import org.junit.Test;

/**
 * @author HMY
 * @date 2018/12/22-8:34
 */
public class IdCardTest {

    @Test
    public void findPersonById(){
        IdCardMapper idCardMapper = new IdCardDaoImpl();
        IdCard idCard = idCardMapper.findCodeById(1);
        System.out.println(idCard);
    }
}
