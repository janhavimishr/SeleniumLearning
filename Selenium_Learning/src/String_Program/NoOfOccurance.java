package String_Program;

import java.util.HashMap;
import java.util.Map;

public class NoOfOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String str = "GoogleMatchMaker"; 
        characterCount(str); 
	}
	
	 static void characterCount(String inputString) 
	    { 
	        
	        HashMap<Character, Integer> hm = new HashMap<Character, Integer>(); 
	  
	        	  
	        char[] strArray = inputString.toCharArray(); 
	  
	         
	        for (char c : strArray) { 
	            if (hm.containsKey(c)) { 
	  
	                hm.put(c, hm.get(c) + 1); 
	            } 
	            else { 
	 
	                hm.put(c, 1); 
	            } 
	        } 
	  
	         
	        } 
	    } 
	  
	


