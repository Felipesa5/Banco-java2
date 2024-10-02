

public class Main {
    public static void main(String[] args) {
       
        Banco banco = new Banco();

        
        
        boolean pudoCrear = banco.adiccionarCuenta("12345", 100000, "Ahorros", "1060", "Andrés Felipe");
        if (pudoCrear) {
            System.out.println("Cuenta agregada correctamente " );
        }else
         {
            System.out.println("La cuenta no se pudo agregar");
         }


        pudoCrear = banco.adiccionarCuenta("12346", 120000, "Corriente", "1061", "Sebastian S");
         if (pudoCrear) {
             System.out.println("Cuenta agregada correctamente " );
         }else
          {
             System.out.println("La cuenta no se pudo agregar");
          }
          

          System.out.println("Total dinero en el banco: "+ banco.totalDineroBanco());
          System.out.println("Cliente de mayor saldo: "+ banco.clienteMayorDinero());


        
    }
}
