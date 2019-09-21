package com.ys.vip.service.impl;

import com.github.pagehelper.PageHelper;
import com.ys.vip.entity.Member;
import com.ys.vip.mapper.MemberMapper;
import com.ys.vip.service.MemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {
    @Resource
    MemberMapper memberMapper;

    @Override
    public List<Member> showAll(int page,int size) {
        PageHelper.startPage(page,size);
        return memberMapper.showAll();
    }

    @Override
    public int deleteMember(int id) {
        return memberMapper.deleteMember(id);
    }

    @Override
    public int insertMember(String mName, String mSex, String mPhone, String mEmail, String mAdresss) {
        Member byName = memberMapper.findByName(mName);
        if(byName==null){
            return memberMapper.insertMember(mName,mSex,mPhone,mEmail,mAdresss);
        }else {
            return 0;
        }

    }

    @Override
    public int updateMember(int id, String mName, String mSex, String mPhone, String mEmail, String mAdresss) {
        return memberMapper.updateMember(id,mName,mSex,mPhone,mEmail,mAdresss);
    }

    @Override
    public int updateStatus(int id) {
        return memberMapper.updateStatus(id);
    }

    @Override
    public int updataLocked(int id) {
        return memberMapper.updataLocked(id);
    }

    @Override
    public int  deleteBatch(List<Integer> ids) {
        int row = memberMapper.deleteBatch(ids);
        return row;

    }


}
