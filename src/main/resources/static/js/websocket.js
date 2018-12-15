var stompClient = null;

//建议连接
function connect() {
    var socket = new SockJS('/seminarEndpoint');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        // setConnected(true);
        console.log('Connected: ' + frame);
        stompClient.subscribe('/topic/seminar', function (question) {
            console.log(JSON.parse(question.body));
        });
    });
}

// 发送消息
function sendName() {
    stompClient.send("/app/question", {}, JSON.stringify({'studentId': 123,'attendanceId':123}));
}

$(function () {
    connect();

    $(".attendance_question").click(function () {
        sendName();
    })
});