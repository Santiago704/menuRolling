package com.mycompany.menurolling;

public class Hoteles {
    private String infoHotel;
    private String[] vecHoteles = {"Hielton es: Calificación: 4,0 de 5,0 DesdeCOP$382,788", "Jardin", "Casa San Agustin", "Grand sirenis san Andres", "La quinta", "nh hoteles"};
    
    
    //Constructor de de la clase Hoteles
    public Hoteles(){
        //this.nombres=nombres;
    }
    public String setMenu(){
        System.out.println("_______________________________");
        System.out.println("||           Hoteles         ||");
        System.out.println("-------------------------------");
        System.out.println("|| 1.Hilton                  ||");
        System.out.println("|| 2.Jardin                  ||");
        System.out.println("|| 3.Casa San Agustin        ||");
        System.out.println("|| 4.Grand sirenis san Andres||");
        System.out.println("|| 5.La quinta               ||");
        System.out.println("|| 6.NH hoteles              ||");
        System.out.println("|| 7.Volver                  ||");
        System.out.println("-------------------------------");
        System.out.println("Digite el numero del hotel que desea informacion:");
        return null;
    }
    //hace la busqueda de los hoteles
    public void setHotel(int numHotel) {
        
        for (int i = 0; i < vecHoteles.length; i++) {
            if (numHotel==7) {
                infoHotel="Usted ha salido del hotel";
            }else if(i==numHotel) {
                infoHotel =vecHoteles[i-1];
            } 
        }
    }
     public String getHotel() {
        return infoHotel;
    }
}
