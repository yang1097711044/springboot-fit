package com.ys.admin.entity;

import lombok.Data;

@Data
public class Role {
    /**
     * 角色ID
     */
    private Integer rId;

    /**
     * 角色姓名
     */
    private String rName;

    /**
     * 描述
     */
    private String rTitle;

    private Byte rStatus;

    private Byte rDelete;

    private Byte rLocked;
}