<%-- 
    Document   : nadmin
    Created on : Mar 12, 2022, 6:43:59 PM
    Author     : hiepx
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Lofi music</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="assets/css/admin_style.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" />
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600&display=swap" rel="stylesheet">

        <link rel="stylesheet" href="assets/css/admin_style.css">
    </head>

    <body>
        <div class="nav">
            <h1><i class="fa-solid fa-headphones-simple"></i> Admin</h1>
            <ul id="nav">
                <li class="${requestScope.active}"><a href="./chill"><i class="fa fa-compact-disc"></i>Playlist chill </a></li>
                <li class="${requestScope.active}"><a href="./focus"><i class="fa-solid fa-music"></i>Playlist focus</a></li>
                <li class="${requestScope.active}"><a href="./sleep"> <i class="fa-solid fa-microphone"></i> Playlist sleep</a></li>
                <li class="${requestScope.active}"><a href="./user"><i class="fa-solid fa-id-card"></i>User </a></li>
            </ul>

        </div>
        <div class="main">
            <table>
                <tr>
                    <td>ID</td>
                    <td>Name</td>
                    <td>Singer</td>
                </tr>
                <c:forEach items="${requestScope.list}" var="i">
                    <tr>
                        <td>${i.id}</td>
                        <td>${i.name}</td>
                        <td>${i.singer}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
