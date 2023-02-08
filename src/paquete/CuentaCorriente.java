
package paquete;

public class CuentaCorriente extends Cuenta{
    private int numeroCheques=100;

    public CuentaCorriente(double saldo, String propietario) {
        super(saldo, propietario);
    }

    public CuentaCorriente() {
    }

    public void Retiro(int codigo ,double cantidad){
        
        saldo = saldo - cantidad;
        String retiro = "Retiro: " + String.valueOf(cantidad);
        historial.put(codigo, retiro);
         
    }
    public int getNumeroCheques() {
        return numeroCheques;
    }

    public void setNumeroCheques(int numeroCheques) {
        this.numeroCheques = numeroCheques;
    }

    @Override
    public String toString() {
        return super.toString()+"CuentaCorriente{" + "numeroCheques=" + numeroCheques + '}';
    }
    
    
}
