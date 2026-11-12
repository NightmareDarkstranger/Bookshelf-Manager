<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="Model.Book" %>

<!DOCTYPE html>
<html>
<head>
    <title>My Collection</title>

    <style>

        body {
            font-family: Arial, sans-serif;
            background: #1e1e2f;
            color: white;
            margin: 0;
            padding: 20px;
        }

        h1 {
            text-align: center;
            color: #4CAF50;
            margin-bottom: 30px;
        }

        .table-container {
            width: 90%;
            margin: auto;
            background: #2a2a40;
            border-radius: 12px;
            overflow: hidden;
            box-shadow: 0 0 15px rgba(0,0,0,0.4);
        }

        table {
            width: 100%;
            border-collapse: collapse;
        }

        th {
            background: #4CAF50;
            color: white;
            text-align: left;
            padding: 15px;
        }

        td {
            padding: 15px;
            border-bottom: 1px solid #444;
        }

        tr:nth-child(even) {
            background: #32324d;
        }

        tr:hover {
            background: #3d3d5c;
        }

        .home-btn {
            display: block;
            width: 200px;
            margin: 30px auto;
            text-align: center;
            padding: 12px;
            background: #4CAF50;
            color: white;
            text-decoration: none;
            border-radius: 8px;
            font-weight: bold;
        }

        .home-btn:hover {
            background: #45a049;
        }

        .empty-message {
            text-align: center;
            padding: 25px;
            font-size: 18px;
        }

    </style>

</head>
<body>

<h1>My Collection</h1>

<div class="table-container">

    <table>

        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Author</th>
            <th>Genre</th>
            <th>Shelf Location</th>
        </tr>

        <%
            List<Book> books = (List<Book>) request.getAttribute("books");

            if (books != null && !books.isEmpty()) {

                for (Book book : books) {
        %>

        <tr>
            <td><%= book.getBookId() %></td>
            <td><%= book.getTitle() %></td>
            <td><%= book.getAuthor() %></td>
            <td><%= book.getGenre() %></td>
            <td><%= book.getShelfLocation() %></td>
        </tr>

        <%
                }
            } else {
        %>

        <tr>
            <td colspan="5" class="empty-message">
                No books found in your collection.
            </td>
        </tr>

        <%
            }
        %>

    </table>

</div>

<a href="index.jsp" class="home-btn">
     Home
</a>

</body>
</html>