package com.global.account;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/*
 GET(/sign-up) 요청(request)을 받아서
account/sign-up.html 페이지에 보여줌

회원가입 폼에서 입력받을 수 있는 정보를
닉네임, 이메일, 패스워드 폼 객체로 제공함

닉네임, 이메일, 패스워드를 가지고 있는
 ㄴ form에서 사용하는 객체들
 폼 객체들을 Model 객체에 넣어줌

 Account와 관려된 repository service controller 들을
 모아두는 account package 생성하기

*/

// 컨트롤+쉬프트+t 해당클래스의 test단 생성

@Controller // 해당 클래스가 Controller역할을 하는 클래스라고 SpringFramework에 알려줌
public class AccountController {
  @GetMapping("/sign-up")
  public String signUpForm(Model model){ //sign-up 요청이 들어오면 동작하는 메소드 Model 객체를 parameter로 받음
    return "account/sign-up";
                              // @Controller가 붙어있어서 resources/templates와 자동연결 url에 sign-up이 들어왔을때
                               // Spring Boot가 제공하는 자동 설정에 의해 templates directory의 하위 director인
                              // account 에 있는 sign-up.html 파일을 response한다
  }
}
