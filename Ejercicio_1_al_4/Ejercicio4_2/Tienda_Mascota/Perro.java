package Ejercicio4_2.Tienda_Mascota;

public class Perro extends Mascota{
    enum tipoPerPeq{CANICHE,YORKSHIRE_TERRIER,SCHNAUZER,CHIHUAHUA}
    Perro.tipoPerPeq tipoPerroPequeño;
    enum tipoPerMed{COLLIE,DALAMATA,BULLDOG,GALGO,SABUESO}
    Perro.tipoPerMed tipoPerroMediano;
    enum  tipoPerGran{PASTOR_ALEMAN,DOBERMAN,ROTWEILLER}
    Perro.tipoPerGran tipoPerroGrande;

    public Perro(String nombre, int edad, String color,Perro.tipoPerPeq tipoPerroPequeño, Perro.tipoPerMed tipoPerroMediano, Perro.tipoPerGran tipoPerroGrande){
        super(nombre, edad,color);
        this.tipoPerroPequeño = tipoPerroPequeño;
        this.tipoPerroMediano = tipoPerroMediano;
        this.tipoPerroGrande = tipoPerroGrande;
    }

}
