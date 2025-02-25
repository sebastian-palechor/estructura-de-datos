class Persona implements Comparable<Persona> {
    private int edad;
    private String nombre;

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Persona otra) {
        return Integer.compare(this.edad, otra.edad); // Comparar por edad
    }

    @Override
    public String toString() {
        return "Persona" + "edad:" + edad + " nombre:'" + nombre + '\'' ;
    }
}

public class OrdenamientosObjetos {

    public static void main(String[] args) {
        OrdenamientosObjetos pruebaOrdenamiento = new OrdenamientosObjetos();
        pruebaOrdenamiento.probarOrdenamientos();
    }

    public OrdenamientosObjetos() {}

    public void probarOrdenamientos() {
        // Crear arreglo desordenado de 10 objetos de la clase Persona
        Persona[] personas = {
            new Persona(25, "Carlos"),
            new Persona(30, "Ana"),
            new Persona(22, "Luis"),
            new Persona(35, "Marta"),
            new Persona(28, "Javier"),
            new Persona(40, "Sofia"),
            new Persona(19, "Pedro"),
            new Persona(50, "Laura"),
            new Persona(45, "Fernando"),
            new Persona(33, "Clara")
        };

        // Imprimir el arreglo desordenado
        System.out.println("Arreglo desordenado:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        // Ordenar usando burbuja
        ordenarBurbuja(personas);

        // Imprimir el arreglo ordenado
        System.out.println("\nArreglo ordenado:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }

    public void ordenarBurbuja(Persona[] personas) {
        int n = personas.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (personas[j].compareTo(personas[j + 1]) > 0) {
                    // Intercambiar personas[j] y personas[j + 1]
                    Persona temp = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = temp;
                }
            }
        }
    }
}
