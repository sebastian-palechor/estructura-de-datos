import java.util.Scanner;

// Clase Producto
class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String codigo, String nombre, double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return  
                "codigo:" + codigo + '\'' +
                ", nombre:'" + nombre + '\'' +
                ", precio:" + precio +
                ", cantidad:" + cantidad 
                ;
    }
}


class Inventario {
    private Producto[] productos;
    private int contador;

    public Inventario() {
        
        productos = new Producto[10];
        productos[0] = new Producto ("001", "maletin", 80500, 20);
        productos[1] = new Producto ("002", "celular", 800000, 50);
        productos[2] = new Producto ("003", "bolso", 40000, 10);
        productos[3] = new Producto ("004", "portatil", 900000, 30);
        productos[4] = new Producto ("005", "movil", 120000, 25);
        productos[5] = new Producto ("006", "faro", 80000, 15);
        productos[6] = new Producto ("007", "cuaderno", 2000, 5);
        productos[7] = new Producto ("008", "lapiz", 1500, 40);
        productos[8] = new Producto ("009", "pantalla", 780000, 12);
        productos[9] = new Producto ("010", "maus", 9000, 22);
        contador = 10; 
    }

    public Producto buscarProductoPorCodigo(String codigo) {
        for (int i = 0; i < contador; i++) {
            if (productos[i].getCodigo().equals(codigo)) {
                return productos[i];
            }
        }
        return null; 
    }

    public void mostrarProductos() {
        for (int i = 0; i < contador; i++) {
            System.out.println(productos[i]);
        }
    }

    public void ordenarPorPrecioBurbuja() {
        for (int i = 0; i < contador - 1; i++) {
            for (int j = 0; j < contador - i - 1; j++) {
                if (productos[j].getPrecio() > productos[j + 1].getPrecio()) {
                    
                    Producto temp = productos[j];
                    productos[j] = productos[j + 1];
                    productos[j + 1] = temp;
                }
            }
        }
    }

    public void ordenarPorCantidadInsertion() {
        for (int i = 1; i < contador; i++) {
            Producto key = productos[i];
            int j = i - 1;

            
            while (j >= 0 && productos[j].getCantidad() > key.getCantidad()) {
                productos[j + 1] = productos[j];
                j = j - 1;
            }
            productos[j + 1] = key;
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario(); // Inicializar inventario con productos predefinidos
        int opcion;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Buscar producto por código");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Ordenar productos por precio ");
            System.out.println("4. Ordenar productos por cantidad ");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese código del producto a buscar: ");
                    String codigoBuscar = scanner.nextLine();
                    Producto encontrado = inventario.buscarProductoPorCodigo(codigoBuscar);
                    System.out.println(encontrado != null ? encontrado : "Producto no encontrado.");
                    break;

                case 2:
                    System.out.println("Productos en inventario:");
                    inventario.mostrarProductos();
                    break;

                case 3:
                    inventario.ordenarPorPrecioBurbuja();
                    System.out.println("Productos ordenados por precio:");
                    inventario.mostrarProductos();
                    break;

                case 4:
                    inventario.ordenarPorCantidadInsertion();
                    System.out.println("Productos ordenados por cantidad:");
                    inventario.mostrarProductos();
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
}
