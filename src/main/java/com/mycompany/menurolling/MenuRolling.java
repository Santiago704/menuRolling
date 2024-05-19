package com.mycompany.menurolling;

import java.util.Scanner;

public class MenuRolling {

    public static void main(String[] args) {
        /*0.0 Declaracion de variables*/
        int digitoMenu1 = 0;
        int digitoMenu2 = 0;
        
        Scanner leer = new Scanner(System.in);
        
        /*2.0 Menu inicial*/
        do{
            //2.1 Esquema del menu inicial
            System.out.println("_____________________________ \n||      Bienvenido          || \n------------------------------" );
            System.out.println("|| 1. Informacion de hoteles|| \n|| 2. Busqueda de plan      || \n|| 3. Agendar plan!         || \n|| 4. Salir del menu        ||\n------------------------------ \n \nDigite el numero del menu:");
 
            digitoMenu1 = leer.nextInt();
            
            //2.2 Estructura switch del menu
            switch(digitoMenu1){
                case 1:
                    do{
                    Hoteles hotel = new Hoteles();
                    hotel.setMenu();
                    digitoMenu2 = leer.nextInt(); leer.nextLine();
                    hotel.setHotel(digitoMenu2);
                    System.out.println("La informacion del hotel"+hotel.getHotel());
                    }while(digitoMenu2!=7);
                    break;
                case 2:
                    System.out.println("Planes disponibles");
                    break;
                case 3:
                    System.out.println("Agendar plan");
                case 4:
                    System.out.println("Usted salio del menu");
                default:
                    System.out.println("Usted digito el un numero incorrecto digite de nuevo");
            }
        }while(digitoMenu1!=4);
    }
}
