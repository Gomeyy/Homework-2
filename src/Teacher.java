/************************************
* CSCI 185: Computer Programming II
* Spring 2018 M08 
* HW2: Teacher derived class
* Ioav Livneh, Matthew Gomes
* Advised by Prof. Wenjia Li
* March 13, 2018
************************************/
package res;

public class Teacher extends main.Person {

	// instance variables
	private String id;
	private int salary;
	private int num_yr_prof;

	//constructors
	public Teacher(String n, int a, String s, boolean life, String id, int sal, int yr) {
		super(n, a, s, life);
		this.id= id;
		this.salary= sal;
		this.num_yr_prof= yr;
	}
	
	public Teacher(Teacher aTeacher) {
		super(aTeacher.getName(), aTeacher.getAge(), aTeacher.getSSN(), aTeacher.getAlive());
	}
	
	public Teacher() {
	}
	
	//set/get ID
	public void setID(String ano_id) {
		this.id= ano_id;
	}
	public String getID() {
		return this.id;
	}
	
	//set/get Salary
	public void setSalary(int ano_s) {
		this.salary=ano_s;
	}
	public int getSalary() {
		return this.salary;
	}
	
	//set/get Number of years teaching
	public void setYrs(int ano_yr) {
		this.num_yr_prof=ano_yr;
	}
	public int getYrs() {
		return this.num_yr_prof;
	}
	
	//to String
	public String toString() {
		String s = "\n";
		s+= super.toString() + "\n";
		s+= "\tID: " + this.getID() + "\n";
		s+= "\tSalary: " + this.getSalary() + "\n";
		s+= "\tNumber of years teaching: " + this.getYrs() + "\n\n";
		return s;
	}
	
}
