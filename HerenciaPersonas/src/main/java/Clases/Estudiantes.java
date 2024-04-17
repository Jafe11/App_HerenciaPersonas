package Clases;

import Clases.Persona;

class Estudiantes extends Persona{
    private String semestre;
    private String asignaturas;
    private String horario;
    private String creditos;
    private String comiteEstudiantil;

    public Estudiantes(String id, String nombre, String edad, String apellido, String contacto, String Correo, String Direccion, String sexo,
            String semestre, String asignaturas, String horario, String creditos, String comiteEstudiantil) {
        super(id, nombre, edad, apellido, contacto, Correo, Direccion, sexo);
        this.semestre = semestre;
        this.asignaturas = asignaturas;
        this.horario = horario;
        this.creditos = creditos;
        this.comiteEstudiantil = comiteEstudiantil;
    }

    public String getSemestre() {
        return semestre;
    }

    public String getAsignaturas() {
        return asignaturas;
    }

    public String getCreditos() {
        return creditos;
    }

    public String getComiteEstudiantil() {
        return comiteEstudiantil;
    }

    @Override
    public String toString() {
        return "Estudiante\n" + super.toString() + "\nSemestre: " + semestre + "\nAsignatura: " 
                + asignaturas + "\nCreditos: " + creditos + "\nComite EStudiantil: " + comiteEstudiantil;  
    }
    
    
}
