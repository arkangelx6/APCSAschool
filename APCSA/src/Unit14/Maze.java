package Unit14;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;

	public Maze()
	{


	}

	public Maze(int size, String line)
	{
		maze = new int[size][size];
		String[] lines = line.split(" ");
		//char[] m = line.toCharArray();
		
		int counter = 0;
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){
					maze[i][j] = Integer.parseInt(lines[counter]);
				//maze[i][j] =  Math.abs(Character.getNumericValue(m[counter]));
				counter++;
			}
			
			
		}
		
		//System.out.println(Arrays.toString(m));
		for(int[] x : maze){
			System.out.println(Arrays.toString(x));
		}

	}

	
	public boolean hasExitPath(int r, int c)
	{
		if(r == maze.length-1){
			return true;
		}
		//if(maze[r][c] == 1){
		else{	
			
			maze[r][c] = 3;
			
			
			
			if(r > 0){
			if(maze[r-1][c] == 1){
				
				
				return hasExitPath(r-1, c);
				
				
			}
			}
			if(r < maze.length){
				if(maze[r+1][c] == 1){
					
					
					
				return hasExitPath(r+1, c);
					
			}
			}
			
			
			if(c > 0){
				if(maze[r][c-1] == 1){
					
					
				return hasExitPath(r, c-1);
					
			}
			}
			
			if(c < maze.length){
				if(maze[r][c+1] == 1){
					
					
				return hasExitPath(r, c+1);
				
			}
			}
			
			
			
			
		}
		
		
		
		
		
		
		return false;
	}

	public String toString()
	{
		String output="";

	



		return output;
	}
}
