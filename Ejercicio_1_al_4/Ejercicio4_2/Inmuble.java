package Ejercicio4_2;

public class Inmuble {
    protected  int identificadorInmobiliario;
    protected  int area;
    protected String direccion;
    protected  double precioVenta;

    Inmuble(int identificadorInmobiliario, int area,String direccion){
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.area = area;
        this.direccion = direccion;
    }

    public double calcularPrecioVenta(double valorArea) {
        precioVenta = area * valorArea;
        return precioVenta;
    }

    public void imprimir() {
        System.out.println("Identificador inmobiliario : " +identificadorInmobiliario);
        System.out.println("Area : "+ area);
        System.out.println("Dirección : " + direccion);
        System.out.println("Precio de venta = $" + precioVenta);
    }
}