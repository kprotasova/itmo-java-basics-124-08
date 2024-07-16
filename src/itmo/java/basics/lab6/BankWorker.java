package itmo.java.basics.lab6;

public class BankWorker extends Human implements Bank {
    private String bankName;

    public BankWorker (String name, String surname, String bankName) {
        super (name, surname);
        this.bankName = bankName;
    }

    @Override
    public void printInfo() {
        System.out.println("BankWorker{" +
                "name='" + this.getName() + '\'' +
                ", surname='" + this.getSurname() + '\'' +
                ", bankName='" + bankName + '\'' +
                '}');
    }

    @Override
    public void checkAccountBalance() {
        System.out.println ("Счет клиента содержит n рублей");
    }
}
