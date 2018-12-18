$(function () {

    $(".attendance_question").click(function () {
        sendNotice();
    })

    var sock = new SockJS("/endpointSeminar");
    var stomp = Stomp.over(sock);
    stomp.connect('guest', 'guest', function(frame) {
        stomp.subscribe("/user/topic/seminar", function (datatest) {
            console.log(datatest.body);
        });
    });
// 发送消息
    function sendQuestion() {
        stomp.send("/app/question", {}, JSON.stringify({'studentId': 123,'attendanceId':123}));
    }

// 发送消息
    function sendNotice() {
        stomp.send("/app/choose", {}, "123");
    }
});