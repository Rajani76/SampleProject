import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class StringReplace {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] applicant_ids = {"A", "B", "C", "D", "C", "E", "A", "C", "F", "G", "G"};
		int[] credit_scores	 = {445, 435, 425, 475, 450, 500, 441, 451, 450, 600, 200};
		StringBuffer sb = new StringBuffer();
		Map<Integer, String> credit_scoreMap = new LinkedHashMap<Integer, String>();
		Set<String> hashSet = new HashSet<String>();
		 for(int i=0;i<credit_scores.length;i++){
		    
		    // Check if the applicant ID is existing 
		        if(!hashSet.add(applicant_ids[i])){     
		            // Get the existing Credit Score ID to be removed   
		        	System.out.println("Duplicate:"+ applicant_ids[i] + " i:" + i);
		            Integer key = removeEntry(credit_scoreMap,applicant_ids[i]);
		            if(key != null){
		                // remove the existing Credit Score
		            	credit_scoreMap.remove(key);
		            }
		        }else{
		            // Addd Input to a Map
		        	System.out.println("Credit scores: "+ credit_scores[i]+ " application Id: " + applicant_ids[i] + " i:" + i);
		            credit_scoreMap.put(credit_scores[i], applicant_ids[i]);
		        }

		 }
		 
		
		 for(Map.Entry<Integer, String> entryMap : credit_scoreMap.entrySet()){    
		     // Prepare teh Output String 
		     sb.append(entryMap.getValue());
		 }
		 
		System.out.println(sb.toString());

	}

	private static Integer removeEntry(Map<Integer, String> credit_scoreMap, String applicationID) {
		
	 
		    for(Map.Entry<Integer, String> entryMap : credit_scoreMap.entrySet()){
		        String value = entryMap.getValue();
		    	if(value.equalsIgnoreCase(applicationID)){
		    		System.out.println("Remove:"+value);
		        return entryMap.getKey();
		    }
		 }
		  return null;
				
	}

}
