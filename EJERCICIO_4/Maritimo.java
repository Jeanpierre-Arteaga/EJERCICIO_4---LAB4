package LABORATORIO_04.EJERCICIO_4;

public class Maritimo {
    // ATRIBUTOS
    protected String nombre;
    protected double longitud;
    protected String capitan;

    // CONSTRUCTORES
    public Maritimo(){
    }
    public Maritimo(String nombre,double longitud,String capitan){
        this.nombre = nombre;
        this.longitud = longitud;
    }

    // METODO PARA MOSTRAR LA INFORMACION
    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Longitud: "+longitud);
        System.out.println("Capitan: "+capitan);
    }
}