package Views;

import java.util.Scanner;

import models.Book;

public class ShowConsole {
    private Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println("----MENU----");
        System.out.println("1 Imprimir lista original");
        System.out.println("2 Imprimir lista Ordenada");
        System.out.println("3 Buscar libro por nombre");
        System.out.println("4 Buscar libro");
    }

    public int leerOpcion() {
        return Integer.parseInt(scanner.nextLine());
    }

    public int ingresarNombreBuscado(){
        System.out.println("->Ingrese el nombre a buscar");
        return Integer.parseInt(scanner.nextLine());
    }

    private void mostrarLista(Book[] books) {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    private void mostrarResultado(Book[] books, int posicion) {
        if (books != null) {
            System.out.println("Libro encontrado en la posicion" + posicion);
        } else

        {
            System.out.println("Libro no encontrado");

        }
    }

}
