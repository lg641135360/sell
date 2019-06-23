package com.lg.repository;

import com.lg.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRespositoryTest {

    @Autowired
    private ProductInfoRespository respository;

    @Test
    public void saveTest(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123");
        productInfo.setProductName("几把");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("还行吧");
        productInfo.setProductIcon("sjkldfl");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);

        ProductInfo result = respository.save(productInfo);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByProductStatus() throws Exception{
        List<ProductInfo> productInfoList = respository.findByProductStatus(0);
        Assert.assertNotEquals(0,productInfoList.size());
    }
}