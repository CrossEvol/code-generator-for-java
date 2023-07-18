package com.sky.mapper;

import com.sky.entity.SkyUser;
import com.sky.entity.SkyUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkyUserMapper {
    long countByExample(SkyUserExample example);

    int deleteByExample(SkyUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SkyUser row);

    int insertSelective(SkyUser row);

    List<SkyUser> selectByExample(SkyUserExample example);

    SkyUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") SkyUser row, @Param("example") SkyUserExample example);

    int updateByExample(@Param("row") SkyUser row, @Param("example") SkyUserExample example);

    int updateByPrimaryKeySelective(SkyUser row);

    int updateByPrimaryKey(SkyUser row);
}