package Ejercicio4_2;

public class Local extends Inmuble{
    enum tipo{INTERNO, CALLE}
    protected tipo tipoLocal;
    public Local(int identificadorInmobiliario, int area, String direccion, tipo tipoLocal){
        super(identificadorInmobiliario, area, direccion);
        this.tipoLocal = tipoLocal;
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("Tipo de local : " +tipoLocal);
    }
}
