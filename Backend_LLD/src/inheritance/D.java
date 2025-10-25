package inheritance;

public class D extends C{
    String address;

    public D(){
//        System.out.println("Constructor of D");
        super("Jiaram",99);

        /*Note:
         The super keyword should be used first because we cant initialize the variables of
        the child class until the parent class variables got initilised (and also throws error)*/

        System.out.println("Constructor of D");

    }
}
