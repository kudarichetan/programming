package programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class copyStringWithoutDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabbbcc";
		Set<Character> set = new HashSet<Character>();
		for(char character : str.toCharArray()) {
			set.add(character);
		}
		//Iterator it=set.iterator();
		String strNew=set.toString();
		System.out.println(strNew);
	}
}
