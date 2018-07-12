package com.importdata.mapper;

import com.importdata.pojo.VActionOptionE1a;

public interface VActionOptionE1aMapper{
    int deleteByPrimaryKey(String e1aCaoptnId);

    int insert(VActionOptionE1a record);

    int insertSelective(VActionOptionE1a record);

    VActionOptionE1a selectByPrimaryKey(String e1aCaoptnId);

    int updateByPrimaryKeySelective(VActionOptionE1a record);

    int updateByPrimaryKey(VActionOptionE1a record);
}