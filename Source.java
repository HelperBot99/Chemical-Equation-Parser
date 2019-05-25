import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



class Storage
{
	int firstValue;
	int secondValue;
	Scanner key = new Scanner(System.in);
	
	String file_name = "File";
	
	
	
	
}



//Inheritance
class storage_functions extends Storage
{
	public boolean readFile(String file)
	{
		Scanner x = null;
		Scanner z = null;
		try
		{
			x = new Scanner(new File(file));
			z = new Scanner(new File(file));
				
		}catch(Exception e)
		{
			System.out.println("Could not find file");
		}
		
		int i = 0;
		
		while(x.hasNext())
		{
			String a = x.next();
			//System.out.println(a);
			i++;	
		}
		
		String[] storage = new String[i];
		
		int limit = 0;
		while(z.hasNext())
		{
			String a = z.next();
			storage[limit] = a;
			limit++;
		}
		
		for(int num = 0; num < storage.length; num++)
		{
			System.out.print(storage[num] + " ");
			if(storage[num].equals("Brian"))
			{
				return true;
			}
			
			
			
		}
		return false;
		
		
		
	}
		
	public void writeFile(String s, String file)
	{
		Formatter key = null;
		try
		{
			key = new Formatter("File");
		}catch(Exception e)
		{
			System.out.println("Error");
		}
		
		key.format("%s", s);
		key.close();
		
	}


}


public class Source {

	int global = 0;
	String name = "Chemistry Calc";

	
	public boolean rollcall()
	{
		storage_functions key = new storage_functions();
		//key.readFile(key.file_name);
		boolean VR = key.readFile(key.file_name);
		return VR;
	}
	
	public static void main(String[] args)
	{
		
		int s = seperator("O1H1");
		System.out.println(s);
		
		
	}
	
	

		
	
	

	
	
