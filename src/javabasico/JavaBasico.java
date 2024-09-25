
package javabasico;

import java.util.Scanner;

public class JavaBasico {
    
    public void principal(){
        System.out.println("Bienvenido Java Basico");
        System.out.println("1. Operadores Logicos");
        System.out.println("2. Tipos de datos");
        System.out.println("3. Estructuras de control");
        System.out.println("4. Exepciones");
        System.out.println("5. Estructura de datos");
        
         System.out.println("Elejir opcion: ");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        
         switch(data){
            case 1:
                OperadoresLogicos ol = new OperadoresLogicos();
                ol.Operador();
                break;
                
          case 2:
                TipoDatos td = new TipoDatos();
                td.tiposdatos();
                break;
                
          case 3:
                EstructuraControl ec = new EstructuraControl();
                //ec.estructura();
                ec.tablamultiplicar(1000);
                break;
    }
    }

    public static void main(String[] args) {
        Practica pac = new Practica();
        JavaBasico jb = new JavaBasico();
        
        jb.principal();
        //pac.menu();
    }
    
}
