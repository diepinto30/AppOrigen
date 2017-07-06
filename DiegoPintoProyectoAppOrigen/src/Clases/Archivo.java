package Clases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diego
 */
public class Archivo {
    
    
    // <editor-fold defaultstate="collapsed" desc="LeerArchivoDoctor">  
    public ArrayList<Doctor> LeerArchivoDoctor() {
        ArrayList<Doctor> lstDoctor = new ArrayList<>();
        try {
            File file = new File("Doctor.txt");
            Scanner s = null;
            s = new Scanner(file);
            int intInc = 0;
            while (s.hasNextLine()) {
                String strLinea = s.nextLine();
                String[] token = strLinea.split(";");
                Doctor objDoc = new Doctor();
                objDoc.setStrNombre(token[0]);
                objDoc.setStrEspecialidad(token[1]);
                objDoc.setStrNumeroConsultorio(token[2]);
                objDoc.setStrEstado(token[3]);
                objDoc.setStrApellido(token[4]);
                
                lstDoctor.add(intInc, new Doctor(token[0], token[1], token[2], token[3], token[4]));
                intInc = intInc + 1;

            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            String msn = ex.getLocalizedMessage();
        }
        return lstDoctor;
    } // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="LeerArchivoPaciente">  
    public ArrayList<Paciente> LeerArchivoPaciente() {
        ArrayList<Paciente> lstPaciente = new ArrayList<>();
        try {
            File file = new File("Paciente.txt");
            Scanner s = null;
            s = new Scanner(file);
            int intInc = 0;
            while (s.hasNextLine()) {
                String strLinea = s.nextLine();
                String[] token = strLinea.split(";");
                Paciente objPa = new Paciente();
                objPa.setStrNombre(token[0]);
                objPa.setStrDireccion(token[1]);
                objPa.setIntEdad(token[2]);
                objPa.setStrApellido(token[3]);
                objPa.setStrIdentifacion(token[4]);
                
                lstPaciente.add(intInc, new Paciente(token[0], token[1], token[2], token[3], token[4]));
                intInc = intInc + 1;

            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            String msn = ex.getLocalizedMessage();
        }
        return lstPaciente;
    }// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="LeerArchivoCita">  
    public ArrayList<Cita> LeerArchivoCita() {
        ArrayList<Cita> lstCita = new ArrayList<>();
        try {
            File file = new File("Cita.txt");
            Scanner s = null;
            s = new Scanner(file);
            int intInc = 0;
            while (s.hasNextLine()) {
                String strLinea = s.nextLine();
                String[] token = strLinea.split(";");
                Cita objCita = new Cita();
                objCita.setIntId(token[0]);
                objCita.setFecha(token[1]);
                objCita.setHora(token[2]);
                objCita.setNombreD(token[3]);
                objCita.setConsultorio(token[4]);
                objCita.setPaciente(token[5]);
                
                lstCita.add(intInc, new Cita(token[0], token[1], token[2], token[3], token[4], token[5]));
                intInc = intInc + 1;

            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            String msn = ex.getLocalizedMessage();
        }
        return lstCita;
    }// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="AgregarRegistroDoctor"> 
    public void AgregarRegistroDoctor(String strNombres, String strApellido, String strNumeroC, String Especialidad, String Estado) {
        Formatter salida;
        if (new File("Doctor.txt").isFile()) {
            try {
                ArrayList<Doctor> lstDoctor = LeerArchivoDoctor();
                lstDoctor.add(new Doctor(strNombres, strApellido, strNumeroC, Especialidad, Estado));
                salida = new Formatter("Doctor.txt");
                String strOutput = "";
                for (Doctor doctor : lstDoctor) {
                    strOutput = strOutput + doctor.getStrNombre().toUpperCase()+";"+ doctor.getStrApellido().toUpperCase()+ ";" + doctor.getStrNumeroConsultorio() + ";" + doctor.strEspecialidad.toUpperCase()+ ";" + doctor.strEstado.toUpperCase()+"\n";
                }
                salida.format(strOutput);
                salida.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                String msn = ex.getLocalizedMessage();
            }
        } 
    }// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="AgregarRegistroPaciente"> 
    public void AgregarRegistroPaciente(String strNombres, String strApellido, String strIdentifacion, String strDireccion, String strEdad) {
        Formatter salida;
        if (new File("Paciente.txt").isFile()) {
            try {
                ArrayList<Paciente> lstPaciente = LeerArchivoPaciente();
                lstPaciente.add(new Paciente(strNombres, strApellido, strIdentifacion, strDireccion, strEdad));
                salida = new Formatter("Paciente.txt");
                String strOutput = "";
                for (Paciente paciente : lstPaciente) {
                    strOutput = strOutput + paciente.getStrNombre().toUpperCase()+";"+paciente.getStrApellido().toUpperCase() + ";" + paciente.getStrIdentifacion() + ";" + paciente.getStrDireccion().toUpperCase() + ";" + paciente.getIntEdad()+"\n";
                }
                salida.format(strOutput);
                salida.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                String msn = ex.getLocalizedMessage();
            }
        } 
    }// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Agregar Registro Cita"> 
    public void AgregarRegistroCita(String strId, String strFecha, String stHora, String doctor, String Consultorio, String paciente) {
        Formatter salida;
        if (new File("Cita.txt").isFile()) {
            try {
                ArrayList<Cita> lstCita = LeerArchivoCita();
                lstCita.add(new Cita(strId, strFecha, stHora, strId, Consultorio, paciente));
                salida = new Formatter("Cita.txt");
                String strOutput = "";
                for (Cita cita : lstCita) {
                    strOutput = strOutput + cita.getIntId()+ ";" + cita.getFecha() + ";" + cita.getHora()+ ";" +cita.getNombreD()+ ";" +cita.getConsultorio()+ ";" +cita.getPaciente()+"\n";
                    
                }
                salida.format(strOutput);
                salida.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                String msn = ex.getLocalizedMessage();
            }
        }  
    }// </editor-fold>
    
    
}
 