package com.puyitou.fundmanager.hedge.mapper;

import com.puyitou.fundmanager.hedge.model.FileStorage;
import com.puyitou.fundmanager.hedge.model.FileStorageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileStorageMapper {
    long countByExample(FileStorageExample example);

    int deleteByExample(FileStorageExample example);

    int deleteByPrimaryKey(String id);

    int insert(FileStorage record);

    int insertSelective(FileStorage record);

    List<FileStorage> selectByExample(FileStorageExample example);

    FileStorage selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FileStorage record, @Param("example") FileStorageExample example);

    int updateByExample(@Param("record") FileStorage record, @Param("example") FileStorageExample example);

    int updateByPrimaryKeySelective(FileStorage record);

    int updateByPrimaryKey(FileStorage record);
}