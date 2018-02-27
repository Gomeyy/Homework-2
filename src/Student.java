public class Student extends Person {
    //instance variables
    String stu_id;
    double gpa;

    //constructors
    public Student(String n, int a, String s, boolean life, String stu_id, double gpa) {
        super(n, a, s, life);
        this.stu_id = stu_id;
        this.gpa = gpa;
    }

    public Student() {
    }

    //getters & setters
    public String getStu_id() {return stu_id;}
    public void setStu_id(String stu_id) {this.stu_id = stu_id;}

    public double getGpa() {return gpa;}
    public void setGpa(double gpa) {this.gpa = gpa;}

    //To string
    @Override
    public String toString() {
        return super.toString() + "\nStudent:" + "\n stu_id = " + stu_id + "\n gpa = " + gpa;
    }
}
