/*
 * Licencia pendiente, para cambiar la licencia ir a -> Tools | Templates
 */
package org.generation.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.generation.dao.UsuarioDAO;
import org.generation.pojo.Usuario;
import org.json.JSONObject;

/**
 *
 * @author Ilich Arredondo
 */
@WebServlet(name = "RegistroUsuario", urlPatterns = {"/registro"})
public class RegistroUsuario extends HttpServlet {

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
       
        JSONObject jsonObject = new JSONObject();
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        String nickname = request.getParameter("nickname");
        String nombre = request.getParameter("name");
        String materno = request.getParameter("materno");
        String paterno = request.getParameter("paterno");
        String telefono = request.getParameter("tel");
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        String passconf = request.getParameter("passconf");
               
        if( pass.equals(passconf) ) {
            boolean exito = usuarioDAO.guardarUsuario(new Usuario(
                    nickname,
                    nombre,
                    materno,
                    paterno,
                    telefono,
                    email,
                    pass,
                    usuarioDAO.getTipoUsuario(2)
            ));
            jsonObject.put("registrado", exito);
        } else {
            jsonObject.put("registrado", false);
            jsonObject.put("passwordMatch", false);
        }
        
        response.setContentType("application/json");
        response.getWriter().print(jsonObject.toString());
        response.getWriter().close();
        
        this.destroy();
    }

}