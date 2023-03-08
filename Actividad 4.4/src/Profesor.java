import java.util.List;

public class Profesor extends Persona{
    private String str;
    private int edad;
    private List<Prestamo> prestamos;

    public Profesor(String numeroDeTelefono, String numeroDeTelefono1) {
        super(numeroDeTelefono);
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public void printInformacionPersonal(){
        System.out.println("Nombre: " + str);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + numeroDeTelefono);
    }

    public void printTodaLaInformacion(){
        System.out.println("Nombre: " + str);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + numeroDeTelefono);
        recorrerPrestamos();
    }

    private void recorrerPrestamos() {
        for (Prestamo p: prestamos) {
            System.out.println(p);
        }
    }

}