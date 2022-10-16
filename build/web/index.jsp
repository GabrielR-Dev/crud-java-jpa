
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario JSP</title>
    </head>
    <body>
        <h1>Datos de Prueba</h1>
        
        <form action="SvPersona" method="POST">
            <p><label>Dni: </label><input type="number" name="dni" /></p>
            <p><label>Nombre: </label><input type="text" name="nombre" /></p>
            <p><label>Apellido: </label><input type="text" name="apellido" /></p>
            <p><label>Telefono: </label><input type="text" name="telefono" /></p>
            <button type="submit" >Enviar</button>
        </form>
        
        <h1>Ver Personas</h1>
        <p>Si deceas ver todas las personas haga click en el boton de mostrar personas</p>
        
        <form action="SvPersona" method="GET">
            <button type="submit">Mostrar Personas</button>
        </form>
        
        <h1>Eliminar Personas</h1>
        <p>Ingrese el DNI de la persona que decea eliminar</p>
        
        <form action="SvEliminar" method="POST">
            <p><label>Id: </label><input type="text" name="id_elim" /></p>
            <button type="submit">Eliminar Persona</button>
        </form>
        
        
        
    </body>
</html>
