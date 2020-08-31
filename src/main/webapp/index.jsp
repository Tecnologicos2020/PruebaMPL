<%-- 
    Document   : vista
    Created on : 30-ago-2020, 13:23:15
    Author     : ebarrero
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        <title>Listar</title>
    </head>
    <body>
        
        <div class="container col-lg-3">
            <form action="Controlador" method="post">
                
                <div class="form-group text-center">
                    <img src="img/user.png" height="80" width="80"/>
                    <p><strong>Bienvenido</strong></p>
                </div>
                
                <div class="form-group">
                    <label>ID</label>
                    <input class="form-control" type="text" name="id" placeholder="Ingrese ID" required/>   
                </div>
                
                <div class="form-group">
                    <label>PW</label>
                    <input class="form-control" type="password" name="pw" placeholder="Ingrese pw" required/>  
                </div>

                <input class="btn btn-danger btn-block" type="submit" name="accion" value="Ingresar"/>

            </form>
        </div>

        <script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    </body>
</html>
