package com.puyitou.fundmanager.hedge.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.puyitou.fundmanager.hedge.model.product.ProductFee;
import com.puyitou.fundmanager.hedge.model.product.ProductFeeExample;

public interface ProductFeeMapper {
    long countByExample(ProductFeeExample example);

    int deleteByExample(ProductFeeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductFee record);

    int insertSelective(ProductFee record);

    List<ProductFee> selectByExample(ProductFeeExample example);

    ProductFee selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductFee record, @Param("example") ProductFeeExample example);

    int updateByExample(@Param("record") ProductFee record, @Param("example") ProductFeeExample example);

    int updateByPrimaryKeySelective(ProductFee record);

    int updateByPrimaryKey(ProductFee record);
}