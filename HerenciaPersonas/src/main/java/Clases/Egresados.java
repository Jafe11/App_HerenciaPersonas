package Clases;

class Egresados extends Persona{
    private String titulo;
    private String EstudioSuperior;
    private String DescuentoEspecial;
    private String comiteEgresados;

    public Egresados(String id, String nombre, String edad, String apellido, String contacto, String Correo, String Direccion, String sexo,
            String titulo, String EstudioSuperior, String DescuentoEspecial, String comiteEgresados) {
        super(id, nombre, edad, apellido, contacto, Correo, Direccion, sexo);
        this.titulo = titulo;
        this.EstudioSuperior = EstudioSuperior;
        this.DescuentoEspecial = DescuentoEspecial;
        this.comiteEgresados = comiteEgresados;
    }

    @Override
    public String toString() {
        return "Egresado\n" + super.toString() + "\ntitulo: " + titulo + 
                "\nEstudioSuperior: " + EstudioSuperior + 
                "\nDescuentoEspecial: " + DescuentoEspecial + 
                "\ncomiteEgresados: " + comiteEgresados;
    }
}
