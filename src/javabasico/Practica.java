
package javabasico;

import java.util.Scanner;


public class Practica {
   //switch case
    
    public void menu(){
        System.out.println("Elije una opcion");
        System.out.println("1. Desayuno");
        System.out.println("2. Almuerzo");
        System.out.println("3. Cena");
        System.out.println("4. Extras");
        System.out.println("5. Salir");
        
        System.out.println("Elejir opcion: ");
        Scanner sc = new Scanner(System.in);
        
        int ValorQueInsertaElUsuario = sc.nextInt();
        switch(ValorQueInsertaElUsuario){
            case 1:
                System.out.println("Jugo de papaya");
                System.out.println("Caldo de cabeza");
                System.out.println("Lomo saltado"); 
            case 2:
                System.out.println("Estofado");
                System.out.println("Matasquita");
            case 3:
                System.out.println("Pollo a la braza");
                System.out.println("Salchipapa");
            case 4:
                System.out.println("No tenemos extras");
            case 5:
                System.out.println("Gracias por Visitarnos");
                break;
            default:
                System.out.println("Vuelva Pronto");
                break;
        }
    }
}
