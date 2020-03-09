
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Persona"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.PersonaDAO"%>
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
            <a class="btn btn-success" href="Controlador?accion=agregar">Agregar Nuevo</a>
            <a class="btn btn-success" href="Controlador?accion=listarGimnasioAdmin">Lista Gimnasios</a>
            <a class="btn btn-primary" href="index.jsp">Cerrar sesión</a>
            <br>
            <br>
            <table class="table table-bordered table-dark text-white">
                <thead class="text-center">
                    <tr>
                        <th>ID</th>
                        <th>DNI</th>
                        <th>NOMBRES</th>
                        <th>GIMNASIO PREFERIDO</th>
                        <th>ACCIONES</th>
                    </tr>
                </thead>
                <%
                    PersonaDAO dao = new PersonaDAO();
                    List<Persona>lista = dao.listar();
                    Iterator<Persona>iter = lista.iterator();
                    Persona per = null;
                    while (iter.hasNext()) {
                      per = iter.next();
                    
                %>
                <tbody class="text-center">
                    <tr>
                        <td><%= per.getId() %></td>
                        <td><%= per.getDni() %></td>
                        <td><%= per.getNombre()%></td>
                        <td><%= per.getGimPreString()%></td>
                        <td>
                            <a class="btn btn-warning text-white" href="Controlador?accion=editar&id=<%= per.getId() %>">Editar</a>
                            <a class="btn btn-danger" href="Controlador?accion=eliminar&id=<%= per.getId() %>">Eliminar</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>

        </div>
    </body>
</html>
