package Clases;

import java.util.Scanner;

public class Prestamo extends Cliente {
    Scanner entrada = new Scanner(System.in);
    
    protected float montoPrestamo;
    protected float cuotaPura;
    protected float porcentajeRecargo;
    protected float cuotaPagar;
    protected float cantCuotas;    

    public Prestamo() {
    this.montoPrestamo=0;
    this.cuotaPura=0;
    this.porcentajeRecargo=0;
    this.cuotaPagar=0;
    this.cantCuotas=0;
    }

    public void cargarPrestamo(int indice){
        super.cargarCliente(indice);
        
        if (super.antiguedad<3){
            System.err.println("Este cliente no puede recibir un prestamo por una antiguedad menor a 3 años");
        }
        else{
          int sw=0;
            System.out.println("Seleccione el numero correspondiente al monto prestado al cliente");
            System.out.println("1 = $40000");
            System.out.println("2 = $50000");
            System.out.println("3 = $60000");
            System.out.println("4 = $70000");
            sw=entrada.nextInt();
            
            switch (sw) {
                case 1:
                    this.montoPrestamo=40000;
                    this.cuotaPura=400;
                    this.porcentajeRecargo=10;
                    this.cantCuotas=100;
                    break;
                case 2:
                    this.montoPrestamo=50000;
                    this.cuotaPura=500;
                    this.porcentajeRecargo=14;
                    this.cantCuotas=100;
                    break;
                case 3:
                    this.montoPrestamo=60000;
                    this.cuotaPura=600;
                    this.porcentajeRecargo=18;
                    this.cantCuotas=100;
                    break;
                case 4:
                    this.montoPrestamo=70000;
                    this.cuotaPura=700;
                    this.porcentajeRecargo=22;
                    this.cantCuotas=100;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
            
        }
        
        
    }

    @Override
    public String toString() {
        return "Monto Prestamo= $" + montoPrestamo + ", Cuota Pura= $" + cuotaPura + ", Cant de Cuotas=" + cantCuotas + ", Cuota a Pagar= $" + cuotaPagar + '}';
    }

    public void mostrar(){
        System.out.println(super.toString()+this.toString());
    }
    
    public void calcularCuotas (){
        this.cuotaPagar=this.cuotaPura+((this.cuotaPura*this.porcentajeRecargo)/100);
    }
}
