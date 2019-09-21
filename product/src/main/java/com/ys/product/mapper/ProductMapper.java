package com.ys.product.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ys.product.domain.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper extends BaseMapper<Product> {

    List<Product> findAll();
    int insert(@Param("name") String name,
               @Param("image") String image,
               @Param("desc") String desc,
               @Param("price") double price,
               @Param("oId") int oId,
               @Param("wId") int wId,
               @Param("bId") int bId);
}