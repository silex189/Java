package Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Arrays_Class {
	public static void main(String[] args) {
		
		int intArray[] = { 10, 20, 15, 22, 35 };
		
		{
		    System.out.println("Integer Array as List: " + Arrays.asList(intArray)); 
		    
		    List<int[]> list = Arrays.asList(intArray);
		    System.out.println("List<int>: " + Arrays.toString(list.get(0)));
		    
		    List<Integer> integerList = 
		    		Arrays.stream(intArray)
		    		.boxed()
		    		.collect(Collectors.toList());
		    System.out.println("List<Integer>: " + integerList);
		}
		
		{
			Arrays.sort(intArray);
			
			int key = 22;
			
			System.out.println(key + " found at index = "
					+ Arrays.binarySearch(intArray, key));
		}
		
		{
			System.out.println("Integer Array: " + Arrays.toString(Arrays.copyOf(intArray, 10)));
			System.out.println("Integer Array: " + Arrays.toString(Arrays.copyOfRange(intArray, 1, 3)));
		}
		
		int intMultiArray[][] = { { 10, 20, 15, 22, 35 } };
		int intMultiArray2[][] = { { 10, 15, 22 } };
		
		{
			System.out.println("Integer Arrays on comparison: "
					+ Arrays.deepEquals(intMultiArray, intMultiArray2));
		}
		
		{
			System.out.println("Integer Array: "
					+ Arrays.deepHashCode(intMultiArray));
		}
		
		{
			int emptyArray[] = new int[10];
			Arrays.fill(emptyArray, 0);
			Arrays.fill(emptyArray, 3, 7, 22);
			System.out.println("Integer Array on filling: " 
					+ Arrays.toString(emptyArray));
		}
		
		{
//			Java 11
//			int intArray2[] = { 10, 15, 22 };	
//			System.out.println("Integer Arrays on comparison: "
//					+ Arrays.compare(intArray, intArray2));
			
//			System.out.println("Integer Arrays on unsigned comparison: "
//			+ Arrays.compareUnsigned(intArray, intArray2));
		}
		
		{
//			Java 11
//			System.out.println(Arrays.mismatch(intArray, intArray2));
		}
	    
	}

}
