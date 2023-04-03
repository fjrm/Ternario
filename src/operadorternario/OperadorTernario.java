package operadorternario;

public class OperadorTernario {

    public static void main(String[] args) {
        
        int i = 20;
        int j = 15;
        
        String mensaje = (i>j)?"i es mayor":"j es mayor";
        System.out.println("Mensaje: " + mensaje);
        
        int edad = 18;
        String mensaje2 = (edad>=18)?"Es mayor de edad":"Es menor de edad"; 
        System.out.println(mensaje2);
        
        int a = 20;
        int b = 5;
        String mensaje3 = (a%b == 0)?"El número es par":"El número es impar";
        System.out.println(mensaje3);
        
        int c = 0;
        String mensaje4 = (c >= 0)?"El número es positivo":"El número es negativo";
        System.out.println(mensaje4);
 
    }
    
}
