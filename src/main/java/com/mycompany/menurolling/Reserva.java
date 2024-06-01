package com.mycompany.menurolling;

import java.util.Date;

public class Reserva {
    private Date fecha;
    private String fechaReserva;
    private String[] vecPlanes = {"Plan City Tour","Plan Cafetero","Plan Playa y Mar","plan valle del cocora"};
    private String informacion;        
    
    
    public String setMenu(){
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
        return null;
    }
    
}
