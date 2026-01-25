package DesignPatterns.prototype;

public class Client {
    private static void FillRegistry(StudentRegistry studentRegistry){
        Student Jan26LldMrngProtoType = new Student();
        Jan26LldMrngProtoType.setBatch("Jan26LldMrng");
        Jan26LldMrngProtoType.setAvgBatchPsp(77.21);
        studentRegistry.register("Jan26LldMrng",Jan26LldMrngProtoType);


        Student Jan26EvnLldProtoType = new Student();
        Jan26EvnLldProtoType.setBatch("Jan26LldEven");
        Jan26LldMrngProtoType.setAvgBatchPsp(90.77);
        studentRegistry.register("Jan26LldEven",Jan26EvnLldProtoType);

        IntlStudent  Jan26LldMrngProtoTypeIntl = new IntlStudent();
        Jan26LldMrngProtoTypeIntl.setBatch("Jan26LldIntelMrng");
        Jan26LldMrngProtoTypeIntl.setAvgBatchPsp(77.21);
        Jan26LldMrngProtoTypeIntl.iq = 200;
        studentRegistry.register("Jan26LldIntelMrng", Jan26LldMrngProtoTypeIntl);
    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        FillRegistry(studentRegistry);
        System.out.println("Jairam's name is " );

        Student Jairam = studentRegistry.get("Jan26LldMrng").clone();
        Jairam.setName("Jairam");
        Jairam.setAge(26);
        Jairam.setPsp(90.77);


        Student Johnwick = studentRegistry.get("Jan26LldIntelMrng");
        Johnwick.setName("Johnwick");
        Johnwick.setAge(23);
        Johnwick.setPsp(90.77);

        System.out.println(Johnwick.toString());

    }
}
