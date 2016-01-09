package advent5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class advent5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String filePath = new File("").getAbsolutePath();

		String line = null;
        char a = 'a';
        int inta = (int) a;
        char e = 'e';
        int inte = (int) e;
        char i = 'i';
        int inti = (int) i;
        char o = 'o';
        int into = (int) o;
        char u = 'u';
        int intu = (int) u;
        
        char b = 'b';
        int intb = (int) b;
        char c = 'c';
        int intc = (int) c;
        char d = 'd';
        int intd = (int) d;
        char p = 'p';
        int intp = (int) p;
        char q = 'q';
        int intq = (int) q;
        char x = 'x';
        int intx = (int) x;
        char y = 'y';
        int inty = (int) y;
        
        String ab = "ab";
        String cd = "cd";
        String pq = "pq";
        String xy = "xy";
        
        //ab, cd, pq, xy
        
        
		char iskPrev = 0;

		int cont = 0;
		
		int niceCount = 0;
		
		int vowelCount = 0;
		
		int flag = 0;

		
		try {
	            BufferedReader reader = new BufferedReader(new FileReader("C:/adventinput/advent5.txt"));
	            while((line = reader.readLine()) != null){
			 		for (int j = 0; j < line.length(); j++) {
	            		char isk = line.charAt(j);
	            		
	            		if(isk == a || isk == e || isk == i || isk == o || isk == u){
	            			vowelCount++;
	            		}
	            		if(j <= 0) {
	            		} else {
		            		iskPrev = line.charAt(j-1);
	            		}
	            		if(isk == iskPrev) {
	            			cont++;
	            		}
	            		
	            		String temp1 = Character.toString(iskPrev);
	            		String temp2 = Character.toString(isk);
	            		String together = temp1 + temp2;
	            		
	            		
	            		if((together).equals(ab) || (together).equals(cd) || (together).equals(pq) || (together).equals(xy)){
	            			flag = 1;
	            		}
	            	}
            		if(cont >= 1 && vowelCount >= 3 && flag == 0) {
            			niceCount++;
	            	}
            		iskPrev = 0;

            		cont = 0;
            		           		
            		vowelCount = 0;
            		
            		flag = 0;


			 		
	            }

	        } catch (Exception err) {
	        	err.printStackTrace();
	        }
			
    	System.out.println(niceCount);

	        
		
	}
	
	

}
