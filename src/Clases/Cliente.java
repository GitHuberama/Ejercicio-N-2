package Clases;

import java.util.Scanner;


public class Cliente {
    
    
    protected int nroCliente=0;
    protected String nombreCliente="";
    protected int dni=0;
    protected  int antiguedad=0;
    //static int aumentador=1;

    public Cliente() {
        this.nroCliente=0;
        this.nombreCliente="";
        this.dni=0;
        this.antiguedad=0;
    }

    public void cargarCliente(int aumentador){
        Scanner entrada = new Scanner(System.in);
        this.nroCliente=aumentador;
        //aumentador++;
        
        System.out.println("Ingrese el nombre del cliente");
        this.nombreCliente = entrada.next();
       
        System.out.println("Ingrese el DNI del cliente");
        this.dni = entrada.nextInt();
        
        System.out.println("Ingrese la antiguedad del cliente");
        this.antiguedad = entrada.nextInt();
        
}

    @Override
    public String toString() {
        return "Cliente{" + "Nro Cliente=" + nroCliente + ", Nombre=" + nombreCliente + ", DNI=" + dni + ", Antiguedad=" + antiguedad + '}';
    }
    
    public void mostrar(){
        
        System.out.println(toString());
    }

    public void calcularCuotas (){
        
    }

    
   
    
    
    
}
