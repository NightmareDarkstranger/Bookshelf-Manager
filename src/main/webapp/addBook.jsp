<!DOCTYPE html>
<html>
<head>
    <title>Add Book</title>

    <style>

        body {
            font-family: Arial, sans-serif;
            background: #1e1e2f;
            color: white;
            margin: 0;
            padding: 0;
        }

        .container {
            width: 500px;
            margin: 50px auto;
            background: #2a2a40;
            padding: 30px;
            border-radius: 12px;
            box-shadow: 0 0 15px rgba(0,0,0,0.4);
        }

        h1 {
            text-align: center;
            color: #4CAF50;
            margin-bottom: 25px;
        }

        label {
            display: block;
            margin-top: 15px;
            margin-bottom: 5px;
            font-weight: bold;
        }

        input[type="text"] {
            width: 100%;
            padding: 12px;
            border: none;
            border-radius: 8px;
            background: #3a3a55;
            color: white;
            box-sizing: border-box;
        }

        input[type="text"]:focus {
            outline: none;
            border: 2px solid #4CAF50;
        }

        .submit-btn {
            width: 100%;
            margin-top: 25px;
            padding: 12px;
            background: #4CAF50;
            border: none;
            border-radius: 8px;
            color: white;
            font-size: 16px;
            font-weight: bold;
            cursor: pointer;
        }

        .submit-btn:hover {
            background: #45a049;
        }

        .home-btn {
            display: block;
            margin-top: 15px;
            text-align: center;
            text-decoration: none;
            color: white;
            background: #555;
            padding: 12px;
            border-radius: 8px;
        }

        .home-btn:hover {
            background: #666;
        }

    </style>

</head>
<body>

<div class="container">

    <h1>Add Book</h1>

    <form action="AddBookServlet" method="post">

        <label>Title</label>
        <input type="text" name="title" required>

        <label>Author</label>
        <input type="text" name="author" required>

        <label>Genre</label>
        <input type="text" name="genre" required>

        <label>Shelf Location</label>
        <input type="text" name="shelfLocation" required>

        <input type="submit" value="Add Book" class="submit-btn">

    </form>

    <a href="index.jsp" class="home-btn"> Home</a>

</div>

</body>
</html>