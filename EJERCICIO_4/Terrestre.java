package LABORATORIO_04.EJERCICIO_4;

public class Terrestre {
    // ATRIBUTOS
    protected String marca;
    protected String modelo;
    protected String combustible;
    protected double veloMax;

    // CONSTRUCTORES
    public Terrestre(){
    }
    public Terrestre(String marca,String modelo,String combustible,double veloMax){
        this.marca = marca;
        this.modelo = modelo;
        this.combustible = combustible;
        this.veloMax = veloMax;
    }

    // METODO PARA MOSTRAR LA INFORMACION
    public void mostrarInfo(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Velocidad máxima: "+veloMax);
        System.out.println("Combustible: "+combustible);
    }
}