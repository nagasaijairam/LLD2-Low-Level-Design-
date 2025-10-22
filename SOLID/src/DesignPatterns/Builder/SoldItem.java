package DesignPatterns.Builder;

public class SoldItem {
    private int id;
    private String name;
    private boolean isPrime;
    private int quantity;
    private String paymentMethod;
    private double discount;

    public static SoldItemsBuilder builder() {
        return new SoldItemsBuilder();
    }

    SoldItem(SoldItemsBuilder soldItemsBuilder) {
        //Validations can be done from here also
        this.id = soldItemsBuilder.getId();
        this.name = soldItemsBuilder.getName();
        this.isPrime = soldItemsBuilder.getIsPrime();
        this.quantity = soldItemsBuilder.getQuantity();
        this.paymentMethod = soldItemsBuilder.getPaymentMethod();
        this.discount = soldItemsBuilder.getDiscount();
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setIsPrime(boolean isPrime) {
        this.isPrime = isPrime;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }


}
