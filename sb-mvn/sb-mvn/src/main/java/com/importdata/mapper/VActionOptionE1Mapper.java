package com.importdata.mapper;

import com.importdata.pojo.VActionOptionE1;

public interface VActionOptionE1Mapper{
    int deleteByPrimaryKey(String e1CaoptnId);

    int insert(VActionOptionE1 record);

    int insertSelective(VActionOptionE1 record);

    VActionOptionE1 selectByPrimaryKey(String e1CaoptnId);

    int updateByPrimaryKeySelective(VActionOptionE1 record);

    int updateByPrimaryKey(VActionOptionE1 record);
}