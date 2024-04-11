
public class Persona {
    String nombre;
    String apellido;
    int documentoIdentidad;
    int anioNaciomiento;
    public Persona(String nombre, String apellido, int documentoIdentidad, int anioNaciomiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documentoIdentidad = documentoIdentidad;
        this.anioNaciomiento = anioNaciomiento;
    }
    void imprimir(){
        System.out.println("Nombre = " +nombre);
        System.out.println("Apellido = " +apellido);
        System.out.println("Documento de identidad = " +documentoIdentidad);
        System.out.println("Año de nacimiento = "+anioNaciomiento);
    }

    public int calcularEdad(){
        return 2024-anioNaciomiento;
    }

    
}