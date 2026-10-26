import java.util.ArrayList;

public class Person { 
private String lastname; 
private String firstname; 
private int age; 
public boolean married; 
public float salary; 
public static final int MALE = 0; 
public static final int FEMALE = 1; 
public int sex; 

public Person (String lastname, String firstname, int age, boolean married, 
float salary, int sex) { 
 this.lastname = new String(lastname); 
 this.firstname = new String(firstname); 
 this.age = age; 
 this.married = married; 
 this.salary = salary; 
 this.sex = sex; 
} 
public String getFirstname() {
        return firstname;
    }
public void setFirstname( String firstname) {
        this.firstname = firstname;
    }
public String getLastname() {
        return lastname;
    }
public void setLasttname( String lastname) {
        this.lastname = lastname;
    } 
public int getAge() {
        return age;
    }     
public void setAge(int age) {
        this.age = age;
    } 
public boolean getMarried() {
        return married;
    } 
public void setMarried(boolean married) {
    this.married = married;
    }
public float getSalary() {
         return salary;
    }  
public void setSalary(float salary) {
    this.salary = salary;
    }
public int getSex() {
        return sex;
    }   
public void setSex(int sex) {
        this.sex = sex;
    }   
  
public void printInfo() {
    
    System.out.print("\n " +getFirstName()+ " " +getLastName()+" " +getSex()+ " " + "is "
    +getAge()+ " years old, earns " +getSalary()
    + "Euros salary and is ");
    
    if (isMarried() == false )
    System.out.print("not");
    System.out.print("married");
    //return " " ;
}

public String getLastName() { return lastname; } 
public String getFirstName() { return firstname; } 
public boolean isMarried() { return married; } 
}
