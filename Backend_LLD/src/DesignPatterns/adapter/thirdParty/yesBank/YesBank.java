package DesignPatterns.adapter.thirdParty.yesBank;

public class YesBank {
    public void makePayment(String fromAccount, String toAccount, int amount) {
        System.out.println("YesBank transferring money from" + fromAccount + " to " + toAccount + "via YesBank");
    }
}
