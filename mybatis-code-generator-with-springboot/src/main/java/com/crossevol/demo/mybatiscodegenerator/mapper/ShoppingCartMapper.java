package com.crossevol.demo.mybatiscodegenerator.mapper;

import com.crossevol.demo.mybatiscodegenerator.entity.ShoppingCart;
import com.crossevol.demo.mybatiscodegenerator.entity.ShoppingCartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShoppingCartMapper {
    long countByExample(ShoppingCartExample example);

    int deleteByExample(ShoppingCartExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ShoppingCart row);

    int insertSelective(ShoppingCart row);

    List<ShoppingCart> selectByExample(ShoppingCartExample example);

    ShoppingCart selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") ShoppingCart row, @Param("example") ShoppingCartExample example);

    int updateByExample(@Param("row") ShoppingCart row, @Param("example") ShoppingCartExample example);

    int updateByPrimaryKeySelective(ShoppingCart row);

    int updateByPrimaryKey(ShoppingCart row);
}