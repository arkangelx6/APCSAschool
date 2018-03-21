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
		mat = new char[3][3];
		char[] g = game.toCharArray();
	//	System.out.println(Arrays.toString(g));
		int counter = 0;
		for(int i = 0; i< 3; i++){
			
				mat[0][i] = g[i];
				mat[1][i] = g[i+3];
				mat[2][i] = g[i+3+3];
				//System.out.println(mat[i][j]);
		
			
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
			if(mat[0][j] == 'X' && mat[1][j] == 'X' && mat[2][j] == 'X'){
				return "X wins vertically";
			}
			if(mat[0][j] == 'O' && mat[1][j] == 'O' && mat[2][j] == 'O'){
				return "O wins vertically";
			}
			
			
		}
			
		if(mat[0][0] == 'X' && mat[1][1] == 'X' && mat[2][2] == 'X'){
			return "X wins diagonally";
		}
		if(mat[0][0] == 'O' && mat[1][1] == 'O' && mat[2][2] == 'O'){
			return "O wins diagonally";
		}
		if(mat[0][2] == 'X' && mat[1][1] == 'X' && mat[2][0] == 'X'){
			return "X wins diagonally";
		}
		if(mat[0][2] == 'O' && mat[1][1] == 'O' && mat[2][0] == 'O'){
			return "O wins diagonally";
		}




		return "No winner";
	}

	public String toString()
	{
		String output="";

		for(char[] x : mat){
			System.out.println(Arrays.toString(x));
		}

		output = getWinner();


		return output+"\n\n";
	}
}
