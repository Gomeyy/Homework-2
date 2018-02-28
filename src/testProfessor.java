//This is how to setup the Professor class, every other class should just be a main package

package res;
import res.Course;

public class testProfessor extends main.Person {

    void setCoursename(Course c, String cN) {
        c.setCourse_name(cN);
    }
}
