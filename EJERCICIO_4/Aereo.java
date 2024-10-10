package LABORATORIO_04.EJERCICIO_4;

public class Aereo {
    // ATRIBUTOS
    protected String modelo;
    protected double envergadura;
    protected String tipo;
    private String piloto;

    // CONSTRUCTORES
    public Aereo(){
    }
    public Aereo(String modelo,double envergadura,
                 String tipo,String piloto){
        this.modelo = modelo;
        this.envergadura = envergadura;
        this.tipo = tipo;
        this.piloto = piloto;
    }

    // METODO PARA MOSTRAR LA INFORMACION
    public void mostrarInfo(){
        System.out.println("Modelo: "+modelo);
        System.out.println("Envergadura: "+envergadura);
        System.out.println("Tipo: "+tipo);
        System.out.println("Piloto: "+piloto);
    }
}