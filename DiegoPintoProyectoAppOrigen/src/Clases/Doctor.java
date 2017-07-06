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
public class Doctor {
    
    String strNombre;
    String strApellido;
    String strNumeroConsultorio;
    String strEspecialidad; 
    String strEstado;

    public Doctor(String strNombre, String strApellido, String strNumeroConsultorio, String strEspecialidad, String strEstado) {
        this.strNombre = strNombre;
        this.strApellido = strApellido;
        this.strNumeroConsultorio = strNumeroConsultorio;
        this.strEspecialidad = strEspecialidad;
        this.strEstado = strEstado;
    }
    public Doctor(){
        
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

    public String getStrNumeroConsultorio() {
        return strNumeroConsultorio;
    }

    public void setStrNumeroConsultorio(String strNumeroConsultorio) {
        this.strNumeroConsultorio = strNumeroConsultorio;
    }

    public String getStrEspecialidad() {
        return strEspecialidad;
    }

    public void setStrEspecialidad(String strEspecialidad) {
        this.strEspecialidad = strEspecialidad;
    }

    public String getStrEstado() {
        return strEstado;
    }

    public void setStrEstado(String strEstado) {
        this.strEstado = strEstado;
    }

}
