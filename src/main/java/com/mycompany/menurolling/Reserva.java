package com.mycompany.menurolling;

import java.util.Date;

public class Reserva {
    private int tiempoReserva;
    private String[] vecPlanes = {"Plan City Tour","Plan Cafetero","Plan Playa y Mar","plan valle del cocora"};
    private double[] costoDiaTour = {90000,120000,150000,175000}; 
    private String informacion;  

    public Reserva(int tiempoReserva) {
        this.tiempoReserva = tiempoReserva;
    }
        
    public void setMenu(){
        System.out.println("_______________________________");
        System.out.println("||        Menu Planes        ||");
        System.out.println("-------------------------------");
        for (int i = 0; i < vecPlanes.length; i++) {
            System.out.println(" "+(i+1)+". "+vecPlanes[i]);
            if (i==vecPlanes.length-1) {
                System.out.println(" "+(i+2)+". Volver al menu inicial  ");
            }
        }
        System.out.println("-------------------------------");
        System.out.println("Digite el numero del plan que desea reservar:");
    }
    
    public double getPrecio(int digitoMenu4, int numDias){
        double costo = 0;
        for (int i = 0; i < costoDiaTour.length; i++) {
            if (digitoMenu4==i+1) {
                costo= costoDiaTour[i]*numDias;
            }
        }
        return costo;
    }
    
    public String getTour(int digitoMenu4){
        String tour = null;
        for (int i = 0; i < costoDiaTour.length; i++) {
            if (digitoMenu4==i+1) {
                tour = vecPlanes[i];
            }
        }
        return tour;
    }
}
