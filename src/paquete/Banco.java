
package paquete;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    
    List<Cuenta> cuentas = new ArrayList<>();
    
    public void agregar (Cuenta c ){
        cuentas.add(c);
    }
    
    public void mostrarCuentas(){
      
       cuentas.forEach(elemento -> System.out.println(elemento));
        
    }
    public void cobrarMantenimiento(){
        for (Cuenta cuenta : cuentas) {
            cuenta.Retiro(1, 50);
        }
    }
}
