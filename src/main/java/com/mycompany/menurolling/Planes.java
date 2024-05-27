package com.mycompany.menurolling;

public class Planes {
    private String[] vecPlanes = {"Plan City Tour","Plan Cafetero","Plan Playa y Mar","plan valle del cocora"};
    private String[] infoPlanes = {"Plan City Tour, alrededor de la ciudad, desde 300000COP","Plan Cafetero Tour, entre ciudades y montañas, desde 350000COP","Plan Playa y Mar, Tour alrededor de ciudades costeras, desde 400000COP","Tour alrededor del valle, desde 280000COP",};
    private String informacion;        
    
    public Planes() {
    }
    
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
        System.out.println("Digite el numero del plan que desea informacion:");
        return null;
    }
    public void setPlan(int numHotel) {
        
        for (int i = 0; i < infoPlanes.length+1; i++) {
            if (numHotel==5) {
                informacion="Usted ha salido del menu hoteles";
            }else if(i==numHotel) {
                informacion =infoPlanes[i-1];
            } 
        }
    }
    public  String getPlan(){
        return informacion;
    }
}
