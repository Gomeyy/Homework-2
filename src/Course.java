package Restricted;
import main.College_Student;

public class Course {
    //instance variables
    //Professor instructor;
    private String course_name;
    public College_Student[] students;


    //constructors
    public Course(College_Student[] s, String cN) {
        //this.instructor = p;
        this.course_name = cN;
        this.students = new College_Student[s.length];
        for (int i = 0; i < s.length; i++) {
            this.students[i] = new College_Student(s[i]);
        }
    }

    public Course() {
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

    @Override
    public String toString() {
        String s = "Course:";
        s += "\n course_name = " + course_name;
        for (int i = 0; i < students.length; i++) {
            s += "\n Student " + (i + 1) + ":";
            s += students[i].toString();
        }
        return s;
    }
}
