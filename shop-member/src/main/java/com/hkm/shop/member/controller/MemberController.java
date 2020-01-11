package com.hkm.shop.member.controller;

import com.hkm.shop.bean.Member;
import com.hkm.shop.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {
    @Autowired
    private MemberService memberService;
    @GetMapping("/")
    public List<Member> getMembers(){
        List<Member> members = memberService.findMembers();
        return members;
    }
}
