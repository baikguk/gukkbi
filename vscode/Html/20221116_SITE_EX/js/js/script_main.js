//1) gnb: mouse over, focus 시 밑줄(span bar)
$(function (){ 
  // 선택자 : selector
  $('.gnb li a').on('mouseenter focus',function(){
    let bar = $(this).position().left;
    let widthNumber  = $(this).width();
    $('span.bar').css({'left':bar + 'px', 'width':widthNumber + 'px',opacity:1});
  });
  $('.gnb li a').on('mouseleave',function(){
    $('span.bar').css({'left':0 , 'width':0,opacity:0});
  });
});