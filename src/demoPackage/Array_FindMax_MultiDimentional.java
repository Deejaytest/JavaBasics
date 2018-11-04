package demoPackage;

/*Print the max in the multi dimensional array
2 4 5
3 4 7
1 2 9
*/

public class Array_FindMax_MultiDimentional {
	public static void main(String args[]) {
		int arr[][]= {{2, 4, 5},{3, 4, 7},{1, 9, 5}};
		int max=arr[0][0];
		for(int i=0 ; i< 3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(arr[i][j]>max)
				{
					max=arr[i][j];
				}
					
			}
		}
		System.out.println(max);

	}


}
