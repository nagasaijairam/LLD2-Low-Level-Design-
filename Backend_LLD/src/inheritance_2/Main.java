package inheritance_2;

public class Main {
    public static void main(String[] args) {
//        A a = new b ();
//        a.university = "JNTUH"; throws error (a does not have attribute universityName)

        A a  = new B();
        a.name = "Jairam";
        a.age =  26;
//        a.universityName = "JNTUH";// This is not allowed, Compiler knows only left side not right so the university is not part of the leftside.
        // a does not have attribute universityName



    }
}
