package Ejercicio4_2;

public class InmuebleVivienda extends Inmuble{
    protected int numeroHabitaciones;
    protected int numeroBaños;

    public InmuebleVivienda(int identificadorInmobiliario,int area, String direccion, int numeroHabitaciones, int numeroBaños ){
        super(identificadorInmobiliario, area, direccion);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBaños = numeroBaños;
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("Numero de habitaciones :  "+numeroHabitaciones);
        System.out.println("Número de baños : "+ numeroBaños);
    }
}
