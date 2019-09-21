package com.ys.vip.mapper;

import com.ys.vip.entity.Member;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberMapper {
    /**
     * 展示用户
     */
    List<Member> showAll();
    /**
     * 假删除用户
     */
    int deleteMember(@Param("id") int id);
    /**
     * 添加用户
     */
    Member findByName(@Param("mName") String mName);
    int insertMember(@Param("mName") String mName,@Param("mSex") String mSex,@Param("mPhone") String mPhone
                    ,@Param("mEmail") String mEmail,@Param("mAdresss") String mAdresss);
    /**
     * 编辑用户
     */
    int updateMember(@Param("id") int id,String mName,@Param("mSex") String mSex,@Param("mPhone") String mPhone
            ,@Param("mEmail") String mEmail,@Param("mAdresss") String mAdresss);

    /**
     * 用户状态
     */
    int updateStatus(@Param("id") int id);

    /**
     * 停用账户
     */
    int updataLocked(@Param("id") int id);

    /**
     * 批量删除
     */

    int deleteBatch(@Param("ids") List<Integer> ids);
}