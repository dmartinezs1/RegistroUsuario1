<%--
  Created by IntelliJ IDEA.
  User: Daniel
  Date: 8/28/2021
  Time: 7:59 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Inicio .:. Mesa de ayuda</title>
    <meta name="viewport" content="width-device.width, iniciatl-scale=1.0">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- bootstrap por content delivery network-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <header>
        <nav class="navbar navbar-expand-xl bg-secondary navbar-dark">
            <div class="container-fluid">
                <a href="#" class="navbar-brand text-warning">Mesa de ayuda</a>
                <div class="navbar-nav ms-auto">
                    <a href="#" class="nav-item nav-link">Inicio</a>
                    <a href="#" class="nav-item nav-link active">Registrarse</a>
                    <a href="#" class="nav-item nav-link">Ingresar</a>
                </div>
                <div class="navbar-text text-warning ms-3">Ayuda a un click</div>
            </div>
        </nav>
    </header>
    <main>
        <section>
            <em>Register User</em><br/>
            <em>{0}</em>
            <form action="registro" method="post">
                <div class="mb-.5" id="nombresDiv">
                    <label for="nombres" class="form-label fw-bold">Nombres:</label><br>
                    <input type="text" name="nombres" id="nombres" required autofocus
                           placeholder="nombres..."
                           pattern="[A-Za-z ]{2,30}"
                           aria-describedby="nombreHelp"><span class="text-danger">*</span>
                    <div id="nombreHelp">¿Cuáles son sus nombres? De 2 a 30 caracteres</div>
                    <div class="valid-feedback"></div>
                    <div class="invalid-feedback">Por favor revise que los datos ingresador correspondan
                        con lo solicitado
                    </div>
                </div> <!--nombresDiv-->
                <div class="mb-.5" id="apellidosDiv">
                    <label for="apellidos" class="form-label fw-bold">Apellidos:</label><br>
                    <input type="text" name="apellidos" id="apellidos" required autofocus
                           placeholder="apellidos..."
                           pattern="[A-Za-z ]{2,30}"
                           aria-describedby="nombreHelp"><span class="text-danger">*</span>
                    <div id="apellidosHelp">¿Cuáles son sus apellidos? De 2 a 30 caracteres</div>
                    <div class="valid-feedback"></div>
                    <div class="invalid-feedback">Por favor revise que los datos ingresador correspondan
                        con lo solicitado
                    </div>
                </div>
                <div>
                    <label for="correo" class="form-label fw-bold">Email:</label><br>
                    <input type="email" name="correo" id="correo" required autofocus
                           placeholder="email.."
                           aria-describedby="correohelp"><span class="text-danger">*</span>
                    <div id="correohelp" class="form-text">Escriba su Email Max20</div>
                    <div class="valid-feedback"></div>
                    <div class="invalid-feedback">Por favor revise que los datos correspondan</div>

                    <label for="contraseña" class="form-label fw-bold">Contraseña:</label><br>
                    <input type="password" name="contraseña" id="contraseña" required autofocus
                           placeholder="contraseña.."
                           aria-describedby="contraseñahelp"><span class="text-danger">*</span>
                    <div id="contraseñahelp" class="form-text">Escriba su contraseña Min.2 Max30</div>
                    <div class="valid-feedback"></div>
                    <div class="invalid-feedback">Por favor revise que los datos correspondan</div>

                    <input type="submit" value="Enviar"/>
                </div>
            </form>
        </section>
    </main>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj"
        crossorigin="anonymous"></script>

</body>
</html>
