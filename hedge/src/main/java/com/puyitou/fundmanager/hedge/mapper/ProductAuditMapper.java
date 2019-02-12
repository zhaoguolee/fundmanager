package com.puyitou.fundmanager.hedge.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.puyitou.fundmanager.hedge.model.product.ProductAudit;
import com.puyitou.fundmanager.hedge.model.product.ProductAuditExample;

public interface ProductAuditMapper {
    long countByExample(ProductAuditExample example);

    int deleteByExample(ProductAuditExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProductAudit record);

    int insertSelective(ProductAudit record);

    List<ProductAudit> selectByExample(ProductAuditExample example);

    ProductAudit selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProductAudit record, @Param("example") ProductAuditExample example);

    int updateByExample(@Param("record") ProductAudit record, @Param("example") ProductAuditExample example);

    int updateByPrimaryKeySelective(ProductAudit record);

    int updateByPrimaryKey(ProductAudit record);
}