import java.io.File;
import java.io.FileReader;
import java.io.*;
import java.util.Scanner;


public class FileReader1{
    
        
    public static void main(String[] args) throws FileNotFoundException{  
      
          File[] files = {new File("/Users/user/Desktop/input345.txt"), 
                         
                          new File("/Users/user/Desktop/input2.txt")};
                          
           for (File file : files) {
             
                try {
                    Scanner scan = new Scanner(file);     
                         while(scan.hasNextLine()){
                       System.out.println(scan.nextLine());
                        
                    }
                    }catch(FileNotFoundException fnfe) {
                    System.out.println("No files found");
                    
                    }  
                
                 
          }
         
        }
    }
    

