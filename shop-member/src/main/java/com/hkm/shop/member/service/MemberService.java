package com.hkm.shop.member.service;


import com.hkm.shop.bean.Member;
import com.hkm.shop.member.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    private MemberMapper memberMapper;


    public List<Member> findMembers(){
        return memberMapper.selectAll();
    }
    public Member findMemberById(Integer id){
        return memberMapper.selectByPrimaryKey(id);
    }
    public int deleteMemberById(Integer id){
        return memberMapper.deleteByPrimaryKey(id);
    }
    public int updateMember(Member member){
        return memberMapper.updateByPrimaryKey(member);
    }
    public int addMember(Member member){
        return memberMapper.insert(member);
    }

}
