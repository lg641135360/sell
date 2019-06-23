package com.lg.service.impl;

import com.lg.dataobject.ProductInfo;
import com.lg.enums.ProductStatusEnum;
import com.lg.repository.ProductInfoRespository;
import com.lg.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRespository respository;

    @Override
    public ProductInfo findOne(String productId) {
        return respository.findOne(productId);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return respository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return respository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return respository.save(productInfo);
    }
}
