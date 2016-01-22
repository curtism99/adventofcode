package advent14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Advent14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String filePath = new File("").getAbsolutePath();
		String line = null;
    	int lineNum = 0;
    	int[][] reindeerArr = new int[9][3];
    	String[] reindeerNames = new String[9];
    	String winningReindeer = "";

        try {
            BufferedReader reader = new BufferedReader(new FileReader("advent14input.txt"));
            while((line = reader.readLine()) != null) {
            	
            	String[] delims = line.split(" ");
            	String name = delims[0];
            	            	
            	int speed = Integer.parseInt(delims[3].toString());
            	int time = Integer.parseInt(delims[6].toString());
            	int rest = Integer.parseInt(delims[13].toString());
            	            	
            	reindeerArr[lineNum][0] = speed;
            	reindeerArr[lineNum][1] = time;
            	reindeerArr[lineNum][2] = rest;
            
            	reindeerNames[lineNum] = name;
            	lineNum = lineNum + 1;        
            }
        } catch (Exception err) {
            err.printStackTrace();
        }
		
    	int furthestDistance = 0;
        int realTime = 2503;
            	
        for(int i = 0; i < 9; i++) {
        	int speed = reindeerArr[i][0];
        	int time = reindeerArr[i][1];
        	int rest = reindeerArr[i][2];
        	int totalTime = time + rest;
        	double divResult = realTime / totalTime;
        	int numCycles = (int) divResult;
        	int thisDistance;
        	
        	int leftover = realTime - (totalTime * numCycles);
        	
        	if(leftover <= time) {
        		thisDistance = (leftover * speed) + ((numCycles * time) * speed);
        	} else {
        		thisDistance = (speed * time) * (numCycles + 1);
        	}
        	
        	if(thisDistance > furthestDistance) {
        		furthestDistance = thisDistance;
        		winningReindeer = reindeerNames[i];
        	}
        	
        }
    	
        System.out.println("The winning reindeer is " + winningReindeer + " and they traveled " + furthestDistance + "km");
        
	}

}
