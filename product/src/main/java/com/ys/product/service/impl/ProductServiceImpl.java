package com.ys.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ys.product.domain.entity.Brand;
import com.ys.product.domain.entity.Product;
import com.ys.product.domain.vo.OneclassifyVo;
import com.ys.product.mapper.BrandMapper;
import com.ys.product.mapper.OneclassifyMapper;
import com.ys.product.mapper.ProductMapper;
import com.ys.product.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    BrandMapper brandMapper;

    @Resource
    ProductMapper productMapper;

    @Resource
    OneclassifyMapper oneclassifyMapper;
    @Override
    public List<Brand> brands() {
        return brandMapper.brands();
    }

    @Override
    public List<OneclassifyVo> lists() {
        return oneclassifyMapper.findAll();
    }

    @Override
    public int insertBrand(int num,String name,String desc) {
        return brandMapper.insertBrand(num, name, desc);
    }

    @Override
    public IPage<Product> selectProductPage(int page,int size) {
        return productMapper.selectPage(new Page<>(page,size),new QueryWrapper<Product>().eq("is_delete",0));
    }

    @Override
    public int insertProduct(String name, String image, String desc, double price, int oId, int wId, int bId) {
        return productMapper.insert(name, image, desc, price, oId, wId, bId);
    }
}
