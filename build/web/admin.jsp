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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
                <li class="${requestScope.active=="all"? "active":""}"><a href="./all"><i class="fa fa-file-audio"></i>All music </a></li>
                <li class="${requestScope.active=="chill"? "active":""}"><a href="./chill"><i class="fa fa-compact-disc"></i>Playlist chill </a></li>
                <li class="${requestScope.active=="focus"? "active":""}"><a href="./focus"><i class="fa-solid fa-music"></i>Playlist focus</a></li>
                <li class="${requestScope.active=="sleep"? "active":""}"><a href="./sleep"> <i class="fa-solid fa-microphone"></i> Playlist sleep</a></li>
                <li class="${requestScope.active=="user"? "active":""}"><a href="./user"><i class="fa-solid fa-id-card"></i>User </a></li>
            </ul>

        </div>
        <div class="main">
            <div class="header">
            </div>
            <!--List music-->
            <c:if test="${requestScope.list.size()>0}">
                <table>
                    <tr>
                        <td>ID</td>
                        <td>Name</td>
                        <td>Singer</td>
                        <td></td><td></td>
                    </tr>
                    <c:forEach items="${requestScope.list}" var="i">
                        <tr>
                            <td>${i.id}</td>
                            <td>${i.name}</td>
                            <td>${i.singer}</td>
                            <td><a href="updatemusic?id=${i.id}"><i class="fa fa-pen"></i></a></td>
                            <td><a href="" onclick="showMes(${i.id})"><i class="fa fa-trash-can"></i></a></td>
                        </tr>
                    </c:forEach>
                </table>
                <a href="./createmusic" ><i class="fa fa-plus"></i>Create</a>
            </c:if>
                <!--List user-->
            <c:if test="${requestScope.ulist.size()>0}">
                <table>
                    <tr>
                        <td>ID</td>
                        <td>Name</td>
                        <td>Username</td>
                        <td>Email</td>
                        <td>Role</td>
                        <td></td><td></td>
                    </tr>
                    <c:forEach items="${requestScope.ulist}" var="i">
                        <tr>
                            <td>${i.id}</td>
                            <td>${i.name}</td>
                            <td>${i.username}</td>
                            <td>${i.email}</td>
                            <td>${i.role==true?"Admin":"User"}</td>
                            <td><a href="updateuser?id=${i.id}"><i class="fa fa-pen"></i></a></td>
                            <td><a href="" onclick="showMess(${i.id})"><i class="fa fa-trash-can"></i></a></td>
                        </tr>
                    </c:forEach>
                </table>
                <a href="./createuser" ><i class="fa fa-plus"></i>Add user</a>
            </c:if>

        </div>
        <%--Update form --%>
        <div class="update_music ${requestScope.display=="uactive"?"display":""}">
            <div class="update_music_content">
                <h2>Update</h2>
                <form action="updatemusic" method="post" >
                    <div id="content" >
                        <c:set var="music" value="${requestScope.umusic}"/>
                        <table>
                            <tr>
                                <td>ID:</td>
                                <td><input type="text" disabled value="${music.id}">
                                    <input name="id" value="${music.id}" type="hidden" />
                                </td>

                            </tr>
                            <tr>
                                <td>Name:</td>
                                <td><input type="text" name="name" value="${music.name}"></td>
                            </tr><tr>
                                <td>Singer:</td>
                                <td><input type="text" name="singer" value="${music.singer}"></td>
                            </tr><tr>
                                <td>Path:</td>
                                <td><input type="text" name="path" value="${music.path}"></td>
                            </tr>
                        </table>
                    </div>
                    <div class="inputbtn"><input id="inputbtn" type="submit" value="Update"></div>
                </form>
            </div>
        </div>
        <%--Create form --%>
        <div class="update_music ${requestScope.display}">
            <div class="update_music_content">
                <h2>Update</h2>
                <form action="createmusic" method="post" enctype="multipart/form-data">
                    <div id="content" >
                        <c:set var="music" value="${requestScope.umusic}"/>
                        <table>
                            <tr>
                                <td>Upload file:</td>
                                <td><input type="file" name="file" size="60" /></td>

                            </tr>
                            <tr>
                                <td>Name:</td>
                                <td><input type="text" name="name" value="${music.name}"></td>
                            </tr><tr>
                                <td>Singer:</td>
                                <td><input type="text" name="singer" value="${music.singer}"></td>
                            </tr>
                        </table>
                    </div>
                    <div class="inputbtn"><input id="inputbtn" type="submit" value="Create"></div>
                </form>
            </div>
        </div>
    </body>
    <script>
        function showMes(id) {
            var check = confirm("Are you sure you want to remove this music ?");
            if (check === true) {
                window.location.href = "deletemusic?id=" + id;
            }
        }
        function showMess(id) {
            var check = confirm("Are you sure you want to remove this user ?");
            if (check === true) {
                window.location.href = "deleteuser?id=" + id;
            }
        }
    </script>
</html>
