
package paquete;

import java.util.Map;

public class CuentaAhorro extends Cuenta {
    private double interesMensual = 3;

    public CuentaAhorro(double saldo, String propietario) {
        super(saldo, propietario);
    }

    public CuentaAhorro() {
    }

    public double getInteresMensual() {
        return interesMensual;
    }

    public void setInteresMensual(double interesMensual) {
        this.interesMensual = interesMensual;
    }

    @Override
    public String toString() {
        return super.toString() + "CuentaAhorro{" + "interesMensual=" + interesMensual + '}';
    }
    
}
