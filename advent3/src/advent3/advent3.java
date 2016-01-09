package advent3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class advent3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String filePath = new File("").getAbsolutePath();

		int c;
		char north = '^';
        int  n = (int) north;
        char south = 'v';
        int s = (int) south;
        char east = '>';
        int e = (int) east;
        char west = '<';
        int w = (int) west;
        
        int[][] position = new int[5001][5001];
        int multipleVisits = 0;
        
        for (int i = 0; i < 5001; i++)
       		{
        		for (int j = 0; j < 5001; j++)
        			{
        				position[i][j] = 0;
        			}
       		}
        
        int x = 2500;
        int y = 2500;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("advent3input.txt"));
            while((c = reader.read()) != -1) {
            	
            	if(c == n) {
            		y++;
            		position[x][y]++;
            	}else if (c == s){
            		y--;
            		position[x][y]++;
            	} else if (c == e) {
            		x++;
            		position[x][y]++;
            	} else if (c == w) {
            		x--;
            		position[x][y]++;
            	} else {
            		System.out.println("Direction not found...");
            	};
            
            }
            	

        } catch (Exception err) {
            err.printStackTrace();
        }
        
        for (int i = 0; i < 5001; i++)
        {
           for (int j = 0; j < 5001; j++)
           {
        	   if(position[i][j] > 0) {
        		   multipleVisits++;
        	   }
           }
        }
     
        System.out.println(multipleVisits);
    }

}
