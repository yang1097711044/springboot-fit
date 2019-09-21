package com.ys.vip.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Member {
    /**
    * 会员ID
    */
    private Integer mId;

    /**
    * 会员姓名
    */
    private String mName;

    /**
    * 会员性别
    */
    private String mSex;

    /**
    * 会员电话
    */
    private String mPhone;

    /**
    * 邮箱
    */
    private String mEmail;

    /**
    * 地址
    */
    private String mAdresss;

    /**
    * 创建时间
    */
    private Date createTime;

    private Byte mStatus;

    private Byte mDelete;

    private Byte mLocked;
}