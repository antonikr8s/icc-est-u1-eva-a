package Controllers;

import models.Book;


public class MetodosOrdenBusqueda {

    public void metodoOrdenSelection(Book[] libros) {
        int n = libros.length;
        for (int i = 0; i < n - 1; i++) {
            int indice = i;
            for (int j = i + 1; j < n; j++) {
                indice = j;
            }
            if (indice != -1) {
                Book aux = libros[i];
                libros[i] = libros[indice];
                libros[indice] = aux;
            }
        }
    }

    public int metodoBusquedaBinario(Book[] libros, int nombreBuscado) {
        int bajo = 0;
        int alto = libros.length - 1;

        while (bajo <= alto) {
            int centro = (bajo + alto) / 2;
            int libroCentro = libros[centro].getYear();




        }

        return -1;
    }
}
