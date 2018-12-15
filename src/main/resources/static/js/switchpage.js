$(function () {
    $(".switch-page").click(function () {
        if ($(this).hasClass("presentation-page")) {
            $(".question-page").parent().removeClass("active");
            $(".presentation-page").parent().addClass("active");
            $(".question").hide();
            $(".presentation").show();
            console.log("presentation page");
        }
        else {
            $(".question-page").parent().addClass("active");
            $(".presentation-page").parent().removeClass("active");
            $(".presentation").hide();
            $(".question").show();
            console.log("question page");
        }
    });
})
