import Restricted.Course;
import main.College_Student;

public class Driver {

    public static void main(String[] args) {
        College_Student[] cS1 = new College_Student[]{
                new College_Student("bobo",
                        14,
                        "9019901",
                        true,
                        "010192",
                        4.0,
                        "math",
                        "A+"),
                new College_Student("bobo",
                        14,
                        "9019901",
                        true,
                        "010192",
                        4.0,
                        "math",
                        "A+"),
                new College_Student("bobo",
                        14,
                        "9019901",
                        true,
                        "010192",
                        4.0,
                        "math",
                        "A+"),
                new College_Student("bobo",
                        14,
                        "9019901",
                        true,
                        "010192",
                        4.0,
                        "math",
                        "A+")
                };

        Course c1 = new Course(cS1, "Math");
        System.out.println(c1.getCourse_name());
    }

    }
