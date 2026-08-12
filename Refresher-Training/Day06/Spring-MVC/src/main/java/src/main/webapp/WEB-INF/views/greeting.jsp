<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

    <meta charset="UTF-8">

    <title>Greeting App</title>

    <style>

        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            text-align: center;
            padding-top: 80px;
        }

        .container {
            width: 500px;
            margin: auto;
            background: white;
            padding: 40px;
            border-radius: 10px;
            box-shadow: 0 0 10px #ccc;
        }

        input {
            padding: 12px;
            width: 250px;
            margin: 15px;
        }

        button {
            padding: 12px 20px;
            border: none;
            cursor: pointer;
            background-color: #333;
            color: white;
            border-radius: 5px;
        }

        .show-button {
            margin-top: 25px;
            background-color: #555;
        }

        .message {
            margin-top: 30px;
            font-size: 20px;
        }
		
		.logout-button {
		    margin-top: 15px;
		    background-color: #e53935;
		}

    </style>

</head>

<body>

<div class="container">

    <h1>Welcome to My Greeting App</h1>

    <p>Enter your name:</p>

    <!-- Greeting Form -->

    <form action="${pageContext.request.contextPath}/greet"
          method="post">

        <input
            type="text"
            name="name"
            placeholder="Enter your name"
            required>

        <br>

        <button type="submit">
            Greet Me
        </button>

    </form>


    <!-- Greeting Message -->

    <%
        String message = (String) request.getAttribute("message");

        if (message != null) {
    %>

        <div class="message">
            <h2><%= message %></h2>

            <p>
                Welcome to the Greeting App.
            </p>
        </div>

    <%
        }
    %>


    <!-- Show All Greetings -->

    <form action="${pageContext.request.contextPath}/greetings"
          method="get">

        <button type="submit" class="show-button">
            Show All Greetings
        </button>

    </form>
	
	
	<!-- Logout -->

	<form action="${pageContext.request.contextPath}/logout"
	      method="get">

	    <button type="submit" class="logout-button">
	        Logout
	    </button>

	</form>

</div>

</body>
</html>