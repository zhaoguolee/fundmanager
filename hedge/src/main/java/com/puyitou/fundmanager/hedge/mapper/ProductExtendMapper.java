package com.puyitou.fundmanager.hedge.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.puyitou.fundmanager.hedge.model.product.ProductExtend;
import com.puyitou.fundmanager.hedge.model.product.ProductExtendExample;

public interface ProductExtendMapper {
    long countByExample(ProductExtendExample example);

    int deleteByExample(ProductExtendExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductExtend record);

    int insertSelective(ProductExtend record);

    List<ProductExtend> selectByExample(ProductExtendExample example);

    ProductExtend selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductExtend record, @Param("example") ProductExtendExample example);

    int updateByExample(@Param("record") ProductExtend record, @Param("example") ProductExtendExample example);

    int updateByPrimaryKeySelective(ProductExtend record);

    int updateByPrimaryKey(ProductExtend record);
}