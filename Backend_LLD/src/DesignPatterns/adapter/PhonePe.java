package DesignPatterns.adapter;

import DesignPatterns.adapter.thirdParty.SbiAdaptor;
import DesignPatterns.adapter.thirdParty.YesBankAdapter;

public class PhonePe {
    // we should use dependency injection
//   private static BankAPI bankApi = new YesBankAdapter();
private static BankAPI bankApi = new SbiAdaptor();

    public static void main(String[] args) {
        bankApi.sendMoney("1", "2", 3);
    }



}
