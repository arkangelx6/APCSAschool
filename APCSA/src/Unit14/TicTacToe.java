package Unit14;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		
		mat = new char[3][3];
	}

	public TicTacToe(String game)
	{
	
		char[] g = game.toCharArray();
		System.out.println(Arrays.toString(g));
		int counter = 0;
		for(int i = 0; i< 3; i++){
			for(int j = 0; j< 3; j++){
				mat[i][j] = g[i+counter];
				
			}
			counter += 3;
		}
		

	}

	public String getWinner()
	{

		for(int i = 0; i < 3; i++){
			if(mat[i][0] == 'X' && mat[i][1] == 'X' && mat[i][2] == 'X'){
				return "X wins horizontally";
			}
			if(mat[i][0] == 'O' && mat[i][1] == 'O' && mat[i][2] == 'O'){
				return "O wins horizontally";
			}
		}

			
		for(int j = 0; j < 3; j++){
			//if(mat[j])
			
			
			
		}
			





		return "No winner";
	}

	public String toString()
	{
		String output="";

		for(char[] x : mat){
			System.out.println(Arrays.toString(x));
		}




		return output+"\n\n";
	}
}
