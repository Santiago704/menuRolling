package com.mycompany.menurolling;

import java.util.Scanner;

public class MenuRolling {

    public static void main(String[] args) {
        /*0.0 Declaracion de variables*/
        int digitoMenu1 = 0;
        int digitoMenu2 = 0;
        int digitoMenu3 = 0;
        int digitoMenu4 = 0;
        int tiempoReserva;
        int numDias;
        
        Scanner leer = new Scanner(System.in);
        
        /*2.0 Menu inicial*/
        do{
            //2.1 Esquema del menu inicial
            System.out.println("______________________________");
            System.out.println("||      Bienvenido          ||");
            System.out.println("------------------------------");
            System.out.println("|| 1. Informacion de hoteles||");
            System.out.println("|| 2. Busqueda de planes    ||");
            System.out.println("|| 3. Agendar plan!         ||");
            System.out.println("|| 4. Salir del menu        ||");
            System.out.println("------------------------------");
            System.out.println("Digite el numero del menu:");
            
            digitoMenu1 = leer.nextInt();
            
            //2.2 Estructura switch del menu
            switch(digitoMenu1){
                case 1:
                    do{
                    Hoteles hotel = new Hoteles(); 
                    hotel.setMenu();
                    digitoMenu2 = leer.nextInt(); leer.nextLine();
                    hotel.setHotel(digitoMenu2);
                    System.out.println("La informacion del hotel "+hotel.getHotel());
                    }while(digitoMenu2!=7);
                    break;
                case 2:
                    do{
                    Planes plan1 = new Planes();
                    plan1.setMenu();
                    digitoMenu3 = leer.nextInt(); leer.nextLine();
                    plan1.setPlan(digitoMenu3);
                    System.out.println("La informacion del plan "+plan1.getPlan());
                    }while(digitoMenu3!=5);
                    break;
                case 3:
                    System.out.println("Cuantos dias deseas reservar:");
                    tiempoReserva = leer.nextInt(); leer.nextLine();
                    Reserva reserva1 = new Reserva(tiempoReserva);
                    reserva1.setMenu();
                    digitoMenu4 = leer.nextInt(); leer.nextLine();
                    if (digitoMenu4>=1 && digitoMenu4<5) {
                       System.out.println("-----------------------------------------");
                    System.out.println("|| Su plan ha sigo agendado con extito ||");
                    System.out.println("-----------------------------------------");
                    System.out.println("  Tiene un costo de "+reserva1.getPrecio(digitoMenu4, tiempoReserva)+"$");
                    System.out.println("  Para "+tiempoReserva+" dias");
                    System.out.println("  En el tour "+ reserva1.getTour(digitoMenu4));
                    System.out.println("-----------------------------------------"); 
                    }
                    break;
                case 4:
                    System.out.println("Usted salio del menu");
                    break;
                default:
                    System.out.println("Usted digito el un numero incorrecto digite de nuevo");
            }
        }while(digitoMenu1!=4);
    }
}
