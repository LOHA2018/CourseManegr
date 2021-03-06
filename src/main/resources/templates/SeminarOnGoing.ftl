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
<div class="page-header">
    <h3>${seminar.name}</h3>
</div>

<div class="page-sidebar" style="position: fixed; top:35%; z-index:10;">
    <div class="sidebar-switch">
        <span class="glyphicon glyphicon-list" style="font-size: 20px; margin-left: 4px;"></span>
    </div>
    <ul class="list-group presentation-list" style="display: none">
        <#list presentations as presentation>
        <li class="list-group-item"><a>${presentation.name}</a></li>
        </#list>
    </ul>
</div>
<ul class="nav nav-tabs" role="tablist">
    <li role="presentation" class="active"><a class="presentation-page switch-page"  href="javascript:void(0);">展示</a></li>
    <li role="presentation"><a class="question-page switch-page" href="javascript:void(0);">提问</a></li>
</ul>

<div class="content presentation center-block" style="width: 90%; margin-top: 4%">
    <div class="row" >
        <div class="col-sm-6 col-md-4">
            <div class="thumbnail">
                <div class="caption">
                    <div class="col-sm-4">
                        <span class="glyphicon glyphicon-hourglass"></span>
                        <span class="countdown"></span>
                    </div>
                    <h3>${presentation.name}</h3>
                    <br/>
                    <a>${presentation.url}</a>
                    <br/>
                    <br/>
                    <div class="input-group">
                        <input type="text" class="form-control write-place" placeholder="Score" aria-describedby="basic-addon1">
                    </div>
                    <br/>
                    <p>说明</p>
                    <div class="btn-group" role="group" aria-label="...">
                        <button type="button" class="btn btn-default stop-presentation">暂停计时</button>
                        <button type="button" class="btn btn-default">确认分数</button>

                        <div class="btn-group" role="group">
                            <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                结束操作
                                <span class="caret"></span>
                            </button>
                            <ul class="dropdown-menu">
                                <li><a class="attendance_question">提问</a></li>
                                <li><a href="#">下组展示</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="content question center-block" style="display: none; margin-top: 7%; width: 90%;">

    <ul class="list-group">
        <li class="list-group-item active">提问列表</li>
        <#list questions as question>
        <li class="list-group-item">${question.student.name}</li>
        </#list>
    </ul>
</div>
<div class="alert alert-danger alert-dismissible" role="alert" style="position: fixed; display: none; top:0; z-index: 11; width: 100%">
    <button type="button" class="close"><span aria-hidden="true">&times;</span></button>
    <strong>Warning!</strong><span>&nbsp;</span><span>js填入具体内容</span>
</div>
<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
<script src="https://cdn.bootcss.com/sockjs-client/1.3.0/sockjs.min.js"></script>
<script src="../js/alter.js"></script>
<script src="../js/countdown.js"></script>
<script src="../js/sidebar.js"></script>
<script src="../js/switchpage.js"></script>
</body>
</html>