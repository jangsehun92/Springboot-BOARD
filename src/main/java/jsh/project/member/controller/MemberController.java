package jsh.project.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MemberController{

    //회원가입 페이지 요청
    @GetMapping(value= "/user/register")
    public String joinPage() {
        return "register";
    }

    //회원가입 요청

    //로그인 페이지 요청
    @GetMapping(value= "/user/login")
    public String getLoginPage() {
        return "login";
    }

    //로그인 요청

    //로그아웃 요청

    //개인정보 페이지 및 데이터 요청
    @GetMapping(value = "/user/info/{id}")
    public String getMemberInfo(@PathVariable("id")int id){
        System.out.println(id);
        return "info";
    }

    //개인정보 수정 페이지 요청

    //개인정보 수정 요청

    //회원 탈퇴 요청

    //이메일 인증 요청

}