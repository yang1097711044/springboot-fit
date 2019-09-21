package com.ys.admin.controller;

import com.ys.admin.entity.Admin;
import com.ys.admin.service.AdminService;
import com.ys.admin.utils.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class AdminController {

    @Resource
    AdminService adminService;

    @RequestMapping("/showA/{page}/{size}")
    public ResponseEntity showAll(@PathVariable int page, @PathVariable int size){
        List<Admin> admins = adminService.showAll(page,size);
        return ResponseEntity.success(admins);
    }

    @RequestMapping("/deleteA")
    public ResponseEntity deleteAdmin(int aId){
        int row = adminService.deleteAdmin(aId);
        return ResponseEntity.success(row);
    }

    @RequestMapping("/insertA")
    public ResponseEntity insertAdmin(String aName,String aSex,String aPhone
            ,String aEmail,String aAdresss){
        int row = adminService.insertAdmin(aName, aSex, aPhone, aEmail, aAdresss);
        return ResponseEntity.success(row);
    }

    @RequestMapping("/updateA")
    public ResponseEntity updateAdmin(int aId,String aName,String aSex,String aPhone
            ,String aEmail,String aAdresss){
        int row = adminService.updateAdmin(aId, aName, aSex, aPhone, aEmail, aAdresss);
        return ResponseEntity.success(row);
    }

    @RequestMapping("/updataMM")
    public void updataMM(int aId, String mm){
        adminService.updataMM(aId,mm);
    }

    @RequestMapping("/statusA")
    public ResponseEntity updateStatus(int aId){
        int row = adminService.updateStatus(aId);
        return ResponseEntity.success(row);
    }

    @RequestMapping("/LockedA")
    public ResponseEntity updataLocked(int aId){
        int row = adminService.updateStatus(aId);
        return ResponseEntity.success(row);
    }

    @RequestMapping("/batchA")
    public void deleteBatch(List<Integer> Ids){
         adminService.deleteBatch(Ids);
    }

    @RequestMapping("/login")
    public ResponseEntity loginAdmin(String aName,String aPassword){
        Admin admin = adminService.loginAdmin(aName, aPassword);
        return  ResponseEntity.success(admin);
    }
}
