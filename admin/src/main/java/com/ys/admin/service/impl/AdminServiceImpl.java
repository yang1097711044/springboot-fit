package com.ys.admin.service.impl;

import com.github.pagehelper.PageHelper;
import com.ys.admin.entity.Admin;
import com.ys.admin.mapper.AdminMapper;
import com.ys.admin.service.AdminService;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    AdminMapper adminMapper;

    @Override
    public List<Admin> showAll(int page,int size) {
        PageHelper.startPage(page,size);
        return adminMapper.showAll();
    }

    @Override
    public int deleteAdmin(int aId) {
        return adminMapper.deleteAdmin(aId);
    }

    @Override
    public int insertAdmin(String aName, String aSex, String aPhone, String aEmail, String aAdresss) {
        Admin byName = adminMapper.findByName(aName);
        if (byName==null){
            return adminMapper.insertAdmin(aName,aSex,aPhone,aEmail,aAdresss);
        }
        return 0;
    }

    @Override
    public int updateAdmin(int aId, String aName, String aSex, String aPhone, String aEmail, String aAdresss) {
        return adminMapper.updateAdmin(aId,aName,aSex,aPhone,aEmail,aAdresss);
    }

    @Override
    public void updataMM(int aId, String mm) {
        adminMapper.updataMM(aId,mm);

    }

    @Override
    public int updateStatus(int aId) {
        return adminMapper.updateStatus(aId);
    }

    @Override
    public int updateLocked(int aId) {
        return adminMapper.updataLocked(aId);
    }

    @Override
    public int deleteBatch(List<Integer> Ids) {
        return adminMapper.deleteBatch(Ids);
    }

    @Override
    public Admin loginAdmin(String aName,String aPassword) {
        Admin admin = adminMapper.loginAdmin(aName, aPassword);
        String md5DigestAsHex = DigestUtils.md5DigestAsHex(aPassword.getBytes());
        if(admin!=null){
            if(md5DigestAsHex.equals(admin.getAPassword())){
                return admin;
            }
        }
        return admin;
    }

}
