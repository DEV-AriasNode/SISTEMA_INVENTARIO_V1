package arraylist.sistema_inventario_dinamico.v1;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListSistema_inventario_dinamicoV1 {

    public static Scanner sc;
    public static ArrayList<String> listaProducto = new ArrayList<>();
    public static int opcion = 0;

    public static void main(String[] args) {

        // use array list y solicite 5 cosas al usuario al ususario para que ingrese
        //debo usar los metodos del arraylist para demostar su funcionalidad
        sc = new Scanner(System.in);
        System.out.println("----------Bienvenido al sistema de registro de inventario-----------");
        System.out.println("Ingrese 5 productos: ");

        for (int i = 0; i < 5; i++) {
            System.out.println("Producto #" + (i + i) + ":");
            String nombreProducto = sc.nextLine();
            listaProducto.add(nombreProducto);

        }
        do {
            System.out.println("Que desea hacer ? ");
            System.out.println("1. ver todos lo productos");
            System.out.println("2. agregar productos ");
            System.out.println("3 editar producto");
            System.out.println("4. eliminar producto");
            System.out.println("0.salir");
            System.out.println("Seleccione una opcion del menu");
            opcion = sc.nextInt();

            System.out.println("----------------------------------------------");
            switch (opcion) {
                case 1:
                    verProducto();
                    break;
                case 2:
                    agregarProducto();
                    break;
                case 3:
                    editarProducto();
                    break;
                case 4:
                    System.out.println("elimando productos...........");
                    break;

            }

        } while (opcion != 0);
        System.out.println("FIN DEL PROGRAMA, GRACIAS");

    }

    public static void verProducto() {
        System.out.println("*************************************************");
        System.out.println("--------------lista de productos -----------------");
        for (int i = 0; i < listaProducto.size(); i++) {

            System.out.println(listaProducto.get(i));

        }

    }

    public static void agregarProducto() {
        System.out.println("cuantos productos desea agregar:");
        int cantidad = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Nombre producto");
            String nuevoProducto = sc.nextLine();
            listaProducto.add(nuevoProducto);
        }

    }

    public static void editarProducto() {
        System.out.println("De esta lista cual producto desea modificar");
        for (int i = 0; i < listaProducto.size();i++){
        System.out.println("" + i + "->" + listaProducto.get(i));
        }
        System.out.println("Elija la opcion a editar");
        int opcionEditar = sc.nextInt();
        System.out.println("con que nombre desea reemplazar");
        String nuevoNombre = sc.nextLine();
        listaProducto.set(opcionEditar, nuevoNombre);
        sc.nextLine();
    }

    public static void eliminarProducto() {

    }
}
