function topAlter(msg) {
    $(".alert-danger").children("p:last").html(msg);
    $(".alert-danger").show();
}

$(function () {
    $(".close").click(function () {
        $(".alert-danger").hide();
    })
})

