package com.ys.admin.service;

import com.ys.admin.entity.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleService {
    List<Role> showAll();

    int deleteRole(int id);

    int insertRole(String rName,String rTitle);

    int updateRole(int rid,String rName,String rTitle);
}
