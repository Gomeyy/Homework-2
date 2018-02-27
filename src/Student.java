package main;

public class Student extends main.Person {
    //instance variables
    private String stu_id;
    private double gpa;

    //constructors
    public Student(String n, int a, String s, boolean life, String sID, double gpa) {
        super(n, a, s, life);
        this.stu_id = sID;
        this.gpa = gpa;
    }

    public Student() {
    }

    //getters & setters
    public String getStu_id() {return stu_id;}
    public void setStu_id(String stu_id) {this.stu_id = stu_id;}

    public double getGpa() {return gpa;}
    public void setGpa(double gpa) {this.gpa = gpa;}

    @Override
    public String toString() {
        String s = super.toString();
        s += "\tstu_id = " + stu_id;
        s += "\n\tgpa = " + gpa;
        return s;
    }
}
