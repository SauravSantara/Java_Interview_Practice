package Core;


public class LongestPrefix {

    static int pos = 1;

    public void regMatch(String result, int position, String arr[]) {

		String base = result;
		char[] baseWord = base.toCharArray();
		int len = baseWord.length;
		pos = position;
		String matcher = arr[pos];
		char[] matcherWord = matcher.toCharArray();
		StringBuilder sb = new StringBuilder();

		if (baseWord.length > matcherWord.length) {
			len = matcherWord.length;
		}

		for (int i = 0; i < len; i++) {
			if (baseWord[i] == matcherWord[i]) {
				sb.append(baseWord[i]);
			} else {
				break;
			}
		}
		// System.out.println("Output: "+ sb.toString());
		
		if (result.equals(sb.toString())) {
		}
		else if (result.length() > sb.length()) {
			result = sb.toString();
		}
		
		if (pos < arr.length - 1) {
        	regMatch(result, ++pos, arr);
		}
		else {
			System.out.println("Longest Prefix: "+result);
		}
	}

    public String longestCommonPrefix(String[] arr){

        String prefix = arr[0];
        
            for(String str : arr){
                
                while(!str.startsWith(prefix)){
                    prefix = prefix.substring(0, prefix.length() - 1);
                }
                    
            }
            
            return prefix;
        }

    public static void main(String[] args){


        // String[] arr = {"persistent", "per", "peg", "persis"};
		String[] arr = {"persistent", "car", "zed", "hello"};
        LongestPrefix lp = new LongestPrefix();
		/// Using String startsWith method
        System.out.println("Longest Prefix: " + lp.longestCommonPrefix(arr));
		/// Using recursion
		// lp.regMatch(arr[0], 1, arr);
    }
    
}
