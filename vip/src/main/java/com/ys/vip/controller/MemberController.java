package com.ys.vip.controller;

import com.ys.vip.entity.Member;
import com.ys.vip.service.MemberService;
import com.ys.vip.utils.ResponseEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
public class MemberController {

    @Resource
    MemberService memberService;

    @RequestMapping("/showAll/{page}/{size}")
    public ResponseEntity show(@PathVariable int page, @PathVariable int size){
        List<Member> members = memberService.showAll(page,size);
        return ResponseEntity.success(members);
    }

    @RequestMapping("/deleteOne")
    public ResponseEntity deleteMember(int id){
        int row = memberService.deleteMember(id);
        return ResponseEntity.success(row);
    }

    @RequestMapping("/insert")
    public ResponseEntity insertMember(String mName, String mSex, String mPhone, String mEmail, String mAdresss){
        int row = memberService.insertMember(mName,mSex,mPhone,mEmail,mAdresss);
        return ResponseEntity.success(row);
    }

    @RequestMapping("/update")
    public ResponseEntity updateMember(int id, String mName, String mSex, String mPhone, String mEmail, String mAdresss){
        int row = memberService.insertMember(mName,mSex,mPhone,mEmail,mAdresss);
        return ResponseEntity.success(row);
    }

    @RequestMapping("/status")
    public  ResponseEntity updateStatus(int id){
        int row = memberService.updateStatus(id);
        return ResponseEntity.success(row);
    }

    @RequestMapping("/locked")
    public ResponseEntity updataLocked(int id){
        int row = memberService.updateStatus(id);
        return ResponseEntity.success(row);
    }

    @RequestMapping("/batch")
    public void deleteBatch(List<Integer> ids){
        memberService.deleteBatch(ids);
    }
}
