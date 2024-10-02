public class Cuenta {
    
    String numero;
    double saldo;
    String tipo;
    Cliente titular;

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cliente getTitular() {
        return titular;
    }


   public Cuenta(String numero, double saldo, String tipo, Cliente titular){

       this.numero= numero;
       this.saldo=saldo;
       this.tipo= tipo;
       this.titular=titular;
       }

    public void consignar(double cantidad){
        saldo += cantidad;
    }

    public boolean retirar(double cantidad){
        if(saldo >= cantidad){
            saldo -= cantidad;
            return true;
        }

        return false;
    }

    public double consultarSaldo(){
        return saldo;
    }

}
