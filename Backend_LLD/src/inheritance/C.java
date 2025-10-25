package inheritance;

public class C extends B{
    public String name;
    int psp;
//    public C(){
//        System.out.println("Constructor of C");
//    }
    public C(String name){
        this.name=name;
        System.out.println("Constructor of C with String");
    }

    public C(int psp){
        this.psp = psp;
        System.out.println("Constructor of C with int");
    }

    public C(String name,int psp){
        this.name=name;
        this.psp=psp;
        System.out.println("Constructor of C with String and int");
    }
}
