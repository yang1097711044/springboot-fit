package com.ys.admin.mapper;


import com.ys.admin.entity.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper {
    /**
     * 展示角色
     */
    List<Role> showAll();
    /**
     * 假删除角色
     */
    int deleteRole(@Param("id") int id);
    /**
     * 添加用户
     */
    Role findByName(@Param("rName") String rName);
    int insertRole(@Param("rName") String rName,@Param("rTitle") String rTitle);
    /**
     * 编辑角色
     */
    int updateRole(@Param("rid") int rid,@Param("rName") String rName,@Param("rTitle") String rTitle);

}