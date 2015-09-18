<%--
  Created by IntelliJ IDEA.
  User: Alvinyau
  Date: 2015/6/24
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <title>Dashboard I Admin Panel</title>
    <link rel="stylesheet" href="css/metroStyle/metroStyle.css" type="text/css"/>
    <link rel="stylesheet" href="css/demo.css" type="text/css"/>
    <script src="js/jquery-1.4.4.min.js" type="text/javascript"></script>
    <script src="js/jquery.ztree.all-3.5.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(function(){

            var setting = {
                data: {
                    simpleData: {
                        enable: true
                    }
                }
            };

            $.ajax({
                type:'post',
                url:'menu/queryMenuInfoList',
                data:{
                    'id':'id',
                    'name':'name'
                },
                dataType: 'json',
                success:function(zNodes){
                    var treeObj= $.fn.zTree.init($("#treeDemo"), setting, zNodes);
                }
            });

        });

    </script>
</head>
<body>
    <ul id="treeDemo" class="ztree"></ul>
    <div id="dataDiv"></div>
</body>

</html>
