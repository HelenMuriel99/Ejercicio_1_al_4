package Ejercicio4_2.Tienda_Mascota;

public class Mascota{
    String nombre;
    int edad;
    String color;

    public Mascota(String nombre, int edad, String color){
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }

    public void imprimir(){
        System.out.println("Nombre del animal: " +nombre);
        System.out.println("Edad del animal: " +edad);
        System.out.println("Color del animal: " +color);
    }
}

