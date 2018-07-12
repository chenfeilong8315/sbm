package com.importdata.mapper;

import com.importdata.pojo.VIntermSec;

public interface VIntermSecMapper{
    int deleteByPrimaryKey(String intermSecId);

    int insert(VIntermSec record);

    int insertSelective(VIntermSec record);

    VIntermSec selectByPrimaryKey(String intermSecId);

    int updateByPrimaryKeySelective(VIntermSec record);

    int updateByPrimaryKey(VIntermSec record);
}