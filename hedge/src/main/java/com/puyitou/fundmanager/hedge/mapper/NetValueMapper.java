package com.puyitou.fundmanager.hedge.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.puyitou.fundmanager.hedge.model.product.NetValue;
import com.puyitou.fundmanager.hedge.model.product.NetValueExample;

public interface NetValueMapper {
    long countByExample(NetValueExample example);

    int deleteByExample(NetValueExample example);

    int deleteByPrimaryKey(String id);

    int insert(NetValue record);

    int insertSelective(NetValue record);

    List<NetValue> selectByExample(NetValueExample example);

    NetValue selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") NetValue record, @Param("example") NetValueExample example);

    int updateByExample(@Param("record") NetValue record, @Param("example") NetValueExample example);

    int updateByPrimaryKeySelective(NetValue record);

    int updateByPrimaryKey(NetValue record);
}