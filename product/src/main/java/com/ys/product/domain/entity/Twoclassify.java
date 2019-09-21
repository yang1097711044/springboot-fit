package com.ys.product.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Twoclassify {
    /**
    * 二级分类id
    */
    private Integer wId;

    /**
    * 二级分类名
    */
    private String wTitle;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;

    private Integer oId;
}