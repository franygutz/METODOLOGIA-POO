package run;

import models.Libro;

public class Ejercicio3 {
    public static void main(String[] args) {
        //objeto tipo libro
        Libro libro = new Libro();

        //valores de atributos
        libro.titulo = "Los siete maridos de Evelyn Hugo";
        libro.autor = "Taylor J. Reid";
        libro.numeroPaginas = 429;

        //impresion
        System.out.println(libro.descripcionLibro());
    }
}
