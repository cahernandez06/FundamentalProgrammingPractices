package OtherReadFile;

import java.io.*;

public class ReadFile {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\DBFile.txt");
		int i = 0;
		FileReader fr;
		try {
			fr = new FileReader(f);
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			return;
		}
		BufferedReader reader = new	BufferedReader(fr);
		 String line = null;
		 try {
			while((line = reader.readLine()) != null) {
				 i++;
			 	System.out.printf("Line %d: %s\n",i,line);
			 }
		} catch (IOException e) {
			System.out.println("No more lines");
		} finally {
		 	try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
