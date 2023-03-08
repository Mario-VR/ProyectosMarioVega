import java.awt.*;
import java.util.Scanner;
public class TestCuentaB {


        public static int Menu() {
            Scanner entrada = new Scanner(System.in);
            int option;


            System.out.println("[1] Saldo");
            System.out.println("[2] Retirar");
            System.out.println("[3] Depositar");
            System.out.println("[0] Salir");
            option = entrada.nextInt();


            return option;

        }



    public static void main(String[] args) {
            int option = 0;
            int valTemp;
        System.out.println("Probando la clase Cuentabancaria ");
Cuentabancaria Account = new Cuentabancaria();


    Account.setBank_name("BBVA");
        Account.setUsername("MirianBahena");
        Account.setAccount_number(12345678);
       Account.setPassword("m24i/");
        Account.setBalance(2000.00);

       // Account.toString(); //

       do {
         valTemp = Menu();
       }while (option != 0);
        System.out.println("La opcion seleccionada:  " + valTemp);
        if (option == 1){
            System.out.println("Tu saldo es: "  );
            Account.getBalance();
        }

        if (option == 2){
            System.out.println("Dijite la cantidad a retirar: " );

        }


}
}

