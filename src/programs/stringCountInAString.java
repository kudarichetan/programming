package programs;

import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class stringCountInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hi how are you, hi how do you do";
		String[] words=str.split(" ");
		Map<String, Integer> mp = new HashMap<String,Integer>();
		for(String word:words) {
			Integer actualCount = mp.get(word.trim());
			if(actualCount==null) {
				int oldCount = 1;
				mp.put(word, oldCount);
			}
			else {
				mp.put(word, actualCount+1);
			}
		}
		System.out.println(mp.entrySet());
	}
}
