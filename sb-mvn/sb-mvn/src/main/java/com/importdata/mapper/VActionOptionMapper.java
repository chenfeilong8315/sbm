package com.importdata.mapper;

import com.importdata.pojo.VActionOption;

public interface VActionOptionMapper{
    int deleteByPrimaryKey(String caoptnId);

    int insert(VActionOption record);

    int insertSelective(VActionOption record);

    VActionOption selectByPrimaryKey(String caoptnId);

    int updateByPrimaryKeySelective(VActionOption record);

    int updateByPrimaryKey(VActionOption record);
}