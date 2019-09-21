package com.ys.admin.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Admin {
    /**
     * 管理员ID
     */
    private Integer aId;

    /**
     * 管理员姓名
     */
    private String aName;

    /**
     * 管理员性别
     */
    private String aSex;

    /**
     * 管理员电话
     */
    private String aPhone;

    /**
     * 邮箱
     */
    private String aEmail;

    /**
     * 地址
     */
    private String aAdresss;

    /**
     * 创建时间
     */
    private Date createTime;

    private Byte aStatus;

    private Byte aDelete;

    private Byte aLocked;

    private Integer rId;

    private String aPassword;
}