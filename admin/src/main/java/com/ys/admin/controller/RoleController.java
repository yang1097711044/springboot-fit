package com.ys.admin.controller;

import com.ys.admin.entity.Role;
import com.ys.admin.service.RoleService;
import com.ys.admin.utils.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class RoleController {

    @Resource
    RoleService roleService;

    @RequestMapping("/showR")
    public ResponseEntity showAll() {
        List<Role> roles = roleService.showAll();
        return ResponseEntity.success(roles);
    }

    @RequestMapping("/deleteR")
    public ResponseEntity delete(int rid){
        int row = roleService.deleteRole(rid);
        return ResponseEntity.success(row);
    }

    @RequestMapping("/insertR")
    public ResponseEntity insertRole(String rName,String rTitle){
        int row = roleService.insertRole(rName, rTitle);
        return ResponseEntity.success(row);
    }

    @RequestMapping("/updateR")
    public ResponseEntity updateRole(String rName,String rTitle){
        int row = roleService.insertRole(rName, rTitle);
        return ResponseEntity.success(row);
    }

}
