$(function () {
    var time = 60;
    var minute = time / 60;
    var second = time % 60;

    var msg = minute + "m : " + second + "s";
    $(".countdown").html(msg);

    var countdown = setInterval(countDown, 1e3);

    function countDown() {
        msg = minute + "m : " + second + "s";
        $(".countdown").html(msg);
        if (second-- === 0) {
            if (minute > 0) {
                minute--;
                second = 59;
            }
            else {
                clearInterval(countdown);
            }
        }
    }

    $(".stop-presentation").click(function () {
        console.log("alter");
        topAlter("暂停了！！！！！");
        $(".stop-presentation").html("继续计时");
    })
})