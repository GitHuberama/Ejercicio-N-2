package Principal;

import Clases.Cliente;
import Clases.Prestamo;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        int cap = 0, indice = 0;
        int sw = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de prestamos que desea agregar");
        cap = entrada.nextInt();

        Cliente[] vClientes = new Cliente[cap];

        /*for(int i=0;i<cap;i++){
             
            Prestamo prestamo = new Prestamo ();
            prestamo.cargarPrestamo(i+1);
            vClientes[i]= prestamo;
            
            prestamo.calcularCuotas();
             
	}*/
        do {
            System.out.println("¿Que desea realizar?");
            System.out.println("1 - Cargar prestamo");
            System.out.println("2 - Mostrar Prestamos");
            System.out.println("3 - Calcular cuotas");
            System.out.println("4 - Salir del programa");
            
            sw = entrada.nextInt();

            switch (sw) {
                case 2:
                    for (int i = 0; i < indice; i++) {
                        vClientes[i].mostrar();
                    }
                    break;
                case 1:
                    if (indice < cap) {
                        Prestamo prestamo = new Prestamo();
                        prestamo.cargarPrestamo(indice + 1);
                        vClientes[indice] = prestamo;
                        indice++;
                    }else{
                        System.out.println("El limite de prestamos fue alcanzado");
                    }
                    break;
                case 3:
                    for (int i = 0; i < indice; i++) {
                        vClientes[i].calcularCuotas();
                    }
                    System.out.println("Las cuotas se calcularon exitosamente");
                    break;
                case 4:
                    System.out.println("Que tenga un hermoso dia");
                    break;
                default:
                    System.err.println("Opcion incorrecta");
            }

        } while (sw != 4);
    }

}
