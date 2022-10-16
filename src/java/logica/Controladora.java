
package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia control = new ControladoraPersistencia();

    public void crearPersona (Persona pers){
        control.crearPersona(pers);
    }
    
    public void eliminarPersona(Persona pers){
        control.eliminarPersona(pers);
    }
    public void eliminarPersona(int id){
        control.eliminarPersona(id);
    }
    
    public List<Persona> mostrarPersonas(){
        return control.traerPersonas();
    }
    
    public void editarPersona(Persona pers){
        control.editarPersona(pers);
    }
    
    public Persona mostrarPersona(int id){
        return control.traerPersona(id);
    }
}
