package programs;

import java.util.*;

public class stringAscendingAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String input = sc.nextLine();
		
		input = input + " ";
		
		int noOfWords = 0;
		for(int i=0;i<input.length();i++)
		{
			char ch=input.charAt(i);
			if(ch==' ')
			{
				noOfWords++;
			}
		}
		
		//Extract words and store in Array
		String[] words = new String[noOfWords];
		int stIndex = 0;
		int currentWord = 0;
		for(int i=0;i<input.length();i++)
		{
			char ch = input.charAt(i);
			if(ch== ' ')
			{
				String word = input.substring(stIndex, i);
				words[currentWord] = word ;
				currentWord++;
				stIndex = i + 1;
			}
		}
		//Sort Words
		for(int i=0;i<words.length-1;i++)
		{
			for(int j=0; j< words.length-i-1;j++)
			{
				if(words[j].compareTo(words[j+1])>0)
				{
					String temp = words[j];
					words[j] = words[j+1];
					words[j+1] = temp;
				}
			}
		}
		
		//print words
		for(int i=0;i<words.length;i++)
		{
			System.out.print(words[i]+ " ");
		}
	}
}