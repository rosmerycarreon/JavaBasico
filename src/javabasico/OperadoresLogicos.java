
package javabasico;

public class OperadoresLogicos {
    public void Operador(){
        boolean esVerdadero = true;
        boolean esFalso = false;
        
        //operador AND (&&)
        boolean resultado = esVerdadero && esFalso;
        System.out.println("Resultado AND: "+resultado);
        
        //operador OR (||)
        boolean resultado1 = esVerdadero || esFalso;
        System.out.println("Resultado OR: " + resultado1);
       
        //operador NOT (!)
        boolean resultado2 = !esVerdadero;
        System.out.println("Resultado NOT: " + resultado2);

    }
}
