package officehours;

	import java.util.Arrays;

	public class Nisan19MultiD_Arrays {

		public static void main(String[] args) {
			// index:    0  1
			int[] arr= {1, 2};
//			[index num of elemnts]
			
		/*
		   MultiD-Arrays
		    n dimentional array: contains (n-1) dimentional array(s)	
		 */
			
			// 2d array: contains one dimentional array(s)
			
			
			int[][] arr2D = { {1,2} , {3, 4} };
			// index:           0       1
//			[index num of 1D array] [index numbers of elemnts (in given 1Darray)]
			
			// print 4: [1][1]
			System.out.println(arr2D[1][1]);
			
			// print 2: [0][1]
			System.out.println(arr2D[0][1]);
			
			// print {3,4}: [1]
			System.out.println(Arrays.toString( arr2D[1]));
			
			// print {1,2}: [0]
			System.out.println(Arrays.toString( arr2D[0]));
			
			// print { {1,2} , {3,4} }:  
				// in order to print multiDimentional array : Arrays.DeepToString(ArrayName)
			System.out.println( Arrays.deepToString( arr2D ));
			
			
			
		// 3D array: conatins 2D array(s)	
			
			int[][] arr2D2= {{1,2},{3,4}};
			
			int[][][] arr3D =   {  { {1,2} ,{3, 4} }   ,  {{ 5, 6} ,{7 , 8} }    };
			// index:                   0                      1
		//[index num of 2D arr][index num of 1D array (in given 2D)][index num of elemnt]
			
			// print 8: [1][1][1]
			System.out.println(arr3D[1][1][1]);
			
			// print { 5, 6 }:[1][0]
			System.out.println( Arrays.toString(arr3D[1][0] ) );
			
			// print { {1,2} ,{3,4} } : [0]
			System.out.println( Arrays.deepToString(arr3D[0] ) );
			
			
			// {  { {1,2} ,{3,4} }   ,  {{ 5, 6} ,{7 , 8} }    }  : 
			System.out.println(Arrays.deepToString(arr3D));
			
			int num3= arr3D[0][1][0];  //3
			int num4 =arr3D[0][1][1];  // 4
			int num5= arr3D[1][0][0];  //5
			System.out.println(num3+" "+num4+" "+num5);
			
			
			
			int[][] arr2D5 =  { {1,2} , {3,4}    };

		}

	}
