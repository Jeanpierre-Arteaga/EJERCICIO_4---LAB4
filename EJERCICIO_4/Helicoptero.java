package LABORATORIO_04.EJERCICIO_4;

import java.util.Scanner;

public class Helicoptero extends Aereo{
    // ATRIBUTOS
    private double alturaMax;
    private double capacidadMax;
    
    // CONSTRUCTOR
    public Helicoptero(String modelo,double envergadura,String tipo,String piloto,
                       double alturaMax,double capacidadMax){
        super(modelo, envergadura, tipo, piloto);
        this.alturaMax =alturaMax;
        this.capacidadMax = capacidadMax;
    }

    // METODO PARA INSTANCIAR UN OBJETO DE ESTA SUBCLASE
    public static Helicoptero instanciarHelicoptero(){
        Scanner entrada = new Scanner(System.in);
        String a,b,c;
        double x,y,z;
        System.out.print("Ingrese el modelo del helicoptero: "); a = entrada.nextLine();
        System.out.print("Ingrese la envergadura del helicoptero: "); x = entrada.nextDouble();
        entrada.nextLine();
        System.out.print("Ingrese el tipo de helicoptero: "); b = entrada.nextLine();
        System.out.print("Ingrese el nombre del piloto: "); c = entrada.nextLine();
        System.out.print("Ingrese la altura maxima: "); y = entrada.nextDouble();
        System.out.print("Ingrese la capacidad maxima: "); z = entrada.nextDouble();
        return new Helicoptero(a,x,b,c,y,z);
    }

    // METODO PARA MOSTRAR LA INFORMACION
    public void mostrarInfo(){
        System.out.println("Transporte aereo: helicoptero");
        super.mostrarInfo();
        System.out.println("Altura maxima (km): "+alturaMax);
        System.out.println("Capacidad maxima (toneladas): "+capacidadMax);
    }
}