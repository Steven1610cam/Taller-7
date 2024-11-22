public class PruebaUtilidades {
    public static void main(String[] args) {
        
        double num1 = 10.0;
        double num2 = 5.0;

        // Suma
        double resultadoSuma = Utilidades.suma(num1, num2);
        System.out.println("Suma: " + resultadoSuma);

        // Resta
        double resultadoResta = Utilidades.resta(num1, num2);
        System.out.println("Resta: " + resultadoResta);

        // Multiplicación
        double resultadoMultiplicacion = Utilidades.multiplicacion(num1, num2);
        System.out.println("Multiplicación: " + resultadoMultiplicacion);

        // División
        double resultadoDivision = Utilidades.division(num1, num2);
        System.out.println("División: " + resultadoDivision);

        // Probar división por cero
        double resultadoDivisionPorCero = Utilidades.division(num1, 0);
        System.out.println("División por cero: " + resultadoDivisionPorCero);
    }
}