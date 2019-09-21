package com.ys.product.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Brand {
    /**
    * 品牌id
    */
    private Integer bId;

    /**
    * 品牌序号
    */
    private Integer bNum;

    /**
    * 品牌名
    */
    private String bName;

    /**
    * 描述
    */
    private String bDescribe;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;

}