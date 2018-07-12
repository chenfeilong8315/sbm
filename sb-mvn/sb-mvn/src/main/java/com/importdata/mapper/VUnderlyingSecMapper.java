package com.importdata.mapper;

import com.importdata.pojo.VUnderlyingSec;

public interface VUnderlyingSecMapper{
    int deleteByPrimaryKey(String usecuId);

    int insert(VUnderlyingSec record);

    int insertSelective(VUnderlyingSec record);

    VUnderlyingSec selectByPrimaryKey(String usecuId);

    int updateByPrimaryKeySelective(VUnderlyingSec record);

    int updateByPrimaryKey(VUnderlyingSec record);
}