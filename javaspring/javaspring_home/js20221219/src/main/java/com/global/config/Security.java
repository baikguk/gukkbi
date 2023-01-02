package com.global.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration // 설정에 관련된 code작성 해당 anntation이 붙은 클래스라면 설정파일로 Spring에 등록됨
@EnableWebSecurity// 웹보안 활성화 WebSecurityConfigurerAdapter상속 받으면 수월하게 보안설정
                  // conigure() 메소드 오버라이딩하여 특청 요쳥에 대한 보안검사 안함.
 public class Security extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.authorizeRequests().mvcMatchers("/","/login","/sign-up","/check-email","/check-email-token",
      "/email-login","/check-email-login", "/login-link").permitAll()
      .mvcMatchers(HttpMethod.GET, "/profile/*").permitAll()
      .anyRequest().authenticated();
  }
}
