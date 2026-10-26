import java.util.Scanner;
public class SetExercise2{
public static void main(String args[]) {
      int num1=5;
      int num2=3;
      int result;
      
      
      Scanner scan = new Scanner(System.in);
 
      System.out.println (" Give two values ");
      try {
          int m = Integer.parseInt(scan.next());
          int n = Integer.parseInt(scan.next());

          
          
          System.out.println(m);
          System.out.println(n);
          
          result=((m-n)*5)/(n-3*m);  
          System.out.println("The equation's result is " +result );
        } catch (ArithmeticException e) {
            System.out.println("Divided by zero ");
            scan.close();
        } catch(NumberFormatException nfe){
            System.out.println( "Invalid Format");
            
            
        }
    }  
}
      
      
      
