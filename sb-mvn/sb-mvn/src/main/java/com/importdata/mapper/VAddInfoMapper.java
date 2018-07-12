package com.importdata.mapper;

import com.importdata.pojo.VAddInfo;

public interface VAddInfoMapper{
    int deleteByPrimaryKey(String addinfoId);

    int insert(VAddInfo record);

    int insertSelective(VAddInfo record);

    VAddInfo selectByPrimaryKey(String addinfoId);

    int updateByPrimaryKeySelective(VAddInfo record);

    int updateByPrimaryKey(VAddInfo record);
}