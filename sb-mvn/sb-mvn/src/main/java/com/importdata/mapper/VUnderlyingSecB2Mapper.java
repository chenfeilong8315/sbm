package com.importdata.mapper;

import com.importdata.pojo.VUnderlyingSecB2;

public interface VUnderlyingSecB2Mapper{
    int deleteByPrimaryKey(String b2UsecuId);

    int insert(VUnderlyingSecB2 record);

    int insertSelective(VUnderlyingSecB2 record);

    VUnderlyingSecB2 selectByPrimaryKey(String b2UsecuId);

    int updateByPrimaryKeySelective(VUnderlyingSecB2 record);

    int updateByPrimaryKey(VUnderlyingSecB2 record);
}