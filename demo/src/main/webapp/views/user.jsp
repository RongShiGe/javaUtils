<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
    pageContext.setAttribute("app",request.getContextPath());
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户</title>
    <link href="../statics/layui/css/layui.css" rel="stylesheet" type="text/css" />

    <script src="https://libs.baidu.com/jquery/2.1.4/jquery.min.js"></script>
    <script src="../statics/layui/layui.js" language="javascript" type="text/javascript"></script>
    <script type="text/javascript">
        layui.use(['table','form'], function() {
            var form = layui.form
                , layer = layui.layer
                , table = layui.table;
            table.render({
                elem: '#userTable'
                // ,url:'/demo/table/user/'
                ,cols: [[
                    {field:'id', width:80, title: 'ID', sort: true}
                    ,{field:'username', width:80, title: '用户名'}
                    ,{field:'sex', width:80, title: '性别', sort: true}
                    ,{field:'city', width:80, title: '城市'}
                    ,{field:'sign', title: '签名', minWidth: 150}
                    ,{field:'experience', width:80, title: '积分', sort: true}
                    ,{field:'score', width:80, title: '评分', sort: true}
                    ,{field:'classify', width:80, title: '职业'}
                    ,{field:'wealth', width:135, title: '财富', sort: true}
                ]]
                ,data:[{'id':1},{'id':1},{'id':1},{'id':1},{'id':1},{'id':1},{'id':1},{'id':1},{'id':1}]
                ,page: true
            });

        });
    </script>
</head>
<body>
<form class="layui-form" method="post" action="${app}}">
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">姓名</label>
            <div class="layui-input-inline">
                <input type="text" name="name" autocomplete="on" class="layui-input">
            </div>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit="" lay-filter="submit">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>
<table class="layui-hide" id="userTable"></table>
</body>
</html>