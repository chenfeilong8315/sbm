package com.importdata.mapper;

import com.importdata.pojo.VGenInfoA1;

public interface VGenInfoA1Mapper{
    int deleteByPrimaryKey(String a1InfoId);

    int insert(VGenInfoA1 record);

    int insertSelective(VGenInfoA1 record);

    VGenInfoA1 selectByPrimaryKey(String a1InfoId);

    int updateByPrimaryKeySelective(VGenInfoA1 record);

    int updateByPrimaryKey(VGenInfoA1 record);
}