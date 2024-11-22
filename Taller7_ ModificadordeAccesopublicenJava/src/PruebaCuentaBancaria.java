public class PruebaCuentaBancaria {
    public static void main(String[] args) {
        
        CuentaBancaria cuenta = new CuentaBancaria("123456789", 1000.0, "Ahorros");
        
        // Intentar acceder directamente a numeroCuenta (esto generará un error de compilación)
        // System.out.println("Número de cuenta: " + cuenta.numeroCuenta); // Descomentar esta línea generará un error
        
       
        System.out.println("Saldo inicial: " + cuenta.getSaldo());
        
        
        cuenta.setSaldo(1500.0);
        System.out.println("Nuevo saldo: " + cuenta.getSaldo());
        
        
        cuenta.setSaldo(-500.0); // Esto mostrará un mensaje de error
        
        
        cuenta.mostrarDetalles();
    }
}