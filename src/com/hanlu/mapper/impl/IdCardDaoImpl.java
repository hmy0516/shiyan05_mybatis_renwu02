package com.hanlu.mapper.impl;

import com.hanlu.mapper.IdCardMapper;
import com.hanlu.pojo.IdCard;
import com.hanlu.pojo.Person;
import com.hanlu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * @author HMY
 * @date 2018/12/22-8:29
 */
public class IdCardDaoImpl implements IdCardMapper {
    public IdCard findCodeById(int id){
        SqlSession session = null;
        IdCard idCard = null;
        try {
            session = MybatisUtils.getSession();
            IdCardMapper mapper = session.getMapper(IdCardMapper.class);
            idCard = mapper.findCodeById(id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MybatisUtils.closeSession();
        }
        return idCard;
    }
}
