package Day12;

import java.io.FileWriter;
import java.io.IOException;


public class CreaFileWriteName {
	
	public static void main(String[] args) {

		String filename="name.txt";
		FileWriter fw = null;
		
		
		try {
			 fw=new FileWriter(filename);
			fw.write("Purushothaman S");

		}catch (Exception e) {
			
			e.getStackTrace();
		}finally{
			
			if(fw!=null) {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
	}
