package DesignPatterns.Builder;

public class Client {
    public static void main(String[] args) {
        // Way 1 : Using long and multiple constructors
        // Way 2 : Using setters
        // Way 3 : Using a HashMap
        // Way 4 : Using another custom class to take input on behalf of original class

        // Wowification

//        So here SoldItem builder giving the connectivity b/w the SoldItem and SoldItemBuilder
//        SoldItemsBuilder soldItemsBuilder = new SoldItemsBuilder();
        SoldItem soldItem = SoldItem
                .builder()
                .setId(1)
                .setName("iphone X")
                .setDiscount(.1)
                .setIsPrime(true)
                .setPaymentMethod("CC")
                .build();


//        soldItemsBuilder.setId(1);
//        soldItemsBuilder.setName("iphone X");
//        soldItemsBuilder.setDiscount(.1);
//        soldItemsBuilder.setQuantity(1);
//        soldItemsBuilder.setIsPrime(false);
//        soldItemsBuilder.setPaymentMethod("UPI");

//        SoldItem soldItem = new SoldItem(soldItemsBuilder);
    }
}
