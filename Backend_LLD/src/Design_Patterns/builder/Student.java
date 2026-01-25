package Design_Patterns.builder;

public class Student {
    int age;
    String name;
    String batch;
    int YOE;
    String email;
    String phone;
    String address;

    public static Builder getBuilder() {
        return new Builder();
    }

     Student(Builder builder){
//        if(builder.age<20) {
//            this.age = builder.age;
//            throw new RuntimeException( "age should be > 20");
//        }
//        if(builder.name==null){
//            throw new RuntimeException( "Please give a valid name");
//        }

        this.age = builder.age;
        this.name=builder.name;
        this.batch=builder.batch;
        this.YOE=builder.YOE;
        this.email=builder.email;
        this.phone=builder.phone;
        this.address=builder.address;

        System.out.println("All is well");

    }

//    package Design_Patterns.builder;

    public static class Builder {
        int age;
        String name;
        String batch;
        int YOE;
        String email;
        String phone;
        String address;

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public int getYOE() {
            return YOE;
        }

        public Builder setYOE(int YOE) {
            if (YOE<1){
                System.out.println("YOE is less than 1");
            }
            this.YOE = YOE;
            return this;

        }

        public String getEmail() {
            return email;
        }

        public Builder setEmail(String email) {
            if(!email.endsWith("@gmail.com")){
                System.out.println("Invalid email");
                throw  new IllegalArgumentException("Invalid email, please enter an email which ends with @gmail.com");
            }
            this.email = email;
            return this;

        }

        public String getPhone() {
            return phone;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Student build() {
            if(this.address == null){
                System.out.println("address is null");
                throw new IllegalArgumentException("Perminent address should not be null");
            }
            return new Student(this);
        }
    }
}

