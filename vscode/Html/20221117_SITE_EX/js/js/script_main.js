//1) gnb: mouse over, focus 시 밑줄(span bar)
// $() -> jquery 태그는 문자열로 event는 .on으로 
$(function (){ 
  // 선택자 : selector
  $('.gnb li a').on('mouseenter focus',function(){
    let bar = $(this).position().left;
    let widthNumber  = $(this).width();
    $('span.bar').css({'left':bar + 'px', 'width':widthNumber + 'px',opacity:1});
  });
  $('.gnb li a').on('mouseleave',function(){
    $('span.bar').css({'left':0 , 'width':0,opacity:0}); //opacity뜻 불투명
  });
});

//.circleBox SVG iamge(회색 원)의 테두리길이 구하기
$(function (){
  $('.svgAni').find('path').each(function (i, path){// each(index, 경로) 메소드 : jQuery에서 반복문 실행할 때 사용
    let length = path.getTotalLength();
    // 1564.734130859375
    // alert(length);
  }) 
});

// scroll animation
$(function() {
  $('.animate').scrolla({
    mobile: true, // mobile version 활성화
    once : true // scorll 할 때, 한 번만 적용함
  });
});

//배경색 변경하기
// on('scroll resize') - scroll 이나 resize할 때 배경색 변경하기
//$(window).on('scroll resize',function(){
//     ㄴ 윈도우를 스크롤하거나 사이즈를 변경하는 경우 function()이 호출됨
$(window).on('scroll resize',function(){
  //화면 top의 위치값
  let scrollTop = $(document).scrollTop();
  bgColor();

  function bgColor(){
    //scrollTop값이 1400을 초과하는 경우
    //body element의 class 속성에 속성값on을 지정함
    if(scrollTop>1400){
      $('body').addClass('on');
    }else{ // 아닌 경우, class 속성값 on을 삭제함
      $('body').removeClass();
    }
    //scrollTop값이 2700을 초과하는 경우
    //body element의 class 속성에 속성값on을 지정함
    if(scrollTop>2700){ // 아닌 경우, class 속성값 on을 삭제함
      $('body').removeClass();
    }
  }
});

//햄버거 메뉴
$(function (){
  $('.menuOpen button.open').on('click', function(){
    $('.menuOpen .menuWrap').addClass('on')
  });
  //닫기(close, X) 버튼
  $('.menuOpen a.close').on('click', function(){
    $('.menuOpen .menuWrap').removeClass('on')
  });
});

