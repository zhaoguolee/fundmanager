package com.puyitou.fundmanager.hedge.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.puyitou.fundmanager.hedge.model.product.ProductAttachment;
import com.puyitou.fundmanager.hedge.model.product.ProductAttachmentExample;

public interface ProductAttachmentMapper {
    long countByExample(ProductAttachmentExample example);

    int deleteByExample(ProductAttachmentExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProductAttachment record);

    int insertSelective(ProductAttachment record);

    List<ProductAttachment> selectByExample(ProductAttachmentExample example);

    ProductAttachment selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProductAttachment record, @Param("example") ProductAttachmentExample example);

    int updateByExample(@Param("record") ProductAttachment record, @Param("example") ProductAttachmentExample example);

    int updateByPrimaryKeySelective(ProductAttachment record);

    int updateByPrimaryKey(ProductAttachment record);
}