package builder;

public class CarClent {
    public static void main(String[] args) {
        Car car = Car.builder().wheels(3).engin("V8").build();
    }
}
