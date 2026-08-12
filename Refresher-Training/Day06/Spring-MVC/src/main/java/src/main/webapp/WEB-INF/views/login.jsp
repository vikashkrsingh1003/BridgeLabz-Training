<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>

    <meta charset="UTF-8">

    <title>Login</title>

    <style>

        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
        }

        .container {
            width: 400px;
            margin: 100px auto;
            padding: 30px;

            background-color: white;

            border-radius: 10px;

            box-shadow:
                0 0 10px rgba(0, 0, 0, 0.2);
        }

        h2 {
            text-align: center;
            margin-bottom: 25px;
        }

        label {
            display: block;
            margin-top: 15px;
            margin-bottom: 5px;
        }

        input {
            width: 100%;
            padding: 10px;

            box-sizing: border-box;
        }

        button {
            width: 100%;

            padding: 10px;

            margin-top: 25px;

            background-color: #007bff;

            color: white;

            border: none;

            border-radius: 5px;

            cursor: pointer;
        }

        button:hover {
            background-color: #0056b3;
        }

        .register-link {
            text-align: center;
            margin-top: 20px;
        }

        .error {
            color: red;
            text-align: center;
        }

        .message {
            color: green;
            text-align: center;
        }

    </style>

</head>


<body>


<div class="container">

    <h2>Login</h2>


    <!-- Success Message -->

    <% if (request.getAttribute("message") != null) { %>

        <p class="message">

            <%= request.getAttribute("message") %>

        </p>

    <% } %>


    <!-- Error Message -->

    <% if (request.getAttribute("error") != null) { %>

        <p class="error">

            <%= request.getAttribute("error") %>

        </p>

    <% } %>


    <!-- Login Form -->

    <form action="${pageContext.request.contextPath}/login"
          method="post">


        <label>Username</label>

        <input type="text"
               name="username"
               placeholder="Enter username"
               required>


        <label>Password</label>

        <input type="password"
               name="password"
               placeholder="Enter password"
               required>


        <button type="submit">

            Login

        </button>

    </form>


    <div class="register-link">

        Don't have an account?

        <a href="${pageContext.request.contextPath}/register">

            Register

        </a>

    </div>


</div>


</body>

</html>