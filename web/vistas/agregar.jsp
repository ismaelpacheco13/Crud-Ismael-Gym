<%-- 
    Document   : agregar
    Created on : 28-feb-2020, 13:19:13
    Author     : ismael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <title>Agregar Ismael Gym's</title>
    </head>
    <body style="background-image: url(imagenes/fondo.jpg);">
        <div id="navbar" style="height: 6px; margin-bottom: 65px;">
            <nav class="navbar fixed-top navbar-expand-lg navbar-light bg-secondary">
                <img src="imagenes/logoIsmaelMod.png" style="width: 150px; height: 52.65px;" alt="">
            </nav>
        </div>
        <div class="container text-white">
            <div class="col-lg-6">
                <h1>Agregar Persona</h1>
                <form action="Controlador">
                    DNI:<br>
                    <input class="form-control" type="text" name="txtDni"><br>
                    Nombres: <br>
                    <input class="form-control" type="text" name="txtNom"><br>
                    <div class="form-group">
                      <label for="GimnasioPreferido">Gimnasio Preferido</label>
                      <select class="form-control" id="GimnasioPreferido">
                        <c:forEach items="${listCategory}" var="category">
                          <option value="${category.id}"
                        <c:if test="${category.id eq selectedCatId}">selected="selected"</c:if>
                        >
                        ${category.name}
                        </option>
                      </c:forEach>
                      </select>
                    </div>
                    <input class="btn btn-primary" type="submit" name="accion" value="Agregar"><br>
                </form> 
            </div>
        </div>
    </body>
</html>
