Created by IntelliJ IDEA.
User: Daniel
Date: 9/23/2021
Time: 9:12 p. m.
To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="co.edu.sena.RegistroUsuario.model.bean.PersonajeBean" %>
<%@page import="java.util.List"%>

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
                    <a href="#" class="nav-item nav-link">Registrarse</a>
                    <a href="#" class="nav-item nav-link">Ingresar</a>
                    <a href="#search" class="nav-item nav-link active">Buscar Personaje</a>
                </div>
            </div>
        </nav>
    </header>
    <main>

        <section id="personajes" class="section">
            <div class="container">
                <h2 class="headline">Personajes</h2>
            </div>


            <%--fetch he products from the rqq object --%>
            <%-- iterate the list and generate the display for every product --%>


            <div class="personajeContainer">

                <%
                    List<PersonajeBean> personajes = (ArrayList) request.getAttribute("personajes");
                    Iterator<PersonajeBean> iterator = personajes.iterator();
                    while (iterator.hasNext()) {
                        PersonajeBean personaje = iterator.next();
                %>
                <form method="get" action="personajes">

                    <div class="productContainerItem">
                        <img id="pic3" src="<%=personaje.getRuta_imagen()%>">
                        <input type="text" name="product" value="<%=personaje.getNombre_personaje()%>"><br/>
                        <button>Add to Cart</button>
                    </div>
                </form>
                <%
                    }
                %>
            </div>
        </section>
        <!-- #products -->

        <section id="search" class="section">
            <header class="imageheader"></header>
            <div class="container">
                <h2 class="headline">Search Products</h2>
                <form action="search" method="get">
                    <label class="card-title">Search your product</label>
                    <input type="search" name="search">
                    <input type="submit" value="Search">
                </form>
            </div>
        </section>

    </main>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj"
        crossorigin="anonymous"></script>

</body>
</html>