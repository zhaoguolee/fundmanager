package com.puyitou.fundmanager.hedge.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.puyitou.fundmanager.hedge.model.product.ProductOpenAudit;
import com.puyitou.fundmanager.hedge.model.product.ProductOpenAuditExample;

public interface ProductOpenAuditMapper {
    long countByExample(ProductOpenAuditExample example);

    int deleteByExample(ProductOpenAuditExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductOpenAudit record);

    int insertSelective(ProductOpenAudit record);

    List<ProductOpenAudit> selectByExample(ProductOpenAuditExample example);

    ProductOpenAudit selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductOpenAudit record, @Param("example") ProductOpenAuditExample example);

    int updateByExample(@Param("record") ProductOpenAudit record, @Param("example") ProductOpenAuditExample example);

    int updateByPrimaryKeySelective(ProductOpenAudit record);

    int updateByPrimaryKey(ProductOpenAudit record);
}