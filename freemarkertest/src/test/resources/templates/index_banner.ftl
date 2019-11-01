<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>

</head>
<body>
<div>

    <#if model??>
        <#list model as mm>
            <div style="background-image: url(${mm.value});"></div>
        </#list>
    </#if>


</div>

</body>
</html>