package day28;

import java.util.Arrays;

public class Ders5 {

	public static void main(String[] args) {
		
		int[][] data = new int[4][2];
	    data[0][0] = 12;
	    data[0][1] = 17;
	    data[1][0] = 3;
	    data[1][1] = 40;
	    data[2][0] = 44;
	    data[2][1] = 27;
	    data[3][0] = 23;
	    data[3][1] = 12;

	    
	    for(int[] rows: data) {
	    	for(int cell : rows ) {
	    		System.out.print(cell + " ");
	    	}
	    
	    System.out.println();
	    }

	    for (int i = 0; i < data.length; i++) {
//			int[] eachRow = data[i] ;
//			System.out.println(Arrays.toString(eachRow));
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
	    }
	    
		
	    int[] nums1 = new int[] {12,17} ;
		int[] nums2 = new int[] {3,40} ;
		int[] nums3 = new int[] {44,27} ;
		int[] nums4 = new int[] {23,12} ;
		
		int[][] numsOfnums = new int[4][2] ;
		numsOfnums[0] = nums1 ;
		numsOfnums[1] = nums2 ;
		numsOfnums[2] = nums3 ;
		numsOfnums[3] = nums4 ;
		
//		for( int[] eachRow : numsOfnums ) {
//			
//			for( int eachCell : eachRow ) {
//				
//				System.out.print(eachCell + " ");
//			}
//		}
		
		
		
		
	}

}


/*
for(int[] row : table ) {
  
  for( int cell : row) {
    
    System.out.print( cell + " ");
    
  }
  System.out.println();
  
}





*/