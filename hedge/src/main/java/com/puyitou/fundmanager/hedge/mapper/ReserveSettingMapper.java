package com.puyitou.fundmanager.hedge.mapper;

import com.puyitou.fundmanager.hedge.model.reserve.ReserveSetting;
import com.puyitou.fundmanager.hedge.model.reserve.ReserveSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReserveSettingMapper {
    long countByExample(ReserveSettingExample example);

    int deleteByExample(ReserveSettingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ReserveSetting record);

    int insertSelective(ReserveSetting record);

    List<ReserveSetting> selectByExample(ReserveSettingExample example);

    ReserveSetting selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ReserveSetting record, @Param("example") ReserveSettingExample example);

    int updateByExample(@Param("record") ReserveSetting record, @Param("example") ReserveSettingExample example);

    int updateByPrimaryKeySelective(ReserveSetting record);

    int updateByPrimaryKey(ReserveSetting record);
}