package Ejercicio4_1;

import java.util.Scanner;

public class PruebaLibro {

    public static void main(String[] args) {
        Libro libro1 = new Libro("Romeo y julieta", "William Shakespeare", 550);
        LibroTexto libroTexto = new LibroTexto("Invisible", "Eloy Moreno", 150, "5º de secundaria");
        LibroUniversidad libroUniversidad = new LibroUniversidad("Un mundo feliz", "Aldous Huxley", 265, "1º semestre", "Psicologia");
        Novelas novelas1 = new Novelas("¿Quien se ha llevado mi queso?", "Spencer Johnson", 35, Novelas.tipoNov.AVENTURAS);

        libro1.imprimir();
        System.out.println();
        libroTexto.imprimir();
        System.out.println();
        libroUniversidad.imprimir();
        System.out.println();
        novelas1.imprimir();
    }
}
