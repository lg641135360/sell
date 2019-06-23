package com.lg.service.impl;

import com.lg.dataobject.ProductCategory;
import com.lg.repository.ProductCategoryRespository;
import com.lg.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRespository respository;

    @Override
    public ProductCategory findOne(Integer categoryId) {
        return respository.findOne(categoryId);
    }

    @Override
    public List<ProductCategory> findAll() {
        return respository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return respository.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return respository.save(productCategory);
    }
}
