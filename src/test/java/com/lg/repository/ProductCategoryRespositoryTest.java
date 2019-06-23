package com.lg.repository;

import com.lg.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRespositoryTest {

    @Autowired
    protected ProductCategoryRespository respository;

    @Test
    public void findOneTest(){
        ProductCategory productCategory = respository.findOne(1);
        System.out.println(productCategory.toString());
    }

    @Test
    @Transactional
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory("饮料",4);
        ProductCategory result = respository.save(productCategory);
        Assert.assertNotNull(result);
//        Assert.assertNotEquals(null,result);
    }

    @Test
    public void updateTest(){
        ProductCategory productCategory = respository.findOne(2);
        productCategory.setCategoryType(10);
        respository.save(productCategory);
    }

    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(2,3,4);
        List<ProductCategory> result = respository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());
    }
}