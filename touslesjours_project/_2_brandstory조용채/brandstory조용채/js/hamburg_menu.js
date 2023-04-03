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

