package LABORATORIO_04.EJERCICIO_4;

import java.util.Scanner;

public class Avion extends Aereo{
    // ATRIBUTOS
    private int numpasajeros;
    private String salida;
    private String llegada;

    // CONSTRUCTOR
    public Avion(String modelo,double envergadura,String tipo,String piloto,
                 int numpasajeros,String salida,String llegada){
        super(modelo, envergadura, tipo, piloto);
        this.numpasajeros =numpasajeros;
        this.salida = salida;
        this.llegada = llegada;
    }

    // METODO PARA INSTANCIAR UN OBJETO DE ESTA SUBCLASE
    public static Avion instanciarAvion(){
        Scanner entrada = new Scanner(System.in);
        String a,b,c,d,e;
        double x;
        int y;
        System.out.print("Ingrese el modelo del avion: "); a = entrada.nextLine();
        System.out.print("Ingrese la envergadura del avion: "); x = entrada.nextDouble();
        entrada.nextLine();
        System.out.print("Ingrese el tipo de avion: "); b = entrada.nextLine();
        System.out.print("Ingrese el nombre del piloto: "); c = entrada.nextLine();
        System.out.print("Ingrese el numero de pasajeros: "); y = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese la hora de salida: "); d = entrada.nextLine();
        System.out.print("Ingrese la hora de llegada: "); e = entrada.nextLine();
        return new Avion(a,x,b,c,y,d,e);
    }
    
    // METODO PARA MOSTRAR LA INFORMACION
    public void mostrarInfo(){
        System.out.println("Transporte aereo: avion");
        super.mostrarInfo();
        System.out.println("Numero de pasajeros: "+numpasajeros);
        System.out.println("Hora de salida: "+salida);
        System.out.println("Hora de llegada: "+llegada);
    }
}