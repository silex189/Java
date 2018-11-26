package chapter13_Generics;

public class GenericMethodDemo {
	
	static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] array1, V[] array2) {
		if (array1.length != array2.length) return false;
		
		for (int i=0; i < array1.length; i++) 
			if (!array1[i].equals(array2[i])) return false;
		
		return true;
	}

	public static void main(String[] args) {
		Integer nums1[] = { 1, 2, 3, 4, 5 };
		Integer nums2[] = { 1, 2, 3, 4, 5 };
		Integer nums3[] = { 1, 2, 3, 4, 5 };
		Integer nums4[] = { 1, 2, 3, 4, 5, 6 };
		
		if (arraysEqual(nums1, nums1))
			System.out.println("nums1 equals nums1");
		
		if (arraysEqual(nums1, nums2))
			System.out.println("nums1 equals nums2");
		
		if (arraysEqual(nums1, nums3))
			System.out.println("nums1 equals nums3");
		
		if (arraysEqual(nums1, nums4))
			System.out.println("nums1 equals nums4");
		
		Double doubleValues[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
//		if (arraysEqual(nums1, doubleValues))
//			System.out.println("nums1 equals doubleValues");
		
	}

}
