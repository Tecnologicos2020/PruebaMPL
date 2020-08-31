<%-- 
    Document   : Bienvenida
    Created on : 30-ago-2020, 21:44:58
    Author     : ebarrero
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenida</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-dark bg-dark">
            <a style="color:white" class="navbar-toggler"><span class="navbar-toggler-icon"></span>Home</a>
            <div class="dropdown">
                <a style="color:white" href="index.jsp" class="nav-link dropdown-toggle" data-toggle="dropdown">Cerrar sesion</a>
                <div class="dropdown-menu text-center">
                    <a><img src="img/user.png" height="80" width="80"/></a><br>
                    <a>${id}</a>
                    <div class="dropdown-divider"></div>
                    <a href="index.jsp" class="dropdown-item">Salir</a>
                </div>
            </div>
        </nav>
        <div class="container mt-4"> 
            <h1>Bienvenido ${id} <strong>Session: ${sesion} </strong></h1> 
        </div>
        
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
    </body>
</html>
