package demoPackage;

public class ArrayBasics {

	public static void main(String[] args) {
		int arr[] = {5, 10, 15, 20, 25};
		for(int i=0 ; i< arr.length ; i++)
		{
			if(arr[i]==15)
			System.out.println("the desired element is at " +(i+1)+ "rd position");
			break;
				
		}
	}	

}
