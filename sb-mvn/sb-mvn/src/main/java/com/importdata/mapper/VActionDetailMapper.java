package com.importdata.mapper;

import com.importdata.pojo.VActionDetail;

public interface VActionDetailMapper{
    int deleteByPrimaryKey(String detailId);

    int insert(VActionDetail record);

    int insertSelective(VActionDetail record);

    VActionDetail selectByPrimaryKey(String detailId);

    int updateByPrimaryKeySelective(VActionDetail record);

    int updateByPrimaryKey(VActionDetail record);
}