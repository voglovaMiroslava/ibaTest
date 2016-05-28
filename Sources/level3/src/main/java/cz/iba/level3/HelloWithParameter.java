package cz.iba.level3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Miroslava
 */
public class HelloWithParameter extends HttpServlet {

    // <editor-fold defaultstate="collapsed">
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
        String param = request.getParameter("x");
        Integer i = 1;
        HttpSession session = request.getSession();
        
        try {
            i = Integer.parseInt(param);
        } catch (NumberFormatException ex) {         
        }
        
        session.setAttribute("repet", i.toString());
        request.getRequestDispatcher("/WEB-INF/multipleHello.jsp").forward(request, response);
    }

}
