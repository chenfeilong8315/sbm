package com.importdata.mapper;

import com.importdata.pojo.VGenInfo;

public interface VGenInfoMapper{
    int deleteByPrimaryKey(String infoId);

    int insert(VGenInfo record);

    int insertSelective(VGenInfo record);

    VGenInfo selectByPrimaryKey(String infoId);

    int updateByPrimaryKeySelective(VGenInfo record);

    int updateByPrimaryKey(VGenInfo record);
}