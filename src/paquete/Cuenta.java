
package paquete;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.HashMap;
import java.util.Map;


public class Cuenta {
    protected double saldo;
    private String propietario;
    private Fecha f = new Fecha();
    protected Map<Integer,String> historial = new HashMap<>();

    public Cuenta(double saldo, String propietario) {
        this.saldo = saldo;
        this.propietario = propietario;
    }

    public Cuenta() {
    }
    
    
    public void Deposito(int codigo, double cantidad){
        saldo = saldo + cantidad;
        String deposito = "Deposito: " + String.valueOf(cantidad);
        historial.put(codigo,deposito);

    }
    public void Retiro(int codigo ,double cantidad){
       if(saldo<cantidad){
           System.out.println("Fondos insuficientes");
       }else{
            saldo = saldo - cantidad;
            String retiro = "Retiro: " + String.valueOf(cantidad);
            historial.put(codigo, retiro);
       }  
    }
    
    public void verMovimientos(){
        System.out.println("\tHistorial de Movimientos");
        System.out.println("Propietario : " + propietario);
        System.out.println("Concepto \t\t\tFecha");
        
        for (Map.Entry<Integer, String> entry : historial.entrySet()) {
          System.out.println(entry.getKey() + " : " + entry.getValue()+ "\t\t"+f );
        }
        System.out.println("");
        System.out.println("SALDO: "+saldo);

    }
    
    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + ", propietario=" + propietario + ", f=" + f + '}';
    }
    
    public double getSaldo() {
        return saldo;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public Fecha getF() {
        return f;
    }

       
}
