package LABORATORIO_04.EJERCICIO_4;

import java.util.Scanner;

public class Bus extends Terrestre{
    // ATRIBUTOS
    private int numpasajeros;
    private String chofer;

    // CONSTRUCTOR
    public Bus(String marca,String modelo,String combustible,
               double veloMax,int numpasajeros,String chofer){
        super(marca,modelo,combustible,veloMax);
        this.numpasajeros = numpasajeros;
        this.chofer = chofer;
    }

    // METODO PARA INSTANCIAR UN OBJETO DE ESTA SUBCLASE
    public static Bus instanciarBus(){
        Scanner entrada = new Scanner(System.in);
        String a,b,c,d;
        double x;
        int y;
        System.out.print("Ingrese la marca del bus: "); a = entrada.nextLine();
        System.out.print("Ingrese el modelo del bus: "); b = entrada.nextLine();
        System.out.print("Ingrese el tipo de combustible: "); c = entrada.nextLine();
        System.out.print("Ingrese la velocidad Max del bus: "); x = entrada.nextDouble();
        System.out.print("Ingrese el numero de pasajeros: "); y = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese el nombre del chofer: "); d = entrada.nextLine();
        return new Bus(a,b,c,x,y,d);
    }

    // METODO PARA MOSTRAR LA INFORMACION
    public void mostrarInfo(){
        System.out.println("Transporte terrestre: bus");
        super.mostrarInfo();
        System.out.println("Numero de pasajeros: "+numpasajeros);
        System.out.println("Chofer: "+chofer);
    }
}