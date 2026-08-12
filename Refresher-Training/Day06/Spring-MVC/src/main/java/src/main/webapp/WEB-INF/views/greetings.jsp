<%@ page language="java"
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c"
    uri="jakarta.tags.core" %>

<!DOCTYPE html>

<html>

<head>

    <meta charset="UTF-8">

    <title>All Greetings</title>

    <style>

        body {
            font-family: Arial;
            background: #f4f4f4;
            padding: 50px;
        }

        .container {
            width: 650px;
            margin: auto;
            background: white;
            padding: 30px;
            border-radius: 10px;
        }

        h1 {
            text-align: center;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 25px;
        }

        th, td {
            border: 1px solid #ddd;
            padding: 12px;
            text-align: center;
        }

        th {
            background: #333;
            color: white;
        }

        input {
            padding: 8px;
        }

        button {
            padding: 8px 15px;
            border: none;
            cursor: pointer;
            color: white;
            border-radius: 4px;
        }

        .edit {
            background: #2196F3;
        }

        .delete {
            background: #f44336;
        }

        .back {
            margin-top: 25px;
            text-align: center;
        }

    </style>

</head>

<body>

<div class="container">

    <h1>All Greetings</h1>

    <table>

        <tr>

            <th>Name</th>

            <th>Action</th>

        </tr>


        <c:forEach var="greeting"
                   items="${greetings}">

            <tr>

                <td>

                    <!-- Edit form -->

                    <form action="${pageContext.request.contextPath}/edit"
                          method="post">

                        <input type="hidden"
                               name="id"
                               value="${greeting.id}">

                        <input type="text"
                               name="name"
                               value="${greeting.name}"
                               required>

                        <button type="submit"
                                class="edit">
                            Edit
                        </button>

                    </form>

                </td>


                <td>

                    <!-- Delete -->

                    <a href="${pageContext.request.contextPath}/delete?id=${greeting.id}"
                       onclick="return confirm('Delete this greeting?');">

                        <button type="button"
                                class="delete">
                            Delete
                        </button>

                    </a>

                </td>

            </tr>

        </c:forEach>

    </table>


    <div class="back">

        <a href="${pageContext.request.contextPath}/greeting">

            ← Back to Greeting App

        </a>

    </div>

</div>

</body>

</html>