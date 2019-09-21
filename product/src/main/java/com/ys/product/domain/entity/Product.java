package com.ys.product.domain.entity;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Product {
    /**
    * 产品id
    */
    private Integer pId;

    /**
    * 产品名称
    */
    private String pName;

    /**
    * 产品图片
    */
    private String image;

    /**
    * 产品描述
    */
    private String pDescribe;

    /**
    * 产品价格
    */
    private BigDecimal price;

    /**
    * 发布状态
    */
    private Byte pStatus;

    private Integer oId;

    private Integer wId;

    private Integer bId;

    private Byte isDelete;

}