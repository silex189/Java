package Search_algorithms;

class BinarySearch { 
	
    int binarySearchRecursive(int array[], int leftSubArray, int rightSubArray, int key) { 
        if (rightSubArray >= leftSubArray) { 
            int middle = leftSubArray + (rightSubArray - leftSubArray) / 2; 
  
            
            if (array[middle] == key) 
                return middle; 
  
            
            if (array[middle] > key) 
                return binarySearchRecursive(array, leftSubArray, middle - 1, key); 
  
           
            return binarySearchRecursive(array, middle + 1, rightSubArray, key); 
        } 
  

        return -1; 
    } 
    
    int binarySearchIterative(int array[], int key) {
    	int left = 0, right = array.length -1;
    	
    	while (left <= right) {
    		int middle = left + (right - left) / 2;
    		
    		if (array[middle] == key)
    			return middle;
    		
    		if (array[middle] < key)
    			left = middle + 1;
    		else
    			right = middle - 1;
    	}
    	
    	return -1;
    }
    
    void showResult(int result) {
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    }
  

    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
        int array[] = { 2, 3, 4, 10, 40 }; 
        int array_length = array.length; 
        int key = 10; 
        
        int result = ob.binarySearchRecursive(array, 0, array_length - 1, key);
        ob.showResult(result);
        
        result = ob.binarySearchIterative(array, -10);
        ob.showResult(result);
    } 
} 