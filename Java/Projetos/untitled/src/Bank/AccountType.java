package Bank;

public enum AccountType {
    CORRENTE, POUPANCA;

    @Override
    public String toString() {
        return switch (this) {
            case CORRENTE -> "Corrente";
            case POUPANCA -> "Poupança";
        };
    }
}
