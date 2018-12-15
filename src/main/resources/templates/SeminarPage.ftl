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
    <div class="jumbotron">
        <h1>${seminar.name}</h1>
        <p>${seminar.content}</p>
    </div>
    <div>
        <table class="table table-striped">
            <tbody>
            <tr>
                <th>轮次</th>
                <td>${seminar.roundname}</td>
            </tr>
            <tr>
                <th>课次序号</th>
                <td>${seminar.class}</td>
            </tr>
            <tr>
                <th>课次情况</th>
                <td>${seminar.state}</td>
            </tr>
            </tbody>
        </table>
    </div>
    <div style="display: flex; justify-content: center;">
    <button type="button" class="btn btn-lg btn-default" style="margin-right: 6%">报名详情</button>
    <button type="button" class="btn btn-lg btn-default" style="margin-left: 6%">开启讨论</button>
    </div>
</div>
</div>
<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
</body>
</html>