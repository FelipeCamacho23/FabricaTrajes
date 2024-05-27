package FabricaDeTrajes;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class FabricaDeTrajes implements IFabricaDeTrajes {
    private ArrayList<Componente> componentesEnAlmacen = new ArrayList<>();
    private TreeSet<Traje> trajesEnAlmacen = new TreeSet<>();
    private boolean sonRebajas = false;
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        FabricaDeTrajes fabrica = new FabricaDeTrajes();
        fabrica.escribirMenu();
    }

    public void escribirMenu() {
        int opcion;
        do {
            System.out.println("MENU FABRICA TRAJES");
            System.out.println("1.- Añadir Componente a almacén");
            System.out.println("2.- Listar Componentes del almacén");
            System.out.println("3.- Crear traje y añadir a almacén");
            System.out.println("4.- Listar trajes del almacén");
            System.out.println("7.- Activar/Desactivar las rebajas");
            System.out.println("8.- Crear envío");
            System.out.println("9.- Crea componentes de prueba");
            System.out.println("0.- Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  

            switch (opcion) {
                case 1:
                    añadirComponenteAAlmacen();
                    break;
                case 2:
                    listarComponentes();
                    break;
                case 3:
                    añadirTrajeAAlmacen();
                    break;
                case 4:
                    listarTrajes();
                    break;
                case 7:
                    activadDesactivarRebajas();
                    break;
                case 8:
                    crearEnvío();
                    break;
                case 9:
                    creaComponentesDePrueba();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    @Override
    public void añadirComponenteAAlmacen() {
    }

    @Override
    public void listarComponentes() {
        for (Componente componente : componentesEnAlmacen) {
            System.out.println(componente);
        }
    }

    @Override
    public void añadirTrajeAAlmacen() {
    }

    @Override
    public void listarTrajes() {
        for (Traje traje : trajesEnAlmacen) {
            System.out.println(traje);
        }
    }

    @Override
    public void activadDesactivarRebajas() {
        sonRebajas = !sonRebajas;
        System.out.println("Rebajas " + (sonRebajas ? "activadas" : "desactivadas"));
    }

    @Override
    public void crearEnvío() {
    }

    public void creaComponentesDePrueba() {
    }
}

