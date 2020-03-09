<%-- 
    Document   : editar
    Created on : 28-feb-2020, 13:19:20
    Author     : ismael
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="Modelo.Gimnasio"%>
<%@page import="ModeloDAO.GimnasioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <title>Editar Ismael Gym's</title>
    </head>
    <body style="background-image: url(imagenes/fondo.jpg);">
        <div id="navbar" style="height: 6px; margin-bottom: 65px;">
            <nav class="navbar fixed-top navbar-expand-lg navbar-light bg-secondary">
                <img src="imagenes/logoIsmaelMod.png" style="width: 150px; height: 52.65px;" alt="">
            </nav>
        </div>
        <div class="container text-white">
            <div class="col-lg-6">
                <%
                  GimnasioDAO dao = new GimnasioDAO();
                  int id = Integer.parseInt((String) request.getAttribute("codgim"));
                  Gimnasio g = (Gimnasio) dao.listar(id);
                %>
                <h1>Modificar Persona</h1>
                <form action="Controlador">
                    Nombre:<br>
                    <input class="form-control" type="text" name="txtNomGim" value="<%= g.getNomGim()%>"><br>
                    Dirección: <br>
                    <input class="form-control" type="text" name="txtDirGim" value="<%= g.getDirGim()%>"><br>
                    Horario: <br>
                    <input class="form-control" type="text" name="txtHorGim" value="<%= g.getHorGim()%>"><br>
                    Clases: <br>
                    <input class="form-control" type="text" name="txtClaGim" value="<%= g.getClaGim()%>"><br>
                    <input type="hidden" name="txtid" value="<%= g.getCodGim()%>">
                    <input class="btn btn-primary" type="submit" name="accion" value="Actualizar Gimnasio"><br>
                </form>
            </div> 
        </div>
    </body>
</html>
