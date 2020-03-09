package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("        <title>Crud Ismael Gym's</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: url(imagenes/fondo.jpg);\">\n");
      out.write("      <div id=\"navbar\" style=\"height: 6px; margin-bottom: 65px;\">\n");
      out.write("            <nav class=\"navbar fixed-top navbar-expand-lg navbar-light bg-secondary\">\n");
      out.write("                <img src=\"imagenes/logoIsmaelMod.png\" style=\"width: 150px; height: 52.65px;\" alt=\"\">\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("      <div class=\"row\"></div>\n");
      out.write("      <div class=\"row text-white\">\n");
      out.write("        <div class=\"row col m3\"></div>\n");
      out.write("        <div class=\"col m6 card-panel grey lighten-5\">\n");
      out.write("          <h5 class=\"center\">Control de acceso</h5>\n");
      out.write("          <form method=\"post\" action=\"acceso.jsp\">\n");
      out.write("            <div class=\"input-field\">\n");
      out.write("              <i class=\"material-icons prefix\">account_circle</i>\n");
      out.write("              <input type=\"text\" name=\"usuario\" id=\"usuario\" required>\n");
      out.write("              <label for=\"usuario\">Usuario</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-field\">\n");
      out.write("              <i class=\"material-icons prefix\">lock</i>\n");
      out.write("              <input type=\"password\" name=\"clave\" id=\"clave\" required>\n");
      out.write("              <label for=\"clave\">Contraseña</label>\n");
      out.write("            </div>\n");
      out.write("            <p class=\"center\"><button class=\"btn waves-effect waves-light center\" type=\"submit\" name=\"aceptar\">\n");
      out.write("              Aceptar\n");
      out.write("              <i class=\"material-icons\">check_circle</i>\n");
      out.write("            </button></p>\n");
      out.write("            <br>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Optional JavaScript -->\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\n");
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
