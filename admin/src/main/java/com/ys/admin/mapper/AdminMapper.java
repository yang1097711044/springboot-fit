package com.ys.admin.mapper;

import com.ys.admin.entity.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminMapper {

    /**
     * 展示管理员
     */
    List<Admin> showAll();
    /**
     * 假删除管理员
     */
    int deleteAdmin(@Param("aId") int aId);
    /**
     * 添加管理员
     */
    Admin findByName(@Param("aName") String aName);
    int insertAdmin(@Param("aName") String aName,@Param("aSex") String aSex,@Param("aPhone") String mPhone
            ,@Param("aEmail") String aEmail,@Param("aAdresss") String aAdresss);
    /**a
     * 编辑管理员
     */
    int updateAdmin(@Param("aId") int aId,String mName,@Param("aSex") String aSex,@Param("aPhone") String aPhone
            ,@Param("aEmail") String aEmail,@Param("aAdresss") String aAdresss);

    /**
     * 修改密码
     */
    void updataMM(@Param("aId") int aId,@Param("mm") String mm);

    /**
     * 用户管理员
     */
    int updateStatus(@Param("aId") int aId);

    /**
     * 停用账户
     */
    int updataLocked(@Param("aId") int aId);

    /**
     * 批量删除
     */

    int deleteBatch(@Param("Ids") List<Integer> Ids);

    /**
     * 管理员登陆
     */
    Admin loginAdmin(@Param("aName")String aName,@Param("aPassword") String aPassword);
}