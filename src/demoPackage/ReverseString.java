package demoPackage;

public class ReverseString {

	public static void main(String[] args) {
		String initial = "Deepak";
		String finalStr = "";
		for(int i=initial.length()-1 ; i>=0 ; i--)
		{
			finalStr = finalStr + initial.charAt(i);
		}
		System.out.println(finalStr);
	}

}
