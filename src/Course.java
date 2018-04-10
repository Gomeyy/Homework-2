package res;
import main.College_Student;
import res.Professor;

public class Course {
    //instance variables
    Professor instructor;
    private String course_name;
    public College_Student[] students;


    //constructors
    public Course(College_Student[] s, String cN, Professor p) {
        this.instructor = p;
        this.course_name = cN;
        this.students = new College_Student[s.length];
        for (int i = 0; i < s.length; i++) {
            this.students[i] = new College_Student(s[i]);
        }
    }

    public Course(res.Course c) {
        this.instructor = c.instructor;
        this.course_name = c.course_name;
        this.students = c.students;
    }

    //getters & setters

    public Professor getInstructor() {
        return instructor;
    }
    public void setInstructor(Professor instructor) {
        this.instructor = instructor;
    }
    public String getCourse_name() {
        return course_name;
    }
    protected void setCourse_name(String course_name) {
        this.course_name = course_name;
    }
    public College_Student[] getStudents() {
        College_Student[] temp = new College_Student[this.students.length];
        for (int i = 0; i < this.students.length; i++) {
            temp[i] = new College_Student(this.students[i]);
        }
        return temp;
    }
    protected void setStudents(College_Student[] s) {
        this.students = new College_Student[s.length];
        for (int i = 0; i < s.length; i++) {
            this.students[i] = new College_Student(s[i]);
        }
    }

    //toString method
    public String toString() {
        String s = "";
        s += "\n Course: " + course_name;
        for (int i = 0; i < students.length; i++) {
            s += "\n Student " + (i + 1) + ":";
            s += students[i].toString();
        }
        return s;
    }
}
