
package javabasico;
public class TipoDatos {
    public void tiposdatos(){
        int myInteger =10;
        String myString = "Hola";
        double myDouble = 0;
        Object myObject = 20;
        
        System.out.println("myInteguer es de tipo" + ((Object)myInteger).getClass().getSimpleName());
        System.out.println("myString es de tipo" + ((Object)myString).getClass().getSimpleName());
        System.out.println("myDouble es de tipo" + ((Object)myDouble).getClass().getSimpleName());
        System.out.println("myDouble es de tipo" + ((Object)myDouble).getClass().getSimpleName());
        System.out.println("myObject es de tipo" + ((Object)myObject).getClass().getSimpleName());
    }
}
