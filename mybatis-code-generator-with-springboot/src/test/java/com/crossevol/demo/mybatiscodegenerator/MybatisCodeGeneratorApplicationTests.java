package com.crossevol.demo.mybatiscodegenerator;

import com.crossevol.demo.mybatiscodegenerator.entity.Dish;
import com.crossevol.demo.mybatiscodegenerator.entity.DishExample;
import com.crossevol.demo.mybatiscodegenerator.entity.SkyUser;
import com.crossevol.demo.mybatiscodegenerator.entity.SkyUserExample;
import com.crossevol.demo.mybatiscodegenerator.mapper.DishMapper;
import com.crossevol.demo.mybatiscodegenerator.mapper.SkyUserMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisCodeGeneratorApplicationTests {

    @Autowired
    private DishMapper dishMapper;

    @Autowired
    private SkyUserMapper userMapper;

    @Test
    void contextLoads() {
    }




    @Test
    public void testSelectDish(){
        List<Dish> dishes = dishMapper.selectByExample(new DishExample());
        System.out.println("dishes = " + dishes);
        Assertions.assertNotEquals(dishes.size(),0);
    }

    @Test
    public void testSelectUser(){
        List<SkyUser> skyUsers = userMapper.selectByExample(new SkyUserExample());
        System.out.println("skyUsers = " + skyUsers);
        Assertions.assertEquals(skyUsers.size(),0);
    }

}
