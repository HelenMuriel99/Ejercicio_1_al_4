package Ejercicio4_3.Universidad;

public class Estudiante extends Persona{
    String carrera;
    int semestre;
    public Estudiante(String nombre, String direccion, String carrera, int semestre){
        super(nombre, direccion);
        this.carrera=carrera;
        this.semestre=semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("La carrera es: "+carrera);
        System.out.println("El semestre es: "+semestre);
    }
}
