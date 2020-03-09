
package Controlador;

import Modelo.Gimnasio;
import Modelo.Persona;
import ModeloDAO.GimnasioDAO;
import ModeloDAO.PersonaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controlador extends HttpServlet {
  
  String listar = "vistas/listar.jsp";
  String listarGimnasio = "vistas/listarGimnasio.jsp";
  String listarGimnasioAdmin = "vistas/listarGimnasioAdmin.jsp";
  String agregar = "vistas/agregar.jsp";
  String agregarGimnasio = "vistas/agregarGimnasio.jsp";
  String editar = "vistas/editar.jsp";
  String editarGimnasio = "vistas/editarGimnasio.jsp";
  int id;
  Persona p = new Persona();
  PersonaDAO dao = new PersonaDAO();
  Gimnasio g = new Gimnasio();
  GimnasioDAO daoGim = new GimnasioDAO();
  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    try (PrintWriter out = response.getWriter()) {
      /* TODO output your page here. You may use following sample code. */
      out.println("<!DOCTYPE html>");
      out.println("<html>");
      out.println("<head>");
      out.println("<title>Servlet Controlador</title>");      
      out.println("</head>");
      out.println("<body>");
      out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
      out.println("</body>");
      out.println("</html>");
    }
  }

  // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
  /**
   * Handles the HTTP <code>GET</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    String acceso = "";
    String action = request.getParameter("accion");
    
    if (action.equalsIgnoreCase("listar")) {
      acceso = listar;
    } else if (action.equals("listarGimnasio")) {
      acceso = listarGimnasio;
    } else if (action.equals("listarGimnasioAdmin")) {
      acceso = listarGimnasioAdmin;
    } else if (action.equals("agregar")) {
      acceso = agregar;
    } else if (action.equals("agregarGimnasio")) {
      acceso = agregarGimnasio;
    } else if (action.equals("Agregar")) {
      String dni = request.getParameter("txtDni");
      String nombre = request.getParameter("txtNom");
      int gimPre = Integer.parseInt(request.getParameter("intGimPre"));
      p.setDni(dni);
      p.setNombre(nombre);
      p.setGimPre(gimPre);
      dao.agregar(p);
      acceso = listar;
    } else if (action.equals("Agregar Gimnasio")) {
      String nomGim = request.getParameter("txtNomGim");
      String dirGim = request.getParameter("txtDirGim");
      String horGim = request.getParameter("txtHorGim");
      String claGim = request.getParameter("txtClaGim");
      g.setNomGim(nomGim);
      g.setDirGim(dirGim);
      g.setHorGim(horGim);
      g.setClaGim(claGim);
      daoGim.agregar(g);
      acceso = listarGimnasioAdmin;
    } else if (action.equalsIgnoreCase("editar")) {
      request.setAttribute("idper", request.getParameter("id"));
      acceso = editar;
    } else if (action.equalsIgnoreCase("editarGimnasio")) {
      request.setAttribute("codgim", request.getParameter("id"));
      acceso = editarGimnasio;
    } else if (action.equalsIgnoreCase("actualizar")) {
      id = Integer.parseInt(request.getParameter("txtid"));
      String dni = request.getParameter("txtDni");
      String nombre = request.getParameter("txtNom");
      int gimPre = Integer.parseInt(request.getParameter("intGimPre"));
      p.setId(id);
      p.setDni(dni);
      p.setNombre(nombre);
      p.setGimPre(gimPre);
      dao.editar(p);
      acceso = listar;
    } else if (action.equals("Actualizar Gimnasio")) {
      id = Integer.parseInt(request.getParameter("txtid"));
      String nomGim = request.getParameter("txtNomGim");
      String dirGim = request.getParameter("txtDirGim");
      String horGim = request.getParameter("txtHorGim");
      String claGim = request.getParameter("txtClaGim");
      g.setCodGim(id);
      g.setNomGim(nomGim);
      g.setDirGim(dirGim);
      g.setHorGim(horGim);
      g.setClaGim(claGim);
      daoGim.editar(g);
      acceso = listarGimnasioAdmin;
    } else if (action.equalsIgnoreCase("eliminar")) {
      id = Integer.parseInt(request.getParameter("id"));
      p.setId(id);
      dao.eliminar(id);
      acceso = listar;
    } else if (action.equalsIgnoreCase("eliminarGimnasio")) {
      id = Integer.parseInt(request.getParameter("id"));
      g.setCodGim(id);
      daoGim.eliminar(id);
      acceso = listarGimnasioAdmin;
    }
    RequestDispatcher vista = request.getRequestDispatcher(acceso);
    vista.forward(request, response);
  }

  /**
   * Handles the HTTP <code>POST</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    processRequest(request, response);
  }

  /**
   * Returns a short description of the servlet.
   *
   * @return a String containing servlet description
   */
  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>

}
