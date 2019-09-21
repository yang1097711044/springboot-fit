package com.ys.product.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Oneclassify {
    /**
    * 一级分类id
    */
    private Integer oId;

    /**
    * 一级分类名
    */
    private String oTitle;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;

}