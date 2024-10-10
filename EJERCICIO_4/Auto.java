package LABORATORIO_04.EJERCICIO_4;

import java.util.Scanner;

public class Auto extends Terrestre{
    // ATRIBUTOS
    private int asientos;
    private double kilometraje;
    private String estado;

    // CONSTRUCTOR
    public Auto(String marca,String modelo,String combustible,double veloMax,
                int asientos,double kilometraje,String estado){
        super(marca,modelo,combustible,veloMax);
        this.asientos = asientos;
        this.kilometraje = kilometraje;
        this.estado = estado;
    }

    // METODO PARA INSTANCIAR UN OBJETO DE ESTA SUBCLASE
    public static Auto instanciarAuto(){
        Scanner entrada = new Scanner(System.in);
        String a,b,c,d;
        double x,y;
        int z;
        System.out.print("Ingrese la marca del auto: "); a = entrada.nextLine();
        System.out.print("Ingrese el modelo del auto: "); b = entrada.nextLine();
        System.out.print("Ingrese el tipo de combustible: "); c = entrada.nextLine();
        System.out.print("Ingrese la velocidad Max del auto: "); x = entrada.nextDouble();
        System.out.print("Ingrese el numero de asientos del auto: "); z = entrada.nextInt();
        System.out.print("Ingrese el kilometraje del auto: "); y = entrada.nextDouble();
        entrada.nextLine();
        System.out.print("Ingrese el estado del auto: "); d = entrada.nextLine();
        return new Auto(a,b,c,x,z,y,d);
    }

    // METODO PARA MOSTRAR LA INFORMACION
    public void mostrarInfo(){
        System.out.println("Transporte terrestre: auto");
        super.mostrarInfo();
        System.out.println("Numero de asientos: "+asientos);
        System.out.println("Kilometraje: "+kilometraje);
        System.out.println("Estado: "+estado);
    }
}