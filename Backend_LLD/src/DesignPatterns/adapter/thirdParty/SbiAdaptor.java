package DesignPatterns.adapter.thirdParty;

import DesignPatterns.adapter.BankAPI;
import DesignPatterns.adapter.thirdParty.sbiBank.SbiBank;

public class SbiAdaptor implements BankAPI {
    SbiBank sbiBank = new SbiBank();

    @Override
    public void sendMoney(String from, String to, int amount) {
        sbiBank.makePayment(from, to, amount);
    }

    @Override
    public void registerAccount(String accountNumber) {

    }

    @Override
    public long checkBalance(String accountNumber) {
        return 0;
    }
}
