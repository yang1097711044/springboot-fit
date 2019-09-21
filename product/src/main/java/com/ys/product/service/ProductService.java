package com.ys.product.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ys.product.domain.entity.Brand;
import com.ys.product.domain.entity.Product;
import com.ys.product.domain.vo.OneclassifyVo;

import java.util.List;

public interface ProductService {
    /**
     * 所有的品牌展示
     * @return
     */
    List<Brand> brands();

    List<OneclassifyVo> lists();

    int insertBrand(int num,String name,String desc);


    /**
     * 产品分页
     * @return
     */
    IPage<Product> selectProductPage(int page,int size);

    /**
     * 插入产品
     * @param name
     * @param image
     * @param desc
     * @param price
     * @param oId
     * @param wId
     * @param bId
     * @return
     */
    int insertProduct(String name,String image,String desc,double price,int oId,int wId,int bId);

}
