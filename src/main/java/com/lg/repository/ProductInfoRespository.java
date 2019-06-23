package com.lg.repository;

import com.lg.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductInfoRespository extends JpaRepository<ProductInfo,String> {
    // 查询上架的商品
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
