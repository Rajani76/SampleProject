import java.util.HashMap;
import java.util.Map;

public class Sample {

	public static void main(String[] args) {
	
		String str="BBBBCCCCCCCCC";
	    //using hashmap to store unique character with integer count
	    Map<Character,Integer> map1 = new HashMap<Character,Integer>();

	    for(int k=0; k < str.length(); k++)
	    {
	      char currentChar = str.charAt(k);
	      
	       if(currentChar == 'a'||currentChar == 'e'||currentChar == 'i'||currentChar == 'o'||currentChar == 'u'||
	    		  currentChar == 'A'||currentChar == 'E'||currentChar == 'I'||currentChar == 'O'||currentChar == 'U'){
	      //To check that currentChar is not in map, if not will add 1 count for first time
	      if(map1.get(currentChar) == null){
	        map1.put(currentChar, 1); 
	      } 
	      /*If it is repeating then simply we will increase the count of that key(character) by 1*/
	      else {
	        map1.put(currentChar, map1.get(currentChar) + 1);
	      }
	      }
	      
	    }
	    //Now To find the highest vowel character repeated 
	    int max=0;
	    char maxCharacter = 'a';//setting to a by default
	    for (Map.Entry<Character, Integer> entry : map1.entrySet())
	    {
	        System.out.println("Key=" + entry.getKey() + " Value: " + entry.getValue());
	        if(max <= entry.getValue()){
	            max=entry.getValue();
	            maxCharacter=entry.getKey();
	      }
	    }
	    System.out.println("Max Character:" + maxCharacter);
	    System.out.println("Max Count:" + max);
	 
	  }

	}


