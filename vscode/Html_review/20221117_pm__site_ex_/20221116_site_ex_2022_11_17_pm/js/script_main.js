
// 1) .gnb :  mouse over, focus 시 밑줄(span.bar)
$(function () {
  // 선택자 : selector
  $('.gnb li a').on('mouseenter focus', function () {
    let bar = $(this).position().left;
    let widthNumber = $(this).width();
    $('span.bar').css({ 'left': bar + 'px', 'width': widthNumber + 'px', opacity: 1});
  });
  $('.gnb li a').on('mouseleave', function () {
    $('span.bar').css({ 'left': 0, 'width': 0, opacity: 0});
  });
});

// .circleBox SVG image(회색 원) 의 테두리 길이 구하기
$(function () {
  // each() 메소드 : jQuery 에서 반복문 실행할 때 사용함
  $('.svgAni').find('path').each(function (i, path) {
    let length = path.getTotalLength();
    // path 의 전체 길이 : 1564.734130859375
    // alert('path 의 전체 길이 : ' + length);
  });
});

// scroll animation
$(function () {
  $('.animate').scrolla({
    mobile: true, // mobile version 활성화
    once: true // scroll 할 때, 한 번만 적용함
  });
});

// 배경색 변경하기
// on('scroll resize') - scroll 이나 resize 할 때 배경색 변경하기
// $(window).on('scroll resize', function () 
//   ㄴ 윈도우를 스크롤하거나 사이즈를 변경하는 경우 function() 이 호출됨
$(window).on('scroll resize', function () {
  // 화면 top 의 위칫값
  let scrollTop = $(document).scrollTop();
  bgColor();
  function bgColor() {
    // scrollTop 값이 1400 을 초과하는 경우
    // body element 의 class 속성에 속성값 on 을 지정함
    if (scrollTop > 1400) {
      $('body').addClass('on');
    } else { // 아닌 경우, class 속성값 on 을 삭제함
      $('body').removeClass('on');
    }
    // scrollTop 값이 2700 을 초과하는 경우
    // body element 의 class 속성값 on 을 삭제함
    if (scrollTop > 2700) {
      $('body').removeClass('on');
    }
  }
});

// 햄버거 메뉴
$(function () {
  // 열기 버튼(햄버거 버튼)을 클릭하면 
  // .menuOpen .menuWrap element 의 class 값이 on 이 됨
  $('.menuOpen button.open').on('click', function () {
    $('.menuOpen .menuWrap').addClass('on');
  });
  // 닫기 버튼(X / close)을 클릭하면 
  // .menuOpen .menuWrap element 의 class 값 on 이 삭제됨
  $('.menuOpen .menuWrap .close').on('click', function () {
    $('.menuOpen .menuWrap').removeClass('on');
  });
});