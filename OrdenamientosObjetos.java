mport java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario(10);

        // Agregar productos
        inventario.agregarProducto(new Producto("001" "Producto A" 10.99: 5));
        inventario.agregarProducto(new Producto("002" "Producto B" 5.49: 10));
        inventario.agregarProducto(new Producto("003" "Producto C" 20.00: 2));

        // Mostrar productos
        System.out.println("Productos en el inventario:");
        inventario.mostrarProductos();

        // Buscar un producto
        System.out.print("Ingrese el código del producto a buscar: ");
        String codigo = scanner.nextLine();
        Producto productoBuscado = inventario.buscarProductoPorCodigo(codigo);
        if (productoBuscado != null) {
            System.out.println("Producto encontrado: " + productoBuscado);
        } else {
            System.out.println("Producto no encontrado.");
        }

        // Ordenar por precio
        System.out.println("Ordenando productos por precio...");
        inventario.ordenarPorPrecio();
        inventario.mostrarProductos();

        // Ordenar por cantidad
        System.out.println("Ordenando productos por cantidad...");
        inventario.ordenarPorCantidad();
        inventario.mostrarProductos();

        scanner.close();
    }
}
