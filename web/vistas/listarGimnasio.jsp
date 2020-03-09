
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Gimnasio"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.GimnasioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <title>Crud Ismael Gym's</title>
    </head>
    <body style="background-image: url(imagenes/fondo.jpg);">
        <div id="navbar" style="height: 6px; margin-bottom: 65px;">
            <nav class="navbar fixed-top navbar-expand-lg navbar-light bg-secondary">
                <img src="imagenes/logoIsmaelMod.png" style="width: 150px; height: 52.65px;" alt="">
            </nav>
        </div>
        <div class="container text-white">
            <a class="btn btn-primary" href="index.jsp">Cerrar sesión</a>
            <br>
            <br>
            <table class="table table-bordered table-dark text-white">
                <thead class="text-center">
                    <tr>
                        <th>NOMBRE</th>
                        <th>DIRECCIÓN</th>
                        <th>HORARIO</th>
                        <th>CLASES</th>
                    </tr>
                </thead>
                <%
                    GimnasioDAO dao = new GimnasioDAO();
                    List<Gimnasio>lista = dao.listar();
                    Iterator<Gimnasio>iter = lista.iterator();
                    Gimnasio gim = null;
                    while (iter.hasNext()) {
                      gim = iter.next();
                    
                %>
                <tbody class="text-center">
                    <tr>
                        <td><%= gim.getNomGim() %></td>
                        <td><%= gim.getDirGim() %></td>
                        <td><%= gim.getHorGim() %></td>
                        <td><%= gim.getClaGim() %></td>
                    </tr>
                    <%}%>
                </tbody>
            </table>

        </div>
    </body>
</html>
