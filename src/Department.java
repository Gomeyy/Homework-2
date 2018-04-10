/************************************
* CSCI 185: Computer Programming II
* Spring 2018 M08 
* HW2: Department class
* Ioav Livneh
* Advised by Prof. Wenjia Li
* March 13, 2018
************************************/
package res;
import res.Professor;
import res.Course;

public class Department {
	
	//instance variables
    private Professor chair;
    private Professor[] faculty;
    private Course[] courses;
    
    //Constructors
    public Department(Professor ch, Professor[] f, Course[] c) {
    	this.chair = ch;
    	this.faculty = new Professor[f.length];
        for (int i = 0; i < f.length; i++) {
            this.faculty[i] = new Professor(f[i]);
        }
    	this.courses = new Course[c.length];
    	for (int i = 0; i < c.length; i++) {
            this.courses[i] = new Course(c[i]);
        }
    }	
    
    //copy constructor
    public Department(Department aDepartment) {
    	this.chair = aDepartment.chair;
        this.faculty = aDepartment.faculty;
        this.courses = aDepartment.courses;
    }
    
    public Department() {
    }
    
   //setters and getters
    protected void setChair (Professor p){
    	this.chair = p;
    }
    
    public Professor getChair (){
    	return chair;
    }
    	
    public void setFaculty(Professor[] p) {
        this.faculty = new Professor[p.length];
        for (int i = 0; i < p.length; i++) {
            this.faculty[i] = new Professor(p[i]);
        }
    }
    
    public Professor[] getFaculty() {
    	Professor[] temp = new Professor[this.faculty.length];
    	for(int i = 0; i < this.faculty.length; i++) {
    		temp[i] = new Professor(this.faculty[i]);
    	}
    	return temp;
    }
    	
    public void setCourses(Course[] c) {
    	this.courses = new Course[c.length];
    	for (int i = 0; i < c.length; i++) {
    		this.courses[i] = new Course(c[i]);
    	}
    }
    
    public Course[] getCourses() {
    	Course[] temp = new Course[this.courses.length];
    	for(int i = 0; i < this.courses.length; i++) {
    		temp[i] = new Course(this.courses[i]);
    	}
    	return temp;
    }
    
    //toString method
    public String toString() {
        String s = "";
        s += "\n Chair: " + this.getChair();
        for (int i = 0; i < faculty.length; i++) {
            s += "\n Faculty " + (i + 1) + ":";
            s += faculty[i].toString();
        }
        for (int i = 0; i < courses.length; i++) {
            s += "\n Course " + (i + 1) + ":";
            s += courses[i].toString();
        }
        return s;
    }
    
    
}
