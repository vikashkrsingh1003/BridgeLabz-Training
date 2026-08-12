<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>

    <meta charset="UTF-8">

    <title>Home</title>


    <style>

        body {

            font-family: Arial, sans-serif;

            background-color: #f2f2f2;
        }


        .container {

            width: 500px;

            margin: 100px auto;

            padding: 40px;

            background-color: white;

            text-align: center;

            border-radius: 10px;

            box-shadow:
                0 0 10px rgba(0, 0, 0, 0.2);
        }


        h1 {

            color: #333;
        }


        p {

            font-size: 18px;
        }


        .logout {

            display: inline-block;

            margin-top: 20px;

            padding: 10px 25px;

            background-color: #dc3545;

            color: white;

            text-decoration: none;

            border-radius: 5px;
        }


        .logout:hover {

            background-color: #b02a37;
        }

    </style>

</head>


<body>


<div class="container">


    <h1>Welcome!</h1>


    <p>

        Login successful.

    </p>


    <p>

        Welcome,
        ${user.username}

    </p>


    <a href="${pageContext.request.contextPath}/login"
       class="logout">

        Logout

    </a>


</div>


</body>

</html>