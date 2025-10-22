package DesignPatterns.Builder;

public class SoldItemsBuilder {
    private int id;
    private String name;
    private boolean isPrime = false;
    private int quantity;
    private String paymentMethod;
    private double discount;

    public SoldItem build() {
        return new SoldItem(this);
    }
    //Setters
    public SoldItemsBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public SoldItemsBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public SoldItemsBuilder setIsPrime(boolean isPrime) {
        this.isPrime = isPrime;
        return this;
    }

    public SoldItemsBuilder setQuantity(int quantity) {
        if(quantity<5){
            throw new IllegalArgumentException("Quantity must be greater than 5");
        }
        this.quantity = quantity;
        return this;
    }

    public SoldItemsBuilder setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    public SoldItemsBuilder setDiscount(double discount) {
        if(discount>1){
            throw new IllegalArgumentException("Discount must not be greater than 1");
        }
        this.discount = discount;
        return this;
    }

    //Gettters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public boolean getIsPrime() {
        return isPrime;
    }
    public int getQuantity() {
        return quantity;
    }
    public String getPaymentMethod() {
        return paymentMethod;
    }
    public double getDiscount() {
        return discount;
    }


}
