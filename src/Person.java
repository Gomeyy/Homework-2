public class Person {

    // instance variables
    public String name;
    public int age;
    public String SSN;
    public boolean alive;

    //constructors
    public Person (Person another) {
        this.name= another.name;
        this.age= another.age;
        this.SSN= another.SSN;
        this.alive= another.alive;
    }

    public Person(String n, int a, String s, boolean life) {
        this.name= n;
        this.age= a;
        this.SSN= s;
        this.alive= life;
    }

    public Person() {
    }

    //get/set Name
    public void setName(String ano_n) {
        this.name= ano_n;
    }
    public String getName() {
        return this.name;
    }

    //get/set Age
    public void setAge(int ano_a) {
        this.age= ano_a;
    }
    public int getAge() {
        return this.age;
    }

    //get/set SSN
    public void setSSN(String ano_s) {
        this.SSN= ano_s;
    }
    public String getSSN() {
        return this.SSN;
    }

    //get/set Alive
    public void setAlive(boolean ano_life) {
        this.alive= ano_life;
    }
    public boolean getAlive() {
        return this.alive;
    }

    //toString
    public String toString() {
        String s = "\n";
        s+= "\tName: " + this.getName() + "\n";
        s+= "\tAge: " + this.getAge() + "\n";
        s+= "\tSSN: " + this.getSSN() + "\n";
        s+= "\tAlive: " + this.getAlive() + "\n";
        return s;
    }

}

