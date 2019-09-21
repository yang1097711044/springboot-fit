package com.ys.product.mapper;

import com.ys.product.domain.entity.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BrandMapper {
    List<Brand> brands();

    /**
     * 插入品牌
     * @param num
     * @param name
     * @param desc
     * @return
     */
    int insertBrand(@Param("num") int num,@Param("name") String name,@Param("desc") String desc);

    /**
     * 批量假删除品牌
     * @return
     */
    int updateBrandsById(@Param("bId") List<Integer> bId);

}