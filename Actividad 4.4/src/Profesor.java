
import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona {
    private String nombre;
    private int edad;
    private List<Prestamo> prestamos;

    public Profesor(String numeroDeTelefono, String nombre, int edad) {
        super(numeroDeTelefono);
        this.nombre = nombre;
        this.edad = edad;
        this.prestamos = new ArrayList<>();
    }

    public void printInformacionPersonal() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + getNumeroDeTelefono());
    }

    public void printTodaLaInformacion() {
        printInformacionPersonal();
        for (Prestamo p : prestamos) {
            System.out.println(p);
        }
    }
}
