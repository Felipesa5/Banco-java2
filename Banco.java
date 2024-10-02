import java.util.ArrayList;

public class Banco {

String nombre;
ArrayList<Cuenta> cuentas;

public Banco(){
    
    this.cuentas = new ArrayList<>();
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre){
    this.nombre = nombre;
}

public Cuenta buscarCuenta(String numero){
    for (Cuenta cuenta : cuentas){
        if (cuenta.getNumero().equals(numero)) {
            return cuenta;
        }
    }
    return null;
}

public boolean adiccionarCuenta(String numero, double saldoInicial, String tipo, 
                                String cedulaTitular, String nombreTitular){
    if (this.buscarCuenta(numero) != null){
        return false;
    }
    else{
        Cliente titular = new Cliente(cedulaTitular, nombreTitular);
        Cuenta cuenta = new Cuenta(numero, saldoInicial, tipo, titular);
        cuentas.add(cuenta);
        return true;
    }

}

public double totalDineroBanco(){
    double total = 0;
    for (Cuenta cuenta : cuentas) {
        total += cuenta.getSaldo();
    }
    return total;
}

public String clienteMayorDinero(){
    if (cuentas.isEmpty()){
        return "No hay cuentas inscriptas en el Banco";
    }
    Cuenta mayorSaldoCuenta = cuentas.get(0);
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getSaldo() > mayorSaldoCuenta.getSaldo()) {
                mayorSaldoCuenta = cuenta;
            }
        }
    return mayorSaldoCuenta.getTitular().getNombre();
    
}

}