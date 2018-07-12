package com.importdata.mapper;

import com.importdata.pojo.VActionOptionE2;

public interface VActionOptionE2Mapper{
    int deleteByPrimaryKey(String e2CaoptnId);

    int insert(VActionOptionE2 record);

    int insertSelective(VActionOptionE2 record);

    VActionOptionE2 selectByPrimaryKey(String e2CaoptnId);

    int updateByPrimaryKeySelective(VActionOptionE2 record);

    int updateByPrimaryKey(VActionOptionE2 record);
}