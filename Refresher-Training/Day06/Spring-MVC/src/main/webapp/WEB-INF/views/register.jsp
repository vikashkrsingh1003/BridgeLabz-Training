<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>

    <meta charset="UTF-8">

    <title>Registration</title>


    <style>

        body {

            font-family: Arial, sans-serif;

            background-color: #f2f2f2;
        }


        .container {

            width: 400px;

            margin: 70px auto;

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


        .login-link {

            text-align: center;

            margin-top: 20px;
        }


        .error {

            color: red;

            text-align: center;
        }

    </style>

</head>


<body>


<div class="container">


    <h2>Create Account</h2>


    <!-- Error Message -->

    <% if (request.getAttribute("error") != null) { %>

        <p class="error">

            <%= request.getAttribute("error") %>

        </p>

    <% } %>


    <!-- Registration Form -->

    <form action="${pageContext.request.contextPath}/register"
          method="post">


        <label>Username</label>

        <input type="text"
               name="username"
               placeholder="Enter username"
               required>


        <label>Email</label>

        <input type="email"
               name="email"
               placeholder="Enter email"
               required>


        <label>Password</label>

        <input type="password"
               name="password"
               placeholder="Enter password"
               required>


        <button type="submit">

            Register

        </button>

    </form>


    <div class="login-link">

        Already have an account?

        <a href="${pageContext.request.contextPath}/login">

            Login

        </a>

    </div>


</div>


</body>

</html>