package OtherWriteFile;

import java.io.*;

public class ReadWriteFile {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File originFile = new File("C:\\DBFile.txt");
		File destFile = new  File("C:\\Target.txt");
		PrintWriter writer=null;
		int i = 0;
		FileReader fr;	
		try {
			fr = new FileReader(originFile);
		} catch (FileNotFoundException e) {
			System.out.println("Source file not found");
			return;
		}
		BufferedReader reader = new	BufferedReader(fr);
		try {
			writer = new PrintWriter(new FileWriter(destFile));
		} catch (IOException e1) {
			System.out.println("Target file could not be created");
		}
		 String line = null;
		 try {
			while((line = reader.readLine()) != null) {
				 i++;
				 writer.println(line.toUpperCase()); //Writes with uppercase to dest file
			 }
		} catch (IOException e) {
			System.out.println("No more lines");
		} finally {
		 	try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("End.");
	}
}
