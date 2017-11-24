<%-- 
    Document   : buscar
    Created on : Nov 22, 2017, 11:37:34 PM
    Author     : Casa
--%>

<%@page import="java.util.List"%>
<%@page import="modelo.ComentariosPOJO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="StyleIndex.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Buscar</title>
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
						<a href="Inicio.html" >Inicio</a>
					</li>
					<li>
						<a href="Libros.html" >Libros</a>
					</li>
                                        <li>	
						<a href="Comentario.html" >Haz un comentario</a>
					</li>
				</ul>
			</nav>
        <% if (session != null) {
                List comentarios = (List) session.getAttribute("comentarios");
                if (comentarios != null) {
        %>
        <table border="1">
            <tr>
                <th>Nombre</th>
                <th>Comentario</th>
            </tr>
            <%
                for (Object o : comentarios) {
                    ComentariosPOJO comentario = (ComentariosPOJO) o;

            %>
            <tr>
                <td><%=comentario.getNombre()%></td>
                <td><%=comentario.getComentario()%></td>
            </tr>
            <% }  %>
        </table>
        <% }
            }%>
        <form action="ComentariosControlador" method="POST">
            Busqueda de comentarios
            <br>
           Nombre
            <input type="text" name="nombre"/>
            <br>
            Comentario
            <textarea rows="4" cols="50" name="comentario"></textarea>
            <input type="submit" value="Enviar"/>
            <input type="hidden" name="accion" value="buscar"/>

        </form>
    </body>
</html>
