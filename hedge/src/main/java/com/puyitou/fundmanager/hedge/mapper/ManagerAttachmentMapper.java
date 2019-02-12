package com.puyitou.fundmanager.hedge.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.puyitou.fundmanager.hedge.model.manager.ManagerAttachment;
import com.puyitou.fundmanager.hedge.model.manager.ManagerAttachmentExample;

public interface ManagerAttachmentMapper {
    long countByExample(ManagerAttachmentExample example);

    int deleteByExample(ManagerAttachmentExample example);

    int deleteByPrimaryKey(String id);

    int insert(ManagerAttachment record);

    int insertSelective(ManagerAttachment record);

    List<ManagerAttachment> selectByExample(ManagerAttachmentExample example);

    ManagerAttachment selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ManagerAttachment record, @Param("example") ManagerAttachmentExample example);

    int updateByExample(@Param("record") ManagerAttachment record, @Param("example") ManagerAttachmentExample example);

    int updateByPrimaryKeySelective(ManagerAttachment record);

    int updateByPrimaryKey(ManagerAttachment record);
}