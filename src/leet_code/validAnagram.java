package leet_code;

import java.util.Arrays;

public class validAnagram {
	//by array & sort
	public boolean isAnagram(String s, String t) {
		if(s.length()!=t.length()) {
			return false;
		}
		//sorting
		char sArray[] = s.toCharArray();
		char tArray[] = t.toCharArray();
		
		Arrays.sort(sArray);
		Arrays.sort(tArray);
		
		return Arrays.equals(sArray, tArray);
  
    }
	public static void main (String ar[]) {
		validAnagram ana = new validAnagram();
		
		//System.out.println(ana.isAnagram("racecar", "carrace"));//true
		System.out.println(ana.isAnagram("jar", "jam"));//false
	}

}

