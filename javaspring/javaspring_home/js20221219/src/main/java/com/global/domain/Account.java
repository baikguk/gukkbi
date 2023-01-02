package com.global.domain;

/*
* Account 도메인 클래스
* 필요한 Data(멤버변수)  로그인
*                       프로필
*                       알림설정
* */

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity//기본적인 Framework(틀)을 자동으로 설정해주는 Entity (Annotation) --> 자동으로 DB 테이블(프로젝트 생성 설정에서 추가한 H2Db와)과 mapping 시켜줌
@Getter @Setter // 문자 의미 그대로
@EqualsAndHashCode(of="id")
/*멤버 변수중 id만 오버라이딩
원래 객체끼리 비교하면 주소를 비교하기 때문에 equals를 오버라이딩안하고 사용하거나, ==로 비교 하면 주소로 비교하여 값이 동일해도 False 판단한다
하지만 String은 이미 Equlas를 오버라이드 했기 때문에  equlas를 통해서 비교하면 값을 비교하며 True
==로 비교한 경우 literal이 e동일한 값은 commonspace에 하나만 생성하기 때문에 비교값이 True가나온다
하지만 String을 객체로 생성해서 비교시 equals는 override가 되어있기 때문에 true가 되지만 literal commonspace는 다르게 되어 false가 나온다.
                        ㄴ String str1 = new String("gl")
*/
public class Account {
  /*
  스키마 : 기본구조
  DB 테이블과 자바 클래스
    테이블의 Create문 = 클래스 정의부
    테이블 생성 = 객체 생성
    컬럼 = 클래스의 멤버변수
    레코드(insert로 하나씩 넣는 경우) = new 연산자롤 객체 생성하여 멤버변수에 값을 넣어줬을때
   */

  @Id //DB테이블에서 기본키(제약조건 포함)를 의미
  @GeneratedValue // 기본 키 생성을 DB 자동으로 함
  private Long id;

  @Column(unique = true) //교유키 무결성 제약조건 부여
  private String email;

  @Column(unique = true) //교유키 무결성 제약조건 부여
  private String password;

  @Lob // DB의 BLOB타입과 매칭 시킴 , BLOB(대용량의 binary data를 위한 type)(대용량 기준: VARCHAR type(255)보다 큰경우)
  @Basic(fetch = FetchType.EAGER) //자바의 primitive type을 명시적으로 매핑 .EAGER(즉시 로딩), .LAZY(지연 로딩)
  private String profileImage;
}
