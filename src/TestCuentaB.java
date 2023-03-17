import javax.sound.midi.Soundbank;
import java.awt.*;
import java.util.Scanner;
public class TestCuentaB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float newbalance = 0;
        double balance;
        int num1 = 0, option;

        Cuentabancaria dueño = new Cuentabancaria("Mario", 2000, 22670080, "Hm123", "BanaMex");


        do {
            System.out.println("Que desea hacer en su cuenta? \n");

            System.out.println("[1] Saldo");
            System.out.println("[2] Retirar");
            System.out.println("[3] Depositar");
            System.out.println("[0] Salir");
            option = sc.nextInt();


            if (option == 1) {
                System.out.println("Tu saldo es: " + dueño.getBalance());

            } else if (option == 2) {
                System.out.println("---Usted hara un retiro---");
                System.out.println("Su saldo en la cuenta es de: " + dueño.getBalance());


                System.out.println("Dijite la cantidad a retirar: ");
                num1 = sc.nextInt();

                newbalance = (float)
                        dueño.getBalance() - num1;
                dueño.setBalance(newbalance);

                System.out.println("su saldo despues de esta operacion es: " + dueño.getBalance());

            } else if (option == 3) {
                System.out.println("---Usted hara un deposito---");
                System.out.println("Su saldo es de: " + dueño.getBalance());

                System.out.println("Dijite la cantidad a depositar: ");
                num1 = sc.nextInt();

                newbalance = (float)
                        dueño.getBalance() + num1;
                dueño.setBalance(newbalance);


                System.out.println("su saldo despues de esta operacion es: " + dueño.getBalance());


            } else
                System.out.println("Adios, vuelva pronto :D");


            }
            while (option >= 1 && option <= 3) ;
            System.out.println("\n " );


            dueño.toString();

        }
    }




