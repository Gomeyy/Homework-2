package main;
import res.Course;
import res.Department;
import res.Professor;

public class College_Student extends main.Student {
    //instance variables
    private String major;
    private String grade;

    //constructors
    public College_Student(String n, int a, String s, boolean life, String sID, double gpa, String m, String g) {
        super(n, a, s, life, sID, gpa);
        this.major = m;
        this.grade = g;
    }
    //Copy Constructor
    public College_Student(College_Student cS) {
        super(cS.getName(), cS.getAge(), cS.getSSN(), cS.getAlive(), cS.getStu_id(), cS.getGpa());
        this.major = cS.major;
        this.grade = cS.grade;
    }
    //Set & Getters
    public String getMajor() {return major;}
    public void setMajor(String major) {this.major = major;}

    public String getGrade() {return grade;}
    public void setGrade(String grade) {this.grade = grade;}

    //Allow Student to use Getters of Department and Course
    public String getCourseName(Course c) {return c.getCourse_name();}
    public College_Student[] getStudents(Course c) {return c.getStudents();}
    public Professor[] getFaculty(Department d) {return d.getFaculty();}
    public Professor getChair(Department d) {return d.getChair();}
    public Course[] getCourses(Department d) {return d.getCourses();}

    //toString to override Students
    @Override
    public String toString() {
        String s = super.toString();
        s += "\n\tMajor = " + major;
        s += "\n\tGrade = " + grade;
        return s;
    }
}
