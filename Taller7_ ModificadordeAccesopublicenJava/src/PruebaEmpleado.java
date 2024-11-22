public class PruebaEmpleado {
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Juan Pérez", 3000.0);
        
        
        System.out.println("Nombre del empleado: " + empleado1.nombre);
        
        
        System.out.println("Salario del empleado: " + empleado1.getSalario());
        
        
        empleado1.setSalario(-1500.0); // Esto mostrará un mensaje de error
        
       
        empleado1.setSalario(3500.0);
        System.out.println("Nuevo salario del empleado: " + empleado1.getSalario());
    }
}