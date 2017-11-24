package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import modelo.ComentariosPOJO;

public final class buscar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"StyleIndex.css\" />\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Buscar</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("\t\t\t<hgroup>\n");
      out.write("\t\t\t\t<h1>LibrosGratis</h1>\n");
      out.write("\t\t\t\t<h2>Proyecto Final</h2>\n");
      out.write("\t\t\t</hgroup>\n");
      out.write("\t\t</header>\n");
      out.write("\t\t\t<nav>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<a href=\"Inicio.html\" >Inicio</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<a href=\"Libros.html\" >Libros</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\t\n");
      out.write("\t\t\t\t\t\t<a href=\"Registro.html\" >Registrarse</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\t\n");
      out.write("\t\t\t\t\t\t<a href=\"IniciarSesion.jsp\" >Iniciar sesion</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("                                        <li>\t\n");
      out.write("\t\t\t\t\t\t<a href=\"Comentario.html\" >Haz un comentario</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</nav>\n");
      out.write("        ");
 if (session != null) {
                List comentarios = (List) session.getAttribute("comentarios");
                if (comentarios != null) {
        
      out.write("\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Nombre</th>\n");
      out.write("                <th>Comentario</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                for (Object o : comentarios) {
                    ComentariosPOJO comentario = (ComentariosPOJO) o;

            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(comentario.getNombre());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(comentario.getComentario());
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
 }  
      out.write("\n");
      out.write("        </table>\n");
      out.write("        ");
 }
            }
      out.write("\n");
      out.write("        <form action=\"ComentariosControlador\" method=\"POST\">\n");
      out.write("            Busqueda de comentarios\n");
      out.write("            <br>\n");
      out.write("           Nombre\n");
      out.write("            <input type=\"text\" name=\"nombre\"/>\n");
      out.write("            <br>\n");
      out.write("            Comentario\n");
      out.write("            <textarea rows=\"4\" cols=\"50\" name=\"comentario\"></textarea>\n");
      out.write("            <input type=\"submit\" value=\"Enviar\"/>\n");
      out.write("            <input type=\"hidden\" name=\"accion\" value=\"buscar\"/>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
