package DesignPatterns.adapter.thirdParty;

import DesignPatterns.adapter.BankAPI;
import DesignPatterns.adapter.PhonePe;
import DesignPatterns.adapter.thirdParty.yesBank.YesBank;

public class YesBankAdapter implements BankAPI {

    private YesBank yesBank = new YesBank();

    @Override
    public void sendMoney(String from, String to, int amount) {
        yesBank.makePayment(from, to, 10);
    }

    @Override
    public void registerAccount(String accountNumber) {

    }
    @Override
    public long checkBalance(String accountNumber) {
        return 0;
    }

}
