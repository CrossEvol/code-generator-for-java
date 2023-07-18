package com.crossevol.demo.mybatiscodegenerator.mapper;

import com.crossevol.demo.mybatiscodegenerator.entity.AddressBook;
import com.crossevol.demo.mybatiscodegenerator.entity.AddressBookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AddressBookMapper {
    long countByExample(AddressBookExample example);

    int deleteByExample(AddressBookExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AddressBook row);

    int insertSelective(AddressBook row);

    List<AddressBook> selectByExample(AddressBookExample example);

    AddressBook selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") AddressBook row, @Param("example") AddressBookExample example);

    int updateByExample(@Param("row") AddressBook row, @Param("example") AddressBookExample example);

    int updateByPrimaryKeySelective(AddressBook row);

    int updateByPrimaryKey(AddressBook row);
}