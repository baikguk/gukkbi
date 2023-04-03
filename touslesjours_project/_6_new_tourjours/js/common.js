jQuery(function($){
	let $gnbDepth1 = $(".gnb .depth1");
	let $gnbDepth2 = $(".gnb .depth2");
	let $gnbDim2 = $(".gnb_dim2");
	$gnbDepth2.hide();
	$gnbDepth1.on("focusin mouseover",function () {
		$(".gnb .depth2, .gnb_dim2").css({height : 0});
		$(".gnb .depth2, .gnb_dim2").show();

		$gnbDim2.stop().animate({height : 193}, 300);
		$gnbDepth2.stop().animate({height : 193}, 300);
	});
	$(".gnb > ul").on("mouseleave",function () {

		$gnbDim2.stop().animate({height : 0}, 300);
		$gnbDepth2.stop().animate({height : 0}, 300, function(){
			$(".gnb .depth2, .gnb_dim2").hide();
		});

	});
	$(".gnb .last").on("focusout",function () {
		$gnbDim2.stop().animate({height : 0}, 300);
		$gnbDepth2.stop().animate({height : 0}, 300, function(){
			$(".gnb .depth2, .gnb_dim2").hide();
		});
	});
});

