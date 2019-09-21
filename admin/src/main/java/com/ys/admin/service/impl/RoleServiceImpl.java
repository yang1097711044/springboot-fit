package com.ys.admin.service.impl;

import com.ys.admin.entity.Role;
import com.ys.admin.mapper.RoleMapper;
import com.ys.admin.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Resource
    RoleMapper roleMapper;

    @Override
    public List<Role> showAll() {
        return roleMapper.showAll();
    }

    @Override
    public int deleteRole(int rid) {
        return roleMapper.deleteRole(rid);
    }

    @Override
    public int insertRole(String rName, String rTitle) {
        Role byName = roleMapper.findByName(rName);
        if(byName==null) {
            int row = roleMapper.insertRole(rName, rTitle);
            return row;
        }else {
            return 0;
        }
    }

    @Override
    public int updateRole(int rid, String rName, String rTitle) {
        int row = roleMapper.updateRole(rid,rName,rTitle);
        return row;
    }
}
