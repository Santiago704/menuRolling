package com.mycompany.menurolling;

public class Hoteles {
    private String infoHotel;
    private final String[] vecHoteles = {"Hilton es: Calificacion: 4,0 de 5,0 DesdeCOP$382,788", "Jardin Calificacion: 4,3 de 5,0 DesdeCOP$400,788", 
        "Casa San Agustin Calificacion: 3,9 de 5,0 DesdeCOP$300,000", "Grand sirenis san Andres Calificacion: 3,5 de 5,0 DesdeCOP$365,00", 
        "La quinta Calificacion: 4,5 de 5,0 DesdeCOP$300,025", "nh hoteles Calificacion: 4,3 de 5,0 DesdeCOP$400,000"};
    
    
    //Constructor de de la clase Hoteles
    public Hoteles(){
    }
    
    public void setMenu(){
        System.out.println("_______________________________");
        System.out.println("||           Hoteles         ||");
        System.out.println("-------------------------------");
        System.out.println("|| 1.Hilton                  ||");
        System.out.println("|| 2.Jardin                  ||");
        System.out.println("|| 3.Casa San Agustin        ||");
        System.out.println("|| 4.Grand sirenis san Andres||");
        System.out.println("|| 5.La quinta               ||");
        System.out.println("|| 6.NH hoteles              ||");
        System.out.println("|| 7.Volver al menu inicial  ||");
        System.out.println("-------------------------------");
        System.out.println("Digite el numero del hotel que desea informacion:");
    }
    
    //hace la busqueda de los hoteles
    public void setHotel(int numHotel) {
        
        for (int i = 0; i < vecHoteles.length+1; i++) {
            if (numHotel==7) {
                infoHotel="Usted ha salido del menu hoteles";
            }else if(i==numHotel) {
                infoHotel =vecHoteles[i-1];
            } 
        }
    }
    public String getHotel() {
        return infoHotel;
    }    
}
