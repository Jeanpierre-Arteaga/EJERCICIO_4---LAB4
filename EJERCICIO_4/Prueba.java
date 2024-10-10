package LABORATORIO_04.EJERCICIO_4;
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // INSTANCIANDO TRES ARRAYS DE LAS SUPERCLASES
        Terrestre[] terrestres= new Terrestre[20];
        Maritimo[] maritimos= new Maritimo[20];
        Aereo[] aereos= new Aereo[20];

        // INSTANCIANDO TRES OBJETOS DE LAS SUPERCLASES
        Terrestre t = new Terrestre();
        Maritimo m = new Maritimo();
        Aereo a = new Aereo();

        int opc1,opc2,opc3,opc4,opc5,i=0,j=0,k=0;
        do{
            System.out.println("\nREGISTROS DE TRASPORTES");
            System.out.println("-----------------------");
            System.out.println("1. Registro Terrestre");
            System.out.println("2. Registro Maritimo");
            System.out.println("3. Registro Aereo");
            System.out.println("4. Mostrar Informacion");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opc1 = entrada.nextInt();
            switch(opc1){
                case 1: System.out.println("\n 1.1. Auto");
                        System.out.println(" 1.2. Bus");
                        System.out.print("Elija una opción (1 ó 2): ");
                        opc2 = entrada.nextInt();
                        switch(opc2){
                            case 1: if(i<terrestres.length){
                                        t = Auto.instanciarAuto();
                                        terrestres[i] = t;
                                        i++;
                                    }
                                    else{
                                        System.out.println("El registro Terrestre está lleno.");
                                    }
                                    break;
                            case 2: if(i<terrestres.length){
                                        t = Bus.instanciarBus();
                                        terrestres[i]=t;
                                        i++;
                                    }
                                    else{
                                        System.out.println("El registro Terrestre está lleno.");
                                    }
                                    break;
                            default: System.out.println("Opcion no valida...");
                        }
                        break;
                case 2: System.out.println("\n 2.1. Barco");
                        System.out.println(" 2.2. Crucero");
                        System.out.print("Elija una opción (1 ó 2): ");
                        opc3 = entrada.nextInt();
                        switch(opc3){
                            case 1: if(j<maritimos.length){
                                        m = Barco.instanciarBarco();
                                        maritimos[j] = m;
                                        j++;
                                    }
                                    else{
                                        System.out.println("El registro Maritimo está lleno.");
                                    }
                                    break;
                            case 2: if(j<maritimos.length){
                                        m = Crucero.instanciarCrucero();
                                        maritimos[j] = m;
                                        j++;
                                    }
                                    else{
                                        System.out.println("El registro Maritimo está lleno.");
                                    }
                                    break;
                            default: System.out.println("Opcion no valida...");
                        }
                        break;
                case 3: System.out.println("\n 3.1. Avion");
                        System.out.println(" 3.2. Helicoptero");
                        System.out.print("Elija una opción (1 ó 2): ");
                        opc4 = entrada.nextInt();
                        switch(opc4){
                            case 1: if(k<aereos.length){
                                        a = Avion.instanciarAvion();
                                        aereos[k] = a;
                                        k++;
                                    }
                                    else{
                                        System.out.println("El registro Aereo está lleno.");
                                    }
                                    break;
                            case 2: if(k<aereos.length){
                                        a = Helicoptero.instanciarHelicoptero();
                                        aereos[k] = a;
                                        k++;
                                    }
                                    else{
                                        System.out.println("El registro Aereo está lleno.");
                                    }
                                    break;
                            default: System.out.println("Opcion no valida...");
                        }
                        break;
                case 4: System.out.println("\n 4.1. Terrestre");
                        System.out.println(" 4.2. Maritimo");
                        System.out.println(" 4.3. Aereo");
                        System.out.print("Elija una opción (1 , 2 ó 3): ");
                        opc5 = entrada.nextInt();
                        switch(opc5){
                            case 1: for(int x=0;x<i;x++){
                                        System.out.println("\nTRANSPORTE TERRESTRE "+(x+1));
                                        terrestres[x].mostrarInfo();
                                        System.out.println("---------------------------");
                                    }
                                    break;
                            case 2: for(int x=0;x<j;x++){
                                        System.out.println("\nTRANSPORTE MARITIMO "+(x+1));
                                        maritimos[x].mostrarInfo();
                                        System.out.println("---------------------------");
                                    }
                                    break;
                            case 3: for(int x=0;x<k;x++){
                                        System.out.println("\nTRANSPORTE AEREO "+(x+1));
                                        aereos[x].mostrarInfo();
                                        System.out.println("---------------------------");
                                    }
                                    break;
                            default: System.out.println("Opcion no valida...");
                        }
                        break;
                case 5: break;
                default: System.out.println("Opcion no valida...");
            }
        }while(opc1!=5);
        entrada.close();
    }
}