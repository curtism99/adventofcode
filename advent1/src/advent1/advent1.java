package advent1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class advent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String line = null;
        String filePath = new File("").getAbsolutePath();
		int c;
		char up = '(';
        int  i = (int) up;
        char down = ')';
        int j = (int) down;
        
        int level = 0;
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader("advent1input.txt"));
            while((c = reader.read()) != -1) {
            	  char isk = (char) c;
            	  // Do something with your character
            	  
            	  if(isk == i) {
            		  level++;
            	  } else {
            		  level--;
            	  }
            	  
            	}

        } catch (Exception e) {
            e.printStackTrace();
        }
		
        System.out.println(level);
        
	}

}
