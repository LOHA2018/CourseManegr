<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>课堂管理系统</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="content">
    <#list courses as course>
    <div class="list-group" id="${course.id}">

        <div data-toggle="collapse" data-parent="${course.id}" class="list-group-item collapse_trigger">
            ${course.name}
        </div>
        <div class="collapse collapse_content">
            <a href="#" class="list-group-item">学生成绩</a>
            <a href="#" class="list-group-item">学生组队</a>
            <a href="#" class="list-group-item">课程信息</a>
            <a href="#" class="list-group-item">班级信息</a>
            <a href="#" class="list-group-item">讨论课设置</a>
            <a href="#" class="list-group-item">共享设置</a>
        </div>
    </div>
    </#list>
</div>
<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
<script src="../js/collapse.js"></script>
</body>
</html>