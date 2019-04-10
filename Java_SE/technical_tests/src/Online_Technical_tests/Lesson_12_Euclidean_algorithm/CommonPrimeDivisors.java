package Online_Technical_tests.Lesson_12_Euclidean_algorithm;

// GitHub Code

public class CommonPrimeDivisors {
    public int solution(int[] A, int[] B) {
        int count = 0;
        for(int i=0;i<A.length;i++) {
            if(hasSamePrimeDivisors(A[i], B[i])){
                count++;    
            } 
        }
        return count;
    }
    
    public int greatestCommonDivisor(int a, int b) {
	    if(a % b == 0) return b;
	    return greatestCommonDivisor(b,a%b);
	}
	
	public boolean hasSamePrimeDivisors(int a, int b) {
	    int gcdValue = greatestCommonDivisor(a,b);
        int gcdA;
        int gcdB;
        while(a!=1) {
            gcdA = greatestCommonDivisor(a,gcdValue);
            if(gcdA==1)
                break;
            a = a/gcdA;
        }
        if(a!=1)  {
            return false;
        }
        while(b!=1) {
            gcdB = greatestCommonDivisor(b,gcdValue);
            if(gcdB==1)
                break;
            b = b/gcdB;
        }
        return b==1;        
	}
}

