package com.ys.admin.service;

import com.ys.admin.entity.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminService {
    List<Admin> showAll(int page,int size);

    int deleteAdmin( int aId);

    int insertAdmin(String aName,String aSex,String aPhone
            ,String aEmail,String aAdresss);

    int updateAdmin(int aId,String aName,String aSex,String aPhone
            ,String aEmail,String aAdresss);

    void updataMM(int aId,String mm);

    int updateStatus(int aId);

    int updateLocked(int aId);

    int deleteBatch(List<Integer> Ids);

    Admin loginAdmin(String aName,String aPassword);
}
