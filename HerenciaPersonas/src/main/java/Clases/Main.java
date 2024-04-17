package Clases;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
       Estudiantes estudianteA = new Estudiantes(
               "E12345", 
               "Juan", 
               "22", 
               "Pérez", 
               "+123456789", 
               "juan.perez@example.com", 
               "Calle Principal #123", 
               "Masculino",
               "7mo Semestre", 
               "Muchas",
               "Tarde",
               "21",
               "Participa");
        JOptionPane.showMessageDialog(null, estudianteA);
        
        Egresados egresadoA = new Egresados(
                "F98765", 
                "Ana", 
                "25", 
                "López", 
                "+987654321", 
                "ana.lopez@example.com", 
                "Avenida Central #789", 
                "Femenino",
                "Psicologia",
                "Si",
                "Si",
                "Si");
        JOptionPane.showMessageDialog(null, egresadoA);
        
        
        candidatos candidatoA = new candidatos("M45678", 
                "Carlos", 
                "30", 
                "García", 
                "+55555555", 
                "carlos.garcia@example.com", 
                "Calle Principal #789", 
                "Masculino",
                "En revision",
                "Paso",
                "Terminados");
        JOptionPane.showMessageDialog(null, candidatoA);
    }
}
