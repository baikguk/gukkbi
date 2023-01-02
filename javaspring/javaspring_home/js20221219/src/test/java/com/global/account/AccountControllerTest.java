package com.global.account;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@SpringBootTest // 테스트 제공
@AutoConfigureMockMvc
//@Controller 과 @Service, @Repository 이 붙은 클래스의 객체들을 모두 메모리에 올림 ㄴ 테스트 대상으로 삼음
// Mock : 가짜의
// Mvc ( Model(businesscode DB: 작업) View(front) Controller(form시 url처리?)
class AccountControllerTest {
  @Autowired// (Spring FrameWork이 자동으로 의존성 주입(dependacy injection))
  //AccountControllerTest가 잘 작동하려면 MockMvc타입의 객체가 생성 되었어야 한다
  //이를 위해서 Autowired를 통해 스프링 프레임웍이 MockMvc를 자동으로 생성해준며 이를
  //AccountControllerTest는 MockMvc에 의존한다고 한다.
  private MockMvc mockMvc;

  @DisplayName("회원가입화면이 보이는지 테스트하기")
  @Test
  void signupFrom() throws Exception {
    mockMvc.perform(get("/sign-up")) // test 서버단에서 sign-up 요청 보냄
      .andDo(print()) // get에 접근 html 출력
      .andExpect(status().isOk()) // request responec 정상적인지 확인
                                  /*MockHttpServletResponse:
                                         Status = 200
                                  Error message = null*/
      .andExpect(view().name("account/sign-up"));
  }
}