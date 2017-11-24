<%-- 
    Document   : login
    Created on : 10/10/2017, 12:20:49 AM
    Author     : Daniel Guadalupe Reyes Mireles
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="StyleIndex.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar sesion</title>
    </head>
    <body>
        <header>
			<hgroup>
				<h1>LibrosGratis</h1>
				<h2>Proyecto Final</h2>
			</hgroup>
		</header>
			<nav>
				<ul>
					<li>
						<a href="Inicio1.html" >Inicio</a>
					</li>
                                        <li>	
						<a href="Registro.html" >Registrarse</a>
					</li>
					<li>	
						<a href="login.jsp" >Iniciar sesion</a>
					</li>
				</ul>
			</nav>

        <h1>Bienvenido</h1>
        <form action="LoginController" method="POST">
            Usuario <br>
            <input type="text" name="use">
            <br>
            Contraseña <br>
            <input type="password" name="pas">
            <br>
            <input type="submit" value="Iniciar Sesion">
        </form>
    </body>
</html>
