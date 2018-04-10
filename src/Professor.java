/************************************
* CSCI 185: Computer Programming II
* Spring 2018 M08 
* HW2: Professor derived class
* Ioav Livneh
* Advised by Prof. Wenjia Li
* March 13, 2018
************************************/
package res;
import res.Course;
import res.Department;
import main.College_Student;

public class Professor extends res.Teacher {

	// instance variables
	private String specialty;
	private String research_area;
	private String rank;
	private boolean tenured;

	//constructors
	public Professor(String n, int a, String s, boolean life, String id, int sal, int yr, String spe, String res, String ran, boolean ten) {
		super(n, a, s, life, id, sal, yr);
		this.specialty= spe;
		this.research_area = res;
		this.rank= ran;   
		this.tenured= ten;
	}
	
	public Professor(Professor aProfessor) {
		super(aProfessor.getName(), aProfessor.getAge(), aProfessor.getSSN(), aProfessor.getAlive(), aProfessor.getID(), aProfessor.getSalary(), aProfessor.getYrs());
	}
	
	public Professor() {
	}
	
	//set/get Specialty
	public void setSpecialty(String ano_spe) {
		this.specialty= ano_spe;
	}
	public String getSpecialty() {
		return this.specialty;
	}
	
	//set/get Research area
	public void setResearch(String ano_res) {
		this.research_area= ano_res;
	}
	public String getResearch() {
		return this.research_area;
	}
	
	//set/get Rank
	public void setRank(String ano_ran) {
		this.rank=ano_ran;
	}
	public String getRank() {
		return this.rank;
	}
	
	//set/get Tenured
	public void setTenured(boolean ano_ten) {
		this.tenured = ano_ten;
	}
	public boolean getTenured() {
		return this.tenured;
	}

	//Department Getters/Setters
	public void setChair(Department d, Professor p) {d.setChair(p);}
	public Professor getChair(Department d) {return d.getChair();}
	public void setFaculty(Department d, Professor[] p) {d.setFaculty(p);}
	public Professor[] getFaculty(Department d) {return d.getFaculty();}
	public void setCourses(Department d, Course[] c) {d.setCourses(c);}
	public Course[] getCourses(Department d) {return d.getCourses();}

	//Course Getter/Setter
	public void setInstructor(Course c, Professor p) {c.setInstructor(p);}
	public Professor getInstructor(Course c) {return c.getInstructor();}
	public void setCourseName(Course c, String s) {c.setCourse_name(s);}
	public String getCourseName(Course c) {return c.getCourse_name();}
	public void setStudents(Course c, College_Student[] s) {c.setStudents(s);}
	public College_Student[] getStudents(Course c) {return c.getStudents();}
	
	//to String
	public String toString() {
		String s = "";
		s+= super.toString() + "\n";
		s+= "\tSpecialty: " + this.getSpecialty() + "\n";
		s+= "\tResearch area: " + this.getResearch() + "\n";
		s+= "\tRank: " + this.getRank() + "\n";
		s+= "\tTenured: " + this.getTenured() + "\n\n";
		return s;
	}
	
}
