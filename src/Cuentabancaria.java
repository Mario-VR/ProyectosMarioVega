public class Cuentabancaria {

    private String username;

    private Double balance;

    private int account_number;

    private String password;

    private String bank_name;




    public Cuentabancaria(String username, double balance, int account_number, String password, String bank_name){
        this.username = username;
        this.balance = balance;
        this.account_number = account_number;
        this.password = password;
        this.bank_name = bank_name;

    }
public Cuentabancaria(){

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String deposit(double money){
        this.balance += money;

        return "El saldo acutual es: "+ this.balance;
    }







    public String toString(){

        System.out.println("Los datos de la cuenta bancaria: ");
        System.out.println("Nombre del banco: " + getBank_name());
        System.out.println("Usuario: " + getUsername());
        System.out.println("Numero de cuenta: " + getAccount_number());
        System.out.println("Contraseña: " + getPassword());
        System.out.println("Saldo: " + getBalance());

        return "";

    }


}
