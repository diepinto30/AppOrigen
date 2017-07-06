/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author diego
 */
public class Paciente {
    
    String strNombre;
    String strApellido;
    String strIdentifacion;
    String strDireccion;
    String intEdad;

    public Paciente(String strNombre, String strApellido, String strIdentifacion, String strDireccion, String intEdad) {
        this.strNombre = strNombre;
        this.strApellido = strApellido;
        this.strIdentifacion = strIdentifacion;
        this.strDireccion = strDireccion;
        this.intEdad = intEdad;
    }
    
    public Paciente(){
        
    }

    public String getStrNombre() {
        return strNombre;
    }

    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }

    public String getStrApellido() {
        return strApellido;
    }

    public void setStrApellido(String strApellido) {
        this.strApellido = strApellido;
    }

    public String getStrIdentifacion() {
        return strIdentifacion;
    }

    public void setStrIdentifacion(String strIdentifacion) {
        this.strIdentifacion = strIdentifacion;
    }

    public String getStrDireccion() {
        return strDireccion;
    }

    public void setStrDireccion(String strDireccion) {
        this.strDireccion = strDireccion;
    }

    public String getIntEdad() {
        return intEdad;
    }

    public void setIntEdad(String intEdad) {
        this.intEdad = intEdad;
    }
    

    
    
    
}
