package challenges;

import java.util.Arrays;

public class Exam1 {
    public int solution(int N) {
    	
        String N_to_String = new Integer(N).toString();
        
        char charArrayNumbers[] = N_to_String.toCharArray();
        
        Arrays.sort(charArrayNumbers);
        
        final String tmp = new String(charArrayNumbers);
        N_to_String = new StringBuilder(tmp).reverse().toString();
        
        return Integer.parseInt(N_to_String);
     }
}
