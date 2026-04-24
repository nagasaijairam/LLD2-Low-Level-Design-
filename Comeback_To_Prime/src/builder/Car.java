package builder;

public class Car {
    private int wheels;
    private String engin;

    private Car(int wheels, String engin){
        this.wheels = wheels;
        this.engin = engin;
        System.out.println("Wheels: " + this.wheels + " engin: " + this.engin);
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private int wheels;
        private String engin;

        public Builder wheels(int wheels){
            if (wheels < 4){
                    throw new IllegalArgumentException("Wheels must be greater than or equal to 3");
            }
            this.wheels = wheels;
            return this;
        }

        public Builder engin(String engin){

            this.engin = engin;
            return this;
        }

        public Car build(){
            System.out.println("Builder class is created --> and this builder is creating the Car class");
            return new Car(wheels, engin);
        }
    }
}
