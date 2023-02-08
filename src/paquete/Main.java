
package paquete;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
       
      Cuenta cuenta = new Cuenta(100,"Bart");
      Cuenta cuenta1 = new CuentaAhorro(50,"Lisa");
      Cuenta cuenta2 = new CuentaCorriente(50,"Homero");
      
      Banco b = new Banco();
      b.agregar(cuenta);
      b.agregar(cuenta1);
      b.agregar(cuenta2);
      
      b.mostrarCuentas();
      b.cobrarMantenimiento();
      b.mostrarCuentas();
      
      b.cobrarMantenimiento();
      b.mostrarCuentas();
    }
    
}
