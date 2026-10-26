import java.io.*;

public class File{
    public static void main(String [] args) {
        try{
            FileInputStream fil = new FileInputStream("/Users/user/Desktop/input1.txt");
            FileInputStream fil1 = new FileInputStream("/Users/user/Desktop/input2.txt");
        }catch (FileNotFoundException e) {}
    }
}
        
        