package com.crossevol.demo.mybatiscodegenerator.mapper;

import com.crossevol.demo.mybatiscodegenerator.entity.SkyUser;
import com.crossevol.demo.mybatiscodegenerator.entity.SkyUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
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