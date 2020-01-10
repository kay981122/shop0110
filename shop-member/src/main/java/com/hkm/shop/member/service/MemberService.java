package com.hkm.shop.member.service;

import com.hkm.shop.member.bean.Member;
import com.hkm.shop.member.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    private MemberMapper memberMapper;

    public List<Member> findMembers(){
        System.out.println(memberMapper.selectMembers());
        return memberMapper.selectMembers();
    }
}
