package com.lg.service;

import com.lg.dataobject.ProductCategory;

import java.util.List;

public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    // 新增和更新都是save方法
    ProductCategory save(ProductCategory productCategory);
}