	static int seperator(String phrase)
	{
		String[] storage = new String[2];
		Character[] c;

		int[] vault;
		int counter = 0;
		int z = 0;
		//Length of storage
		for(int i = 0; i < phrase.length(); i++)
		{
			if(Character.isUpperCase(phrase.charAt(i)))
			{
				counter = counter + 1;
			}else if(i == phrase.length()- 1)
			{
				if(Character.isDigit(phrase.charAt(i)))
				{
					counter = counter + 1;
				}
				if(Character.isLowerCase(phrase.charAt(i)))
				{
					counter = counter + 1;
				}
			}
		}
		c = new Character[counter];
		vault = new int[counter];
		for(int i = 0; i < phrase.length(); i++)
		{
			loop:
			if(Character.isUpperCase(phrase.charAt(i)))
			{	
				boolean play = true;
				while(play == true)
				{
					c[z] = phrase.charAt(i);
					vault[z] = i;
					z++;
					break loop;
				}
			}else if(i == phrase.length()-1)
			{
				if(Character.isDigit(phrase.charAt(i)))
				{
					c[z] = phrase.charAt(i);
					vault[z] = i;
					//System.out.println(x);				
				}
				if(Character.isLowerCase(phrase.charAt(i)))
				{
					c[z] = phrase.charAt(i);
					vault[z] = i;
				}
			}

		}
		
		
		int v_count = 0;
		int string_count = 0;
		int placeHolder = 0;
	
		String[] parser = new String[vault.length];
		int v_count2 = 0;
		int placeHolder2 = 0;
		int pCounter = 0;
		
			for(int i = 0; i < vault.length; i++)
			{
				v_count2++;				
				if(v_count2 > vault.length-1)
				{
					placeHolder2 = v_count2;
					v_count2 =  v_count2 - 1;
					String seperate = phrase.substring(vault[i-1], phrase.length());
					//System.out.println(seperate);
					boolean play = true;
					start:
					while(play == true)
					{	
						if((pCounter < vault.length-1))
						{	
							parser[pCounter] = seperate;
							//System.out.println(parser[pCounter]);
							pCounter++;
							//System.out.println(pCounter);
							break start;
						}
					}
				}else if(!(vault[v_count2] == phrase.length()-1))
				{
					String seperate = phrase.substring(vault[i], vault[v_count2]);
					//System.out.println(seperate);
					boolean play = true;
					second:
					while(play == true)
					{
						if((pCounter < vault.length-1))
						{	
							parser[pCounter] = seperate;
							//System.out.println(parser[pCounter]);
							pCounter++;
							//System.out.println(parser[pCounter]);
							//System.out.println(pCounter);
							break second;
						}
					}
				}
			}

			

		Map <String, Integer> key = new HashMap();

		for(int woop = 0; woop < parser.length - 1 ; woop++)
		{

			String compoundStorage = parser[woop];
			

			int first_location = 0;

			int second_location = 0;

			//System.out.println(woop);

			loop:

			for(int gawoop = 0;  gawoop < compoundStorage.length(); gawoop++)
			{	
				if(Character.isUpperCase(compoundStorage.charAt(gawoop)))
				{
					first_location = gawoop;
					
				}


				if(!(Character.isDigit(compoundStorage.charAt(compoundStorage.length()-1))))
				{	
					int valueOne = compoundStorage.length();
					String element = compoundStorage.substring(first_location, valueOne);
					key.put(element, 1);

					break loop;

				}
		

				if(Character.isDigit(compoundStorage.charAt(compoundStorage.length()-2)))
				{

					int valueOne = compoundStorage.length();
					

					if(Character.isDigit(compoundStorage.charAt(compoundStorage.length()-1)))

					{

						int valueTwo = compoundStorage.length()-2;
						String coeff = compoundStorage.substring(valueTwo, valueOne);
						int parse = Integer.parseInt(coeff);
						String element = compoundStorage.substring(first_location, valueTwo);
						//System.out.println("Parse is: " + parse);
						key.put(element, parse);

						break loop;

					}

				}
				
				if(Character.isLetter(compoundStorage.charAt(compoundStorage.length()-2)))
				{
					int valueOne = compoundStorage.length();
					
					int valueTwo = compoundStorage.length()-2;
					String coeff = compoundStorage.substring(valueOne-1, valueOne);
					//System.out.println(coeff);
					int parse = Integer.parseInt(coeff);
					String element = compoundStorage.substring(first_location, valueTwo+1);
					//System.out.println(element);
					//System.out.println("Parse is: " + parse);
					key.put(element, parse);
					break loop;
				}



			}


		}
		
		UI_Storage k = new UI_Storage();
		Set<Map.Entry<String, Integer>> st = key.entrySet();
		String[] array_one = new String[st.size()];
		int[] array_two = new int[st.size()];
		int stored = 0;
		
		for(Entry<String, Integer> me:st)
		{
			
			array_one[stored] = me.getKey();
			//System.out.print(me.getKey() + " - ");
			array_two[stored] = me.getValue();
			//System.out.println(me.getValue());
			stored++;
		}
		
		
		
		  
		 
		int total = 0;
		for(int zip = 0; zip < array_one.length; zip++)
		{
			String comparison = array_one[zip];
			//System.out.println(comparison);
			loop:
			for(int zipo = 0; zipo < k.elements.length; zipo++)
			{
				if(k.elements[zipo].equals(comparison))
				{
				
					int val = (k.element_mass[zipo]);
					
					int tol = val * array_two[zip];
					total = total + tol;
							
					break loop;
				}	
			}
		}
		
		
		return total;
		
		
		
		
		
		
		
		
	}

	
	int grams(int x, int y)
	{
		int finalValue = 0;
		Storage mainKey = new Storage();
		println("Enter in first value");
		int firstValue = mainKey.key.nextInt();
		println("Enter in second value");
		int secondValue = mainKey.key.nextInt();
		
		
		
		return finalValue;
	}
	
	void conversionFeature()
	{
		Storage mainKey = new Storage();
		println("1:Moles, 2:Grams, 3:Volume");
		println("Choose a conversion");
		int first = mainKey.key.nextInt();
		
		println("1:Moles, 2:Grams, 3:Volume");
		println("Choose a second conversion");
		int second = mainKey.key.nextInt();
		
		if( (first == 1 && second == 1) || (first == 1 && second == 1) )
		{
			//Mole to mole
			
		}else if( (first == 1 && second == 2) || (first == 2 && second == 1) )
		{
			//Mole to grams
			
		}else if( (first == 1 && second == 3) || (first == 3 && second == 1) )
		{
			//Mole to volume
		}
		
		
	}
	

	void println(String s)
	{
		System.out.println(s);
	}
	
	
	static void Test()
	{
		UI_Storage key = new UI_Storage();
		
		for(int i = 0; i < key.elements.length; i++)
		{
			System.out.print(key.elements[i] + " - ");
			System.out.println(key.element_mass[i]);
		}
		
	}

	

}
