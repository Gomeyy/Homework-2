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

    public Student(Student s) {
        super(s.getName(), s.getAge(), s.getSSN(), s.getAlive());
        this.stu_id = s.stu_id;
        this.gpa = s.gpa;
    }

    //getters & setters
    public String getStu_id() {return stu_id;}
    public void setStu_id(String stu_id) {this.stu_id = stu_id;}

    public double getGpa() {return gpa;}
    public void setGpa(double gpa) {this.gpa = gpa;}

    //toString to override Person
    @Override
    public String toString() {
        String s = super.toString();
        s += "\tStudent ID = " + stu_id;
        s += "\n\tGPA = " + gpa;
        return s;
    }
}
