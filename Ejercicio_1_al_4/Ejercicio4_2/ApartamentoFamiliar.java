package Ejercicio4_2;

public class ApartamentoFamiliar extends Apartamento{
    protected static double valorArea = 2000000;
    protected int valorAdministracion;

    public ApartamentoFamiliar(int identificadorInmobiliario, int área, String dirección, int númeroHabitaciones, int númeroBaños, int valorAdministración){
        super(identificadorInmobiliario, área, dirección, númeroHabitaciones, númeroBaños);
        this.valorAdministracion = valorAdministración;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Valor de la administracion : $" +valorAdministracion);
        System.out.println();
    }
}
