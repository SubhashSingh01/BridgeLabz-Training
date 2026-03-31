

public interface TransferService {
    void transfer(double amount, Wallet sender, Wallet receiver) throws InsufficientBalanceException;
}
