package com.puyitou.fundmanager.hedge.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.puyitou.fundmanager.hedge.model.product.AgencyProduct;
import com.puyitou.fundmanager.hedge.model.product.AgencyProductExample;

public interface AgencyProductMapper {
    long countByExample(AgencyProductExample example);

    int deleteByExample(AgencyProductExample example);

    int deleteByPrimaryKey(String id);

    int insert(AgencyProduct record);

    int insertSelective(AgencyProduct record);

    List<AgencyProduct> selectByExample(AgencyProductExample example);

    AgencyProduct selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AgencyProduct record, @Param("example") AgencyProductExample example);

    int updateByExample(@Param("record") AgencyProduct record, @Param("example") AgencyProductExample example);

    int updateByPrimaryKeySelective(AgencyProduct record);

    int updateByPrimaryKey(AgencyProduct record);
}