
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link rel="stylesheet" href="estilo/style.css">
        <title>Crud Ismael Gym's</title>
    </head>
    <body style="background-image: url(imagenes/fondo.jpg);">
      <div id="navbar" style="height: 6px; margin-bottom: 65px;">
        <nav class="navbar fixed-top navbar-expand-lg navbar-light bg-secondary">
          <img src="imagenes/logoIsmaelMod.png" style="width: 150px; height: 52.65px;" alt="">
        </nav>
      </div>
      
      <div class="wrapper fadeInDown">
        <div id="formContent">
          <!-- Tabs Titles -->

          <!-- Icon -->
          <div class="fadeIn first">
            <img src="imagenes/logoIsmaelMod.png" id="icon" alt="User Icon" />
          </div>

          <!-- Login Form -->
          <form method="post" action="vistas/acceso.jsp">
            <input type="text" id="login" class="fadeIn second" name="usuario" placeholder="Nombre de usuario">
            <input type="text" id="password" class="fadeIn third" name="clave" placeholder="Contraseña">
            <input type="submit" name="aceptar" class="fadeIn fourth" value="Iniciar sesión">
          </form>

        </div>
      </div>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </body>
</html>
