package itmo.java.basics.lab6;

public class Client extends Human implements Bank{
    private String bankName;

    public Client (String name, String surname, String bankName) {
        super (name, surname);
        this.bankName = bankName;
    }

    @Override
    public void printInfo() {
        System.out.println("Client{" +
                "name='" + this.getName() + '\'' +
                ", surname='" + this.getSurname() + '\'' +
                ", bankName='" + bankName + '\'' +
                '}');
    }

    @Override
    public void checkAccountBalance() {
        System.out.println ("Ваш счет содержит n рублей");
    }
}
