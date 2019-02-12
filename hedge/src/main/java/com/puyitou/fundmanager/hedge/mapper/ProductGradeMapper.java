package com.puyitou.fundmanager.hedge.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.puyitou.fundmanager.hedge.model.product.ProductGrade;
import com.puyitou.fundmanager.hedge.model.product.ProductGradeExample;

public interface ProductGradeMapper {
    long countByExample(ProductGradeExample example);

    int deleteByExample(ProductGradeExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProductGrade record);

    int insertSelective(ProductGrade record);

    List<ProductGrade> selectByExample(ProductGradeExample example);

    ProductGrade selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProductGrade record, @Param("example") ProductGradeExample example);

    int updateByExample(@Param("record") ProductGrade record, @Param("example") ProductGradeExample example);

    int updateByPrimaryKeySelective(ProductGrade record);

    int updateByPrimaryKey(ProductGrade record);
}