<!DOCTYPE html>
<html>
<head>    
    <meta charset="utf‐8">
    <title>Hello World!</title></head>
<body>

<#list stumap?keys as k>
    <tr>
        <td>${stumap[k].name}</td>
        <td>${stumap[k].age}</td>
        <td>${stumap[k].money}</td>
    </tr>
<br>
</#list>

${str.birthday?date}<br>
${str.birthday?time}<br>
${str.birthday?datetime}<br>
${str.birthday?string("yyyy年MM月dd日 HH 时mm分ss秒")}<br>



</body>
</html>