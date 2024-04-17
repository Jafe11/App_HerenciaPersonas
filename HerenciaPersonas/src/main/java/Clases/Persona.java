package Clases;

public class Persona {
    private String id;
    private String nombre;
    private String edad;
    private String apellido;
    private String contacto;
    private String Correo;
    private String Direccion;
    private String sexo;

    public Persona(String id, String nombre, String edad, String apellido, String contacto, String Correo, String Direccion, String sexo) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
        this.contacto = contacto;
        this.Correo = Correo;
        this.Direccion = Direccion;
        this.sexo = sexo;
    }
    
    public String getId(){
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public String getApellido() {
        return apellido;
    }

    public String getContacto() {
        return contacto;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return  "Id: " + id + "\n nombre: " + nombre + "\n edad: " + edad + "\n apellido: " + apellido + 
                "\n contacto: " + contacto + "\n Correo: " + Correo + 
                "\n Direccion: " + Direccion + "\n sexo: " + sexo;
    }
    
    
}
