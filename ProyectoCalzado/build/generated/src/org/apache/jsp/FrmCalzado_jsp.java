package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FrmCalzado_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Tienda Calzado</title>\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div>\n");
      out.write("        <div class=\"contenedor\">\n");
      out.write("            <form action=\"CalzadoControlador\" method=\"POST\">\n");
      out.write("                <div>\n");
      out.write("                    <label>Marca: </label>\n");
      out.write("                    <div>\n");
      out.write("                        <select name=\"cbmarca\" style=\"width:250px\">\n");
      out.write("                            <option selected=\"true\" disabled=\"disabled\">seleccione la marca</option>\n");
      out.write("                            <option value=\"Batta\">Batta</option>\n");
      out.write("                            <option value=\"Calimod\">Calimod</option>\n");
      out.write("                            <option value=\"Azaleia\">Azaleia</option>\n");
      out.write("                            <option value=\"Renzo Costa\">Renzo Costa</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <label> Talla:</label>\n");
      out.write("                    <div>\n");
      out.write("                        <select name=\"cbtalla\" style=\"width:250px\">\n");
      out.write("                            <option selected=\"true\" disabled=\"disabled\">seleccione la talla</option>\n");
      out.write("                            <option value=\"30\">30</option>\n");
      out.write("                            <option value=\"35\">35</option>\n");
      out.write("                            <option value=\"39\">39</option>\n");
      out.write("                            <option value=\"40\">40</option>\n");
      out.write("                            <option value=\"44\">44</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <label>Numero de Pares Vendidos</label>\n");
      out.write("                    <div class=\"\">\n");
      out.write("                        <input type=\"txt\" name=\"txtpares\" style=\"width:134px;\">\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"botones\">\n");
      out.write("                    <input type=\"submit\" name=\"calcular\" value=\"calculardatos\" style=\"width:150px\">\n");
      out.write("                </div>\n");
      out.write("                <br><br>\n");
      out.write("                <textarea disabled style=\"width:340px;height:220px;\" rows=\"10\"\n");
      out.write("                    cols=\"30\"> ");
      out.print(request.getAttribute("resultado_calzado"));
      out.write("</textarea>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
