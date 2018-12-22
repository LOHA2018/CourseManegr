$(function () {

    $(".attendance_question").click(function () {
        sendQuestion();
    })

    /**
     * @Author: birden
     * @Description: 将变量a变为seminar的Id
     * @Date: 2018/12/22 22:18
     */
    a="123"

    var sock = new SockJS("/endpointSeminar");
    var stomp = Stomp.over(sock);
    stomp.connect('guest', 'guest', function(frame) {
        stomp.subscribe("/topic/"+a, function (datatest) {
            console.log(datatest.body);
        });
    });
// 发送消息
    function sendQuestion() {
        stomp.send("/app/question", {}, "hello");
    }

// 发送消息
    function sendNotice() {
        stomp.send("/app/choose", {}, "123");
    }
});