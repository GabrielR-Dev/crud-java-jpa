

<%@page import="java.util.List"%>
<%@page import="logica.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ver Personas</title>
    </head>
    <body>
        <h1>Personas</h1>
        
        <% 
            // Iniciamos en una variable los datos guardados en la session que viene desde el servles SvPersona
            //Esto devuelve un objeto pero si iniciamos un CASTEO podemos devolver el objeto en lo que necesitemos
            //El casteo se inicia con la inicializacion de unos parentecis con el dato antes de la inserpcion
            //del objeto
            List<Persona> listaPers = (List) request.getSession().getAttribute("listaPersonas");
        
            // Luego ingresamos una for para recorrer la variable con la lista
            for(Persona per : listaPers){
            
        %>
        <form action="SvEditar" method="GET">
            
            <input type="hidden" name="id" value="<%=per.getId()%>">

            <p><b>Id: </b> <%= per.getId()%></p>

            <p><b>Dni: </b> <%= per.getDni()%></p>
            <p><b>Nombre: </b> <%= per.getNombre()%></p>
            <p><b>Apellido: </b> <%= per.getApellido()%></p>
            <p><b>Telefono: </b> <%= per.getTelefono()%></p>
            <button type="submit">Editar</button>

        </form>
        
        <p>..................................</p>
        
        <% 
            }
        %>

    </body>
</html>
