<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <script type="text/javascript" src="js/jquery-3.2.1.js"></script>
    <script type="text/javascript" src="js/jquery.validate.js"></script>
    <script type="text/javascript" src="js/layer/layer.js"></script>
    <script type="text/javascript">
        $(function () {
            $.getJSON('get',{user_id:101},function(data) {
                alert(data.user_name)
                $("#aa").val(data.user_name)
            })
   })
</script>
</head>
<body>
<input type="text" id="aa">
</body>
</html>
