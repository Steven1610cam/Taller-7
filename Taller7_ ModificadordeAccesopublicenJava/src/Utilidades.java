public class Utilidades {
    
    public static double suma(double a, double b) {
        return a + b;
    }

    
    public static double resta(double a, double b) {
        return a - b;
    }

  
    public static double multiplicacion(double a, double b) {
        return a * b;
    }

    
    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println("Error: División por cero.");
            return Double.NaN; // Retorna "No Es Un Numero" si se intenta dividir por cero
        }
        return a / b;
    }
}