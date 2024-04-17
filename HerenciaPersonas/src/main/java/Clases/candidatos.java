package Clases;

class candidatos extends Persona{
    private String examenIngreso;
    private String entrevista;
    private String cursoGratis;

    public candidatos(String id, String nombre, String edad, String apellido, String contacto, String Correo, String Direccion, String sexo, 
            String examenIngreso, String entrevista, String cursoGratis) {
        super(id, nombre, edad, apellido, contacto, Correo, Direccion, sexo);
        this.examenIngreso = examenIngreso;
        this.entrevista = entrevista;
        this.cursoGratis = cursoGratis;
    }

    @Override
    public String toString() {
        return "Candidato\n" + super.toString() + "\nexamenIngreso: " + examenIngreso + 
                "\nentrevista: " + entrevista + 
                "\ncursoGratis: " + cursoGratis;
    }
    
    
}
