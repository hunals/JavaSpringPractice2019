package repl6;

import java.util.ArrayList;
import java.util.Arrays;

public class Extra16Haz {
//		
//		 public static boolean isSort(int[] nums) {
//
//			 boolean sorted =true;
//			    
//		     for (int i = 0; i < nums.length-1; i++) {
//						if(nums[i]<nums[i+1]) {
//							sorted=true;
//						}else {
//							sorted = false;
//						}
//					}
//					 return sorted;
//	}
//
//}


//	public String printList(ArrayList<ArrayList<String>> nestedList) {
//	    
//		String sum = "";
//	ArrayList<String> arr = new ArrayList<>();
//	ArrayList<String> strs = new ArrayList<>();
//	arr.addAll(strs);
//	
//	for (int i = 0; i < arr.size(); i++) {
//	sum += arr.get(i) + "";
//	}
//
//
//	return sum;
//	}
//}
	
	
	public class Pizza{
		  
		private String s1;
		private int cTop;
		private int pepTop;
		private int hamTop;
		
		public Pizza(){
		  
		}
		
		

		public Pizza(String s1, int cTop, int pepTop, int hamTop) {
			
			this.s1 = s1;
			this.cTop = cTop;
			this.pepTop = pepTop;
			this.hamTop = hamTop;
		}
		
		public double calcCost() {
			double cost=0.0;
			if(s1.equalsIgnoreCase("Small")) {
				cost = 10 + (cTop +pepTop + hamTop) * 2;
			}else if(s1.equalsIgnoreCase("Medium")) {
				cost = 12 + (cTop +pepTop + hamTop) * 2;
			}else if(s1.equalsIgnoreCase("Large")) {
				cost = 14 + (cTop +pepTop + hamTop) * 2;
			}
			return cost;
			
		}

		public String getDescription() {
			String size = getS1().toLowerCase()
					+ " Pizza with " + String.valueOf(cTop)+ " Cheese toppings, " 
					+  String.valueOf(pepTop)+ " Pepperoni toppings, and " 
					+ String.valueOf(hamTop)+ " Ham toppings." 
					+"\n" + "Total Price: " + String.valueOf(calcCost());
			
			return size;
		}


		public String getS1() {
			return s1;
		}

		public void setS1(String s1) {
			this.s1 = s1;
		}

		public int getcTop() {
			return cTop;
		}

		public void setcTop(int cTop) {
			this.cTop = cTop;
		}

		public int getPepTop() {
			return pepTop;
		}

		public void setPepTop(int pepTop) {
			this.pepTop = pepTop;
		}

		public int getHamTop() {
			return hamTop;
		}

		public void setHamTop(int hamTop) {
			this.hamTop = hamTop;
		}
		
		
		
	}
}