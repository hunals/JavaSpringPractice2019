package officehours;


	import java.util.Arrays;

	public class April30_2 {
		public static void main(String[] args) {

//			double[] nums2 = { 3.6, 6.2, 78.45 };
//			Arrays.sort(nums);
//			Arrays.sort(nums2);

			int[] nums = { 3, 5, 54, 65 };
			int[] numsToCompare = { 3, 5, 56, 65 };
			// we are calling our method to verify if arrays are equal
			boolean result = compareArrays(nums, numsToCompare);

			System.out.println("Are these arrays are equals? " + (result ? "Yes" : "No"));

			double[] numsDouble = { 3.0, 5.5, 54.54, 65.6 };
			double[] numsToCompareDouble = { 3.0, 5.5, 54.54, 65.6 };

			boolean resultForDouble = compareArrays(numsDouble, numsToCompareDouble);

			System.out.println("Are these arrays of double are the same? " + (resultForDouble ? "Yes" : "No"));

		}
		
		public static boolean compareArrays(int[] arr1, int[] arr2) {
			// we are filtering arrays if they have different amount of elements
			if (arr1.length != arr2.length) {
				return false;
			}
			// since we verified that 2 arrays have same ammount of elements
			// we can specify length of either array
			for (int i = 0; i < arr1.length; i++) {
				System.out.println("Comparing value # " + i + " : " + arr1[i] + " - " + arr2[i]);
				if (arr1[i] != arr2[i]) {
					return false;
				}
			}
			return true;
		}
		//custom method for array of doubles
		//overloaded method that works with doubles and does the same thing
		public static boolean compareArrays(double[] arr1, double[] arr2) {
			// we are filtering arrays if they have different amount of elements
			if (arr1.length != arr2.length) {
				return false;
			}
			// since we verified that 2 arrays have same ammount of elements
			// we can specify length of either array
			for (int i = 0; i < arr1.length; i++) {
				System.out.println("Comparing value # " + i + " : " + arr1[i] + " - " + arr2[i]);
				if (arr1[i] != arr2[i]) {
					return false;
				}
			}
			return true;
		}

	}

/*
	package officehours;

import java.util.Arrays;

public class April30 {
	public static void main(String[] args) {
		int[] nums = { 234, 3, 5, 44, 5, 76, 5, 35, 9 };
		// before {234,3,5,44,5,76,5,35,9};
		System.out.println(Arrays.toString(removeNumber(nums, 5)));
		
		// after {234,3,44,76,35,9};
		String str = "Certif34534ied Wo345oden 42354Spoon34534java";
		System.out.println(str.replaceAll("\\w", "*"));
		System.out.println(str.replaceAll("\\d", ""));
		System.out.println(str.replaceAll("^Cert", "*"));
		System.out.println(str.replaceAll("java$", "*"));
	}

	// write a method that will remove certain numbers
	// from array of integers
	public static int[] removeNumber(int[] arr, int target) {
		int counter = 0;
		// we are counting how many elements with a value of target do we have in the
		// array
		for (int i : arr) {
			if (i == target) {
				counter++;
			}
		}
		// we are need to create an array for new values
		// this array will contain all values from old array
		// except target number
		int[] newArr = new int[arr.length - counter];
		// we need to copy all values from old array to the new array except target
		// number
		for (int i = 0, j = 0; i < arr.length; i++) {
			//if number doesn't equals to target
			//add this number to the new array
			if (arr[i] != target) {
				//j - index is responsible for the new array
				//i - index is responsible for the old array
				newArr[j++] = arr[i];
			}
		}
		return newArr;
	}
}
	
	
	*/