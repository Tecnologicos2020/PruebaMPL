package Servlets;

import Modelo.GenerarJson;
import Modelo.loginService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ebarrero
 */
public class Controlador extends HttpServlet 
{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        
        //se recupera la accion generada del front
        String accion=request.getParameter("accion");
        if (accion.equals("Ingresar")) 
        {
            //se recupera los datos ingresados en el formulario d evalidacion
            String id=request.getParameter("id");
            String pw=request.getParameter("pw");
            String result=loginService.login(id, pw);
            if (result !=null) 
            {
                //con la informacion de inicio de sesion se genera el archivo json
                GenerarJson.construirJson(id,result);
                
                //ya validado los parametros de inicio de ssesion se redirecciona 
                //a la pagina principal
                request.getSession().setAttribute("id", id);
                request.getSession().setAttribute("sesion",result);
                request.getRequestDispatcher("Bienvenida.jsp").forward(request, response);
            }else{
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
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
        processRequest(request, response);
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
