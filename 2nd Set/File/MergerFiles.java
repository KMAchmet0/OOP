import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;
 
public class MergerFiles {
 
    	   public static void main(String[] args) throws FileNotFoundException{
		String sourceFile1Path = "/Users/user/Desktop/input1.txt";
		String sourceFile2Path = "/Users/user/Desktop/input2.txt";
 
		String mergedFilePath = "/Users/user/Desktop/merged.txt";
 
		File[] files = new File[2];
		files[0] = new File(sourceFile1Path);
		files[1] = new File(sourceFile2Path);
 
		File mergedFile = new File(mergedFilePath);
 
		mergeFiles(files, mergedFile);
	   }
 
	         public static void mergeFiles(File[] files, File mergedFile) {
 
		 FileWriter fstream = null;
		 BufferedWriter out = null;
		 try {
			fstream = new FileWriter(mergedFile, true);
			 out = new BufferedWriter(fstream);
		   } catch (IOException e1) {
			e1.printStackTrace();
		  }
 
		  for (File f : files) {
			System.out.println("merging: " + f.getName());
			FileInputStream fis;
			try {
				fis = new FileInputStream(f);
				BufferedReader in = new BufferedReader(new InputStreamReader(fis));
 
				String aLine;
				while ((aLine = in.readLine()) != null) {
					out.write(aLine);
					out.newLine();
				}
 
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
 
		
			
		
	             try
			{
			    
			 
			   out.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
 
	   }
}
