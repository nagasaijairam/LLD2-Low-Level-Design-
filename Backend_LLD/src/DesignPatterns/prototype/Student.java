package DesignPatterns.prototype;

public class Student implements Prototype<Student> {
    private String name;
    private int age;
    private String batch;
    private double avgBatchPsp;
    private double psp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public double getPsp() {
        return psp;
    }
//
    public void setPsp(double psp) {
        this.psp = psp;
    }

    Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.psp = student.psp;
        this.batch = student.batch;
        this.avgBatchPsp = student.avgBatchPsp;
    }

    public Student(){

    }

    @Override
    public Student clone() {
        return new Student(this);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", batch='" + batch + '\'' +
                ", avgBatchPsp=" + avgBatchPsp +
                ", psp=" + psp +
                '}';
    }
}
