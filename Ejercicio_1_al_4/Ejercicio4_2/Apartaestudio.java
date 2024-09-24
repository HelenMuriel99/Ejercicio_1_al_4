package Ejercicio4_2;

public class Apartaestudio extends Apartamento{
    protected static double valorArea = 1500000;

    public Apartaestudio(int identificadorInmobibliario, int area, String direccion, int numeroHabitaciones, int numeroBaños){
        super(identificadorInmobibliario,area,direccion,1,1);
    }

    public void imprimir(){
        super.imprimir();
        System.out.println();
    }
}
