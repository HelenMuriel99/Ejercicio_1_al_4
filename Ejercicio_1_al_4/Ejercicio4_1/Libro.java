package Ejercicio4_1;

public class Libro {
    protected String titulo;
    protected String autor;
    protected float precio;

    public Libro(String titulo, String autor, float precio){
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void imprimir(){
        System.out.println("Titulo del libro:  " +titulo);
        System.out.println("Autor del libro:  " +autor);
        System.out.println("Precio del libro:  " +precio);

    }
}
