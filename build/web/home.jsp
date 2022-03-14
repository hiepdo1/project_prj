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
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" />
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600&display=swap" rel="stylesheet">
    </head>

    <body>
        <div id="main">
            <div id="header">
                <!-- Nav -->
                <div class="nav">
                    <ul id="nav">
                        <li><a href="./home.jsp">Home</a></li>
                        <li><a href="./chill?auth=home">Playlist chill </a></li>
                        <li><a href="./focus?auth=home">Playlist focus</a></li>
                        <li><a href="./sleep?auth=home">Playlist sleep</a></li>
                        <li style="display: none;"><a href="#contact">Your favarite playlist</a></li>
                        <li style><a id="login">Login</a></li>
                        <li style><a id="lohout">Logout</a></li>
                    </ul>
                </div>
                <!-- Search button -->
                <div class="search-btn">
                    <i class="search-icon ti-search"></i>
                </div>
            </div>
            <div class="list-music">
                <c:forEach items="${requestScope.list}" var="i">
                    <div class="song-item" data-id="${i.id}" data-name="${i.name}" data-path="${i.path}" >
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
        <!-- Login -->
        <div class="login_form">
            <div class="login_content">
                <form action="loginservlet" method="post" >
                    <i class="fas fa-xmark"></i>
                    <h1>Login</h1>
                    <div class=""><i class="fas fa-user-astronaut"></i><input class="input" type="text" name="username"
                            placeholder="Username"></div>
                    <div><i class="fas fa-lock"></i><input class="input" type="password" name="password"
                            placeholder="Password"></div>
                    <div class="login-footer">
                        <input id="submit" type="submit" name="login" value="Login">
                        <p id="text">Not a member?<a id="signup" href="#">Signup</a></p>
                    </div>

                </form>
            </div>
        </div>

    </body>
    <script src="assets/css/home.js"></script>


</html>
