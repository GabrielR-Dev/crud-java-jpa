
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Controladora;


@WebServlet(name = "SvEliminar", urlPatterns = {"/SvEliminar"})
public class SvEliminar extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    
    //Importamos la controladora que ace la conexion con los metodos de la controladoraPersistencia
    Controladora control = new Controladora();
       


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        //Metemos en una variable los datos enviados con el metodo Post
        int id_elim = Integer.parseInt(request.getParameter("id_elim"));
        
        //Usamos los metodos de la controladora para eliminar con el id
        control.eliminarPersona(id_elim);
        
        //Redirigimos a la pagina principal
        response.sendRedirect("index.jsp");
    }


}
