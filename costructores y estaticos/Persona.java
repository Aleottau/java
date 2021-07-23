import java.util.ArrayList;
import java.util.List;

public class Persona {
    public static int numPersonas;
    // Asi se declara una lista en Java 8
    public static List<Persona> personas = new ArrayList<>();
    private int id;
    private String documento;
    private String nombres;
    private String apellidos;
    private String sexo;

    public Persona(String documento, String nombres, String apellidos, String sexo) {
        this.documento = documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.sexo = sexo;
        numPersonas++;
        this.id = numPersonas;
    }

    public static void agregarPersona(Persona p) {
        personas.add(p);
    }

    public int getId() {
        return id;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public String getNombreCompleto() {
        return nombres + " " + apellidos;
    }
}