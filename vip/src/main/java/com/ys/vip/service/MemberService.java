package com.ys.vip.service;

import com.ys.vip.entity.Member;

import java.util.List;

public interface MemberService {
    List<Member> showAll(int page,int size);
    /**
     * 假删除用户
     */
    int deleteMember(int id);
    /**
     * 添加用户
     */
    int insertMember(String mName,String mSex,String mPhone,String mEmail,String mAdresss);
    /**
     * 编辑用户
     */
    int updateMember(int id,String mName,String mSex,String mPhone,String mEmail,String mAdresss);

    /**
     * 用户状态
     */
    int updateStatus(int id);

    /**
     * 停用账户
     */
    int updataLocked(int id);

    /**
     * 批量删除
     */

    int deleteBatch(List<Integer> ids);
}
