<%-- 
    Document   : success
    Created on : 10/10/2017, 12:22:10 AM
    Author     : dany_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="StyleIndex.css" />
        <title>Inicio de sesion valido</title>
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
        <h1>Inicio de sesion valido</h1>
        <h2>Hola <%= request.getAttribute("usuario") %> </h2>   
        <a href="Inicio.html">Click para Iniciar :D</a>
    </body>
</html>
