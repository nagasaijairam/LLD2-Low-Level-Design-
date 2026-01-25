package DesignPatterns.adapter.thirdParty.sbiBank;

public class SbiBank {
    public void makePayment(String fromAccount, String toAccount, int amount) {
        System.out.println("SBI transferring money from " + fromAccount + " to " + toAccount+ " via SBI Bank");
    }
}
