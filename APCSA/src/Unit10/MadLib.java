package Unit10;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	
	public MadLib()
	{
			verbs = new ArrayList<String>();
			nouns = new ArrayList<String>();
			adjectives = new ArrayList<String>();
			
			loadNouns();
			loadVerbs();
			loadAdjectives();
	}
	String mad;
	public MadLib(String fileName)
	{
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
		//load stuff
		loadNouns();
		loadVerbs();
		loadAdjectives();
		
		//System.out.println(nouns.size());
		
		try{
			Scanner file = new Scanner(new File(fileName));
			mad = "";
			while(file.hasNext()){
				
				String x = file.next();
				if(x.equals("#")){
				
					mad = mad + getRandomNoun();
				}
				else if(x.equals("@")){
					
					mad = mad + getRandomVerb();
				}
				else if(x.equals("&")){
					
					mad = mad + getRandomAdjective();
				}
				
				else{
					
					mad = mad + x;
					
				}
				
				
				mad = mad + " ";
				
				
			}
		
		
		
		
		
	
		
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
		
			Scanner noun = new Scanner(new File("nouns.dat"));
			while(noun.hasNext()){
				nouns.add(noun.next());
			}
			
		
		}
		catch(Exception e)
		{
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
	
	
			Scanner verb = new Scanner(new File("verbs.dat"));
			while(verb.hasNext()){
				verbs.add(verb.next());
			}
			
		}
		catch(Exception e)
		{
		}
	}

	public void loadAdjectives()
	{
		try{
	
	
			Scanner adjective = new Scanner(new File("adjectives.dat"));
			while(adjective.hasNext()){
				adjectives.add(adjective.next());
			}
	
		}
		catch(Exception e)
		{
		}
	}

	public String getRandomVerb()
	{
		Random rand = new Random();
		
		return verbs.get(rand.nextInt(verbs.size()));
	}
	
	public String getRandomNoun()
	{
		Random rand = new Random();
		return nouns.get(rand.nextInt(nouns.size()));
	}
	
	public String getRandomAdjective()
	{
		
		Random rand = new Random();
		return adjectives.get(rand.nextInt(adjectives.size()));
	}		

	public String toString()
	{
		
	   return mad;
	}
}