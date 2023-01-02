package com.global;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 스프링 부트의 기본적인설정 선언
// 해당 annotation클릭시 여러가지 설정 해줌 눈여겨볼 @ComponentScan, @EnalbeAutoConfiguration
// @ ComponentScan은 @component, @Service, @Repository, @Controller등의 annotatino을 스캔하여  Bean에 등록
// @EnableAutoConfiguration 사전에 정의된 라이브러리를 Bean에 등록(특정 조건에 맞는 라이브러리만)
// Bean : Spring loc 컨테이너가 관리하는 자바 객체임
// IOC : 일반적으로 사용자가 모든 객체 제어(생성,호출) 하지만 IOC 적용시 사용자가 직접제어하지않고 다른 주체가 관리함
// 즉 , Bean에 객체,annotation을 등록한다는건 Spring에 의해 객체가 제어된다는 것
public class App {
  public static void main(String[] args) {
    SpringApplication.run(App.class, args); // 스프링 앱 실행
  }
}
