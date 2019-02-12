package com.puyitou.fundmanager.hedge.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.puyitou.fundmanager.hedge.model.product.ProductOpen;
import com.puyitou.fundmanager.hedge.model.product.ProductOpenExample;

public interface ProductOpenMapper {
    long countByExample(ProductOpenExample example);

    int deleteByExample(ProductOpenExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProductOpen record);

    int insertSelective(ProductOpen record);

    List<ProductOpen> selectByExample(ProductOpenExample example);

    ProductOpen selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProductOpen record, @Param("example") ProductOpenExample example);

    int updateByExample(@Param("record") ProductOpen record, @Param("example") ProductOpenExample example);

    int updateByPrimaryKeySelective(ProductOpen record);

    int updateByPrimaryKey(ProductOpen record);
}