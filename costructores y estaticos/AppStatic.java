public class AppStatic {
    /*
    public static void main(String[] args) {
        String fmt = "%s %s";
        Persona p;
        System.out.println(Persona.numPersonas);
        p = new Persona("1100501", "Ruthford", "Jay", "M");
        System.out.println(String.format(fmt, p.getId(), p.getNombreCompleto()));
        System.out.println(Persona.numPersonas);
        p = new Persona("1100502", "Alejandro", "Quintero", "M");
        System.out.println(String.format(fmt, p.getId(), p.getNombreCompleto()));
        System.out.println(Persona.numPersonas);
        p = new Persona("1100503", "Angie", "Cruz", "F");
        System.out.println(String.format(fmt, p.getId(), p.getNombreCompleto()));
    }
    */
    /*
    public static void main(String[] args) {
        String fmt = "%s %s";
        Persona p;
        p = new Persona("1100501", "Ruthford", "Jay", "M");
        Persona.agregarPersona(p);
        p = new Persona("1100502", "Alejandro", "Quintero", "M");
        Persona.agregarPersona(p);
        p = new Persona("1100503", "Angie", "Cruz", "F");
        Persona.agregarPersona(p);
        // El tamaño de una lista
        System.out.println(Persona.personas.size());
        // Recorrido de ese listado
        for(Persona p1 : Persona.personas) {
            System.out.println(String.format(fmt, p1.getId(), p1.getNombreCompleto()));
        }
    }
    */
    public static void main(String[] args) {
        String fmt = "%s %s";
        Persona.agregarPersona(new Persona("1100501", "Ruthford", "Jay", "M"));
        Persona.agregarPersona(new Persona("1100502", "Alejandro", "Quintero", "M"));
        Persona.agregarPersona(new Persona("1100503", "Angie", "Cruz", "F"));
        // El tamaño de una lista
        System.out.println(Persona.personas.size());
        // Recorrido de ese listado
        for(Persona p1 : Persona.personas) {
            System.out.println(String.format(fmt, p1.getId(), p1.getNombreCompleto()));
        }
    }
}
