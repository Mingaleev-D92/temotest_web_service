<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create user</title>
</head>
<body>
<form name="user" action="/updateUser" method="post">
    <p>Id</p>
    <input title="Id" type="text" name="id" value="${user.id}">
    <p>Date</p>
    <input title="Date" type="text" name="date" value="${user.date}">
    <p>Security</p>
    <input title="Security" type="text" name="security"value="${user.security}">
    <p>Cost</p>
    <input title="Cost" type="text" name="cost"value="${user.cost}">
    <input type="submit" value="OK">
</form>

</body>
</html>