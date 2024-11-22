public class Empleado {
    
    public String nombre;
    
    
    private double salario;

   
    public Empleado(String nombre, double salarioInicial) {
        this.nombre = nombre;
        setSalario(salarioInicial);
    }

    
    public double getSalario() {
        return salario;
    }

    
    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("El salario no puede ser negativo.");
        }
    }
}