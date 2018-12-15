$(function () {
$(".collapse_trigger").click(function () {
    $(this).parents(".list-group").first().children(".collapse_content").collapse('toggle');
})
});