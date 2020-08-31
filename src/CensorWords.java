
public class CensorWords {

	public static void main(String[] args) {

		String sampletext = "hi I love the world same the world";
		String[] blacklist = {"love", "the", "world"};
		String replacement = "--";
       
		String result = censorFromBlacklistAndReplace(sampletext,blacklist,replacement);
		
        System.out.println(result);
		
		

	}
	
	private static String censorFromBlacklistAndReplace(String sample_text, String[] blacklist, String replacement) {
	 /*   
	    // Looping through the blacklist array
	        for(String blackListString:blacklist){
	// for each blacklist value find in the sample_text, replace with required replacement value
	            sample_text = sample_text.replace(blackListString, replacement);
	        }
	        // returning the replaced String
	    return sample_text;*/
		
		/*StringBuffer sb = new StringBuffer();
		String[] words = sample_text.split(" ");
       	for(String eachword: words){
			if(blacklist[1].equals(eachword)||blacklist[0].equals(eachword)|| blacklist[2].equals(eachword)) 
				  sb.append(replacement);
			else 
				sb.append(eachword);	
			sb.append(" ");
		}
	    return sb.toString();
	}*/
		
		StringBuffer sb = new StringBuffer();
		String[] words = sample_text.split(" ");
       	for(String eachword: words){
       		int i = 0;
       		for (String eachbalcklist:blacklist )
       		{
			if(eachbalcklist.equals(eachword))
			{
				  sb.append(replacement);
				  i++;
			}
					
       		}
			 if(i==0)
			sb.append(eachword);	
			sb.append(" ");
		}
	    return sb.toString();
	}


}
