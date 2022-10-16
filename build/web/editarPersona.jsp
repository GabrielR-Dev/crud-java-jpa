

<%@page import="logica.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Personas</title>
    </head>
    <body>
        <h1>Editar Persona</h1>
        
        <%
            Persona pers = (Persona) request.getSession().getAttribute("pers");
        
        %>
        
        <form action="SvEditar" method="POST">
            <input type="hidden" name="id" value="<%=pers.getId()%>" />
                
            <p><label>Dni: </label><input type="text" name="dni" value="<%=pers.getDni()%>"/></p>
            <p><label>Nombre: </label><input type="text" name="nombre" value="<%=pers.getNombre()%>" /></p>
            <p><label>Apellido: </label><input type="text" name="apellido" value="<%=pers.getApellido()%>" /></p>
            <p><label>Telefono: </label><input type="text" name="telefono" value="<%=pers.getTelefono()%>" /></p>
            <button type="submit" >Editar</button>
            
        </form>
        
    </body>
    
</html>
