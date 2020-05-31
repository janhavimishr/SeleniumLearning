package String_Program;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="listen";
		String str2="Silent";
		
		
		
		System.out.println(Anagram("Listen","Stlent"));
	}

	public static boolean Anagram(String str1, String str2) {
		// TODO Auto-generated method stub
		int len1=str1.length();
		int len2=str2.length();
		
		if(len1!=len2) {
			System.out.print("Both Strings are not equal");
		}
		
		String s1=str1.replaceAll(" ","");
		String s2=str2.replaceAll(" ","");
		
		char[] ch1=s1.toLowerCase().toCharArray();
		char[] ch2=s2.toLowerCase().toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
	Boolean b=	Arrays.equals(ch1, ch2);
		
		return b;
	}

}
