public class MarriedPerson extends Person { 
private int children;

public MarriedPerson(String lastname, String firstname, int age, float 
salary, int sex, int children) { 
 super(lastname, firstname, age, true, salary ,sex); 
 this.children = children; 
} 
public int getNoOfChildren() { return children; }
public void printInfo(){
    super.printInfo();
    if (getNoOfChildren()> 0)
        System.out.print("married with "+getNoOfChildren());
        else System.out.println(" children.");
       // return"";
    }
    public void setMarried(boolean married) {
        super.setMarried(true);
    }
    public void setSalary(MarriedPerson spouse){
     if(spouse.getSex()  != getSex()){
      setSalary(getSalary() + spouse.getSalary());
    }else setSalary(getSalary());
    }
}