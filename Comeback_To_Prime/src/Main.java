//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student jairam  = new Student();
        jairam.name = "Jairam";
        jairam.age = 26;
        jairam.rollNo = 21;
        jairam.display();

        Student johnwick = new Student();
        johnwick.name = "Johnwick";
        johnwick.age = 27;
        johnwick.rollNo = 77;
        johnwick.display();
    }
}