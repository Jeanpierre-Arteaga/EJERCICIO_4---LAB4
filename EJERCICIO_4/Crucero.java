package LABORATORIO_04.EJERCICIO_4;

import java.util.Scanner;

public class Crucero extends Maritimo {
    // ATRIBUTOS
    private int tripulantes;
    private int habitaciones;

    // CONSTRUCTOR
    public Crucero(String nombre,double longitud,String capitan,
                   int tripulantes,int habitaciones){
        super(nombre,longitud,capitan);
        this.tripulantes = tripulantes;
        this.habitaciones = habitaciones;
    }

    // METODO PARA INSTANCIAR UN OBJETO DE ESTA SUBCLASE
    public static Crucero instanciarCrucero(){
        Scanner entrada = new Scanner(System.in);
        String a,b;
        double x;
        int y,z;
        System.out.print("Ingrese el nombre del crucero: "); a = entrada.nextLine();
        System.out.print("Ingrese la longitud del crucero: "); x = entrada.nextDouble();
        entrada.nextLine();
        System.out.print("Ingrese el nombre del capitan: "); b = entrada.nextLine();
        System.out.print("Ingrese el número de tripulantes: "); y = entrada.nextInt();
        System.out.print("Ingrese el número de habitaciones: "); z = entrada.nextInt();
        return new Crucero(a,x,b,y,z);
    }
    
    // METODO PARA MOSTRAR LA INFORMACION
    public void mostrarInfo(){
        System.out.println("Transporte maritimo: crucero");
        super.mostrarInfo();
        System.out.println("Numero de tripulantes: "+tripulantes);
        System.out.println("Numero de habitaciones: "+habitaciones);
    }
}
