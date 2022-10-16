
package servlets;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;
import logica.Persona;


@WebServlet(name = "SvPersona", urlPatterns = {"/SvPersona"})
public class SvPersona extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    
    Controladora control = new Controladora();
       
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                processRequest(request, response);


                //Creamos una lista de personas con los datos de la controladora
                List<Persona> listaPersonas = control.mostrarPersonas();

                // Con la consulta(request) se crea una variable con la session
                HttpSession miSession = request.getSession();

                // En la session ingresamos en los atributos la lista con los datos
                miSession.setAttribute("listaPersonas", listaPersonas);

                System.out.println(request);


                //Redirigimos al servles la respuesta
                response.sendRedirect("verPersona.jsp");
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                processRequest(request, response);
                
                // Creamos variables para los datos que se enviaron desde el formulario del front
                String dni = request.getParameter("dni");
                String nombre = request.getParameter("nombre");
                String apellido = request.getParameter("apellido");
                String telefono = request.getParameter("telefono");
                

                //Creamos una instancia de la clase modelo Persona e ingresamos los datos de las variables
                // en el constructor
                Persona pers = new Persona(0, dni, nombre, apellido, telefono);
                
                //Creamos una instarncia de la clase controladora usamos el metodo para crear persona e
                //insertamos en su parametro la intancia de la clase Persona
                control.crearPersona(pers);
                
                //Redirigimos a la pagina principal
                response.sendRedirect("index.jsp");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
