package Bank;

public class Client {
    public static String name;

    public static int id;

    public static String  password;

    public static AccountType accountType;

    public static int cash;

    @Override
    public String toString() {
        return " client" +
                " name = '" + name + '\'' +
                ", ID = '" + id + '\'' +
                ", password = '" + password + '\'' +
                ", AccountType = " + accountType +
                " ";
    }
}