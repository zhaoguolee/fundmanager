package com.puyitou.fundmanager.hedge.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.puyitou.fundmanager.hedge.model.product.RefManagerProductExample;
import com.puyitou.fundmanager.hedge.model.product.RefManagerProductKey;

public interface RefManagerProductMapper {
    long countByExample(RefManagerProductExample example);

    int deleteByExample(RefManagerProductExample example);

    int deleteByPrimaryKey(RefManagerProductKey key);

    int insert(RefManagerProductKey record);

    int insertSelective(RefManagerProductKey record);

    List<RefManagerProductKey> selectByExample(RefManagerProductExample example);

    int updateByExampleSelective(@Param("record") RefManagerProductKey record, @Param("example") RefManagerProductExample example);

    int updateByExample(@Param("record") RefManagerProductKey record, @Param("example") RefManagerProductExample example);
}