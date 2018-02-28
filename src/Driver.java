import res.Course;
import main.College_Student;

public class Driver {

    public static void main(String[] args) {
        //Define 4 students
        College_Student s1 = new College_Student(
                "George", 19, "928937803", true,
                "9820198", 3.8, "Computer Engineering", "A-");
        College_Student s2 = new College_Student(
                "Joseph", 21, "189945729", true,
                "5879018", 3.4, "Electrical Engineering", "B+");
        College_Student s3 = new College_Student(
                "Destiny", 20, "6859283749", true,
                "6879109", 2.7, "Undecided", "C+");
        College_Student s4 = new College_Student(
                "Brittney", 22, "192803945", true,
                "69092883", 3.5, "Undecided", "B-");

        //Define courses
        Course c1 = new Course(new College_Student[]{s1, s2}, "Computer Programming");
        Course c2 = new Course(new College_Student[]{s3, s4}, "Physics 2");

        //Call toString of both course 1 & course 2
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }

}
