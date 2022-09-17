package Controlador;

import Modelo.Calzado;
import Modelo.CalzadoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CalzadoControlador extends HttpServlet {

    Calzado caz = new Calzado();
    CalzadoDAO obj = new CalzadoDAO();
    String resultado = "";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalzadoControlador</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CalzadoControlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        String accion = request.getParameter("calcular");

        if (accion.equalsIgnoreCase("calculardatos")) {
            resultado = "";
            String cb_marca = request.getParameter("cbmarca");
            int cb_talla = Integer.parseInt(request.getParameter("cbtalla"));
            int pares = Integer.parseInt(request.getParameter("txtpares"));
            caz.setMarca(cb_marca);
            caz.setTalla(cb_talla);
            caz.setNumeroparesvendidos(pares);
            resultado = obj.CalcularCalzado(cb_marca, cb_talla, pares);
            

           request.setAttribute("resultado_calzado", resultado);
            
            request.getRequestDispatcher("FrmCalzado.jsp").forward(request, response);

        } else {
            request.getRequestDispatcher("FrmCalzado.jsp").forward(request, response);

        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
