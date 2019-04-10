package chapter06_Methods_And_Classes_In_Deep;

class Outer {
	
	private int nums[];
	
	Outer(int nums[]) {
		this.nums = nums;
	}

	void analyze() {
		Inner innerObject = new Inner();

		System.out.println("Minimum: " + innerObject.min());
		System.out.println("Maximum: " + innerObject.max());
		System.out.println("Average: " + innerObject.avg());
	}

	class Inner {
		
		private int min() {
			int minimum = nums[0];

			for(int i=0; i < nums.length; i++)
				if(nums[i] < minimum) minimum = nums[i];

				return minimum;
		}

		private int max() {
			int maximum = nums[0];
			for(int i=0; i < nums.length; i++)
				if(nums[i] > maximum) maximum = nums[i];

			return maximum;
		}

		private int avg() {
			int average = 0;
			
			for(int i=0; i < nums.length; i++)
				average += nums[i];

			return average / nums.length;
		}
		
	}
	
}

public class NestedClasses {
	public static void main(String[] args) {
		
		int intArray[] = {3, 2, 1, 5, 6, 9, 7, 8 };

		Outer outer = new Outer(intArray);
		outer.analyze();
	}
}
