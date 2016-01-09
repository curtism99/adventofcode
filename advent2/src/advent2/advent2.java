package advent2;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class advent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        String line = null;
	        String filePath = new File("").getAbsolutePath();
	        int arrayInput[][];          
	        arrayInput = new int[1000][3];
	        int lnnbr = 0;
	        try {
	            BufferedReader reader = new BufferedReader(new FileReader("advent2input.txt"));
	            while((line = reader.readLine()) != null){
	            	String str = line;
         		
	            	String[] ss = str.split("x");
	
	            	arrayInput[lnnbr][0] = Integer.parseInt(ss[0]);
	            	arrayInput[lnnbr][1] = Integer.parseInt(ss[1]);
	            	arrayInput[lnnbr][2] = Integer.parseInt(ss[2]);
	            	lnnbr++;
	            	
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        	        
	       int total = 0;
	        
	        for(int i = 0; i < 1000; i++) {
	        	int l = arrayInput[i][0];
	        	int w = arrayInput[i][1];
	        	int h = arrayInput[i][2];
	        	
	        	int sub = 2*l*w + 2*w*h + 2*h*l;
	        	
	        	int jk[];
	        	jk = new int[3];
	        	jk[0] = l*w;
	        	jk[1] = w*h;
	        	jk[2] = h*l;
	        	Arrays.sort(jk);
	        	sub = sub + jk[0];
	        	
	        	total = total + sub;
	        }
	        
	        
	        System.out.println(total);
	       		
		
	}

}
