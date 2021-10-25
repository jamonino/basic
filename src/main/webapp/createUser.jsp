<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create User</title>
    </head>
    <body>
        <form action="addUser" method="post">
            <table style="with: 50%">
                <tr>
                        <td>User</td>
                        <td><input type="text" name="username" /></td>
                </tr>
                <tr>
                        <td>Password</td>
                        <td><input type="password" name="password" /></td>
                </tr>
                <tr>
                        <td>Age</td>
                        <td><input type="text" name="age" /></td>
                </tr>
            </table>
            <input type="submit" value="Create User" />
        </form>
    </body>
</html>
