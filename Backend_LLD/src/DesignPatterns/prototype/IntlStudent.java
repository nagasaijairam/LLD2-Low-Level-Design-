package DesignPatterns.prototype;

public class IntlStudent extends Student {
    public int iq;
    public IntlStudent(IntlStudent student) {
        super(student);
        this.iq = student.iq;
    }

    public IntlStudent(){

    }

    @Override
    public Student clone() {
        return new IntlStudent(this);
    }
    @Override
    public String toString() {
        return  super.toString() + " iq: " + iq;
    }

}
