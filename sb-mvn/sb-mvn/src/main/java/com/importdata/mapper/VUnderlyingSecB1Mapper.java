package com.importdata.mapper;

import com.importdata.pojo.VUnderlyingSecB1;

public interface VUnderlyingSecB1Mapper{
    int deleteByPrimaryKey(String b1UsecuId);

    int insert(VUnderlyingSecB1 record);

    int insertSelective(VUnderlyingSecB1 record);

    VUnderlyingSecB1 selectByPrimaryKey(String b1UsecuId);

    int updateByPrimaryKeySelective(VUnderlyingSecB1 record);

    int updateByPrimaryKey(VUnderlyingSecB1 record);
}