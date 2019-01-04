package com.hanlu.mapper;

import com.hanlu.mapper.impl.IdCardDaoImpl;
import com.hanlu.pojo.IdCard;
import com.hanlu.pojo.Person;

/**
 * @author HMY
 * @date 2018/12/21-9:49
 */
public interface IdCardMapper {
    public IdCard findCodeById(int id);
}
