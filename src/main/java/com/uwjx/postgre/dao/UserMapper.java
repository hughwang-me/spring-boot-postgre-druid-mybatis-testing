package com.uwjx.postgre.dao;

import com.uwjx.postgre.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author  Wang Huan
 * @author  18501667737@163.com
 * @date  2021/3/8 14:43
 *
 */

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    List<User> list();

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
