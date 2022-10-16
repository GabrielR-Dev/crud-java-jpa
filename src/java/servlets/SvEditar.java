
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Persona;
import persistencia.ControladoraPersistencia;


@WebServlet(name = "SvEditar", urlPatterns = {"/SvEditar"})
public class SvEditar extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    ControladoraPersistencia control = new ControladoraPersistencia();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);

                // Capturamos el id que viene de la pagina ver persona
                int id = Integer.parseInt(request.getParameter("id"));
                
                //Creamos una personas con los datos del id correspondiente
                Persona personas = control.traerPersona(id);

                // Con la consulta(request) se crea una variable con la session
                HttpSession miSession = request.getSession();

                // En la session ingresamos en los atributos la lista con los datos
                miSession.setAttribute("pers", personas);

                System.out.println(request);
                
        
                response.sendRedirect("editarPersona.jsp");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                processRequest(request, response);
                
                int id = Integer.parseInt(request.getParameter("id"));
                String dni = request.getParameter("dni");
                String nombre = request.getParameter("nombre");
                String apellido = request.getParameter("apellido");
                String telefono = request.getParameter("telefono");
        

        
                Persona pers = new Persona(id, dni, nombre, apellido, telefono);
                
                control.editarPersona(pers);
                
                response.sendRedirect("index.jsp");
        
    }

}
