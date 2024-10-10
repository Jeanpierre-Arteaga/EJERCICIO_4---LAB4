package LABORATORIO_04.EJERCICIO_4;

import java.util.Scanner;

public class Barco extends Maritimo {
    // ATRIBUTOS
    private String tipo;
    private double capacidadMax;

    // CONSTRUCTOR
    public Barco(String nombre,double longitud,String capitan,
                 String tipo,double capacidadMax){
        super(nombre,longitud,capitan);
        this.tipo = tipo;
        this.capacidadMax = capacidadMax;
    }

    // METODO PARA INSTANCIAR UN OBJETO DE ESTA SUBCLASE
    public static Barco instanciarBarco(){
        Scanner entrada = new Scanner(System.in);
        String a,b,c;
        double x,y;
        System.out.print("Ingrese el nombre del barco: "); a = entrada.nextLine();
        System.out.print("Ingrese la longitud del barco: "); x = entrada.nextDouble();
        entrada.nextLine();
        System.out.print("Ingrese el nombre del capitan: "); b = entrada.nextLine();
        System.out.print("Ingrese el tipo de barco: "); c = entrada.nextLine();
        System.out.print("Ingrese la capacidad maxima del barco: "); y = entrada.nextDouble();
        return new Barco(a,x,b,c,y);
    }

    // METODO PARA MOSTRAR LA INFORMACION
    public void mostrarInfo(){
        System.out.println("Transporte maritimo: barco");
        super.mostrarInfo();
        System.out.println("Tipo de barco: "+tipo);
        System.out.println("Capacidad maxima (toneladas): "+capacidadMax);
    }
}
