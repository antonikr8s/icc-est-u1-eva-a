package Controllers;

import Views.ShowConsole;
import models.Book;

public class Controlador {
    Book[] librosOriginales;
    Book[] librosOrdenados;
    ShowConsole showConsole;
    MetodosOrdenBusqueda ordenBusqueda;

    public Controlador() {

    }

    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            showConsole.mostrarMenu();
            int opcion = showConsole.leerOpcion();

            switch (opcion) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    salir = true;
                    break;

                default:
                    break;
            }

        }
    }

    public void mostrarLibrosOriginal(Book[] books) {
        System.out.println("--Lista ");

    }

    public void ordenarLibros() {
        
    }

    public void buscarNombre() {

    }

}
