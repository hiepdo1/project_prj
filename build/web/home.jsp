<%-- 
    Document   : home
    Created on : Mar 5, 2022, 6:14:35 PM
    Author     : hiepx
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!DOCTYPE html>
<html style=" background-image: url('assets/img/lofi1.gif');">

    <head>
        <title>Lofi music</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="assets/css/home_style.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css" />
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600&display=swap" rel="stylesheet">
    </head>

    <body>
        <div id="main">
            <div id="header">
                <!-- Nav -->
                <div class="nav">
                    <ul id="nav">
                        <li><a href="#">Home</a></li>
                        <li><a href="#the-band">Playlist chill </a></li>
                        <li><a href="#tour">Playlist focus</a></li>
                        <li><a href="#contact">Playlist sleep</a></li>
                        <li><a href="#contact">Your favarite playlist</a></li>
                        <li><a href="#">Login</a></li>
                    </ul>
                </div>
                <!-- Search button -->
                <div class="search-btn">
                    <i class="search-icon ti-search"></i>
                </div>
            </div>
            <div class="list-music">
                <h2 id="list-music-name">List music</h2>
                <c:forEach items="${requestScope.list}" var="i">
                    <div class="song-item" data-id="${i.id}" data-name="${i.name}" data-path="${i.path}" >
                        <p>${i.id}.${i.name}</p>
                    </div> 
                </c:forEach>
            </div>
        </div>
        <!--Footer -->
        <div class="footer">
            <div class="control">
                <div class="btn btn-repeat">
                    <i class="fas fa-redo"></i>
                </div>
                <div class="btn btn-prev">
                    <i class="fas fa-step-backward"></i>
                </div>
                <div class="btn btn-toggle-play">
                    <i class="fas fa-pause icon-pause"></i>
                    <i class="fas fa-play icon-play"></i>
                </div>
                <div class="btn btn-next">
                    <i class="fas fa-step-forward"></i>
                </div>
                <div class="btn btn-random ">
                    <i class="fas fa-random"></i>
                </div>
                <div class="sideBar" ><div class="sideBar-time"></div></div>
                <audio id="audio" src=""></audio>
            </div>
        </div>

    </body>
    <script src="assets/css/home.js"></script>


</html>
