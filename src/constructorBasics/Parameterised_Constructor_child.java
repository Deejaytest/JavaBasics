package constructorBasics;

public class Parameterised_Constructor_child {

	public Parameterised_Constructor_child()
	{
		System.out.println("Constructor without any parameter");
	}

	public Parameterised_Constructor_child(String str) {
		System.out.println("Constructor with String as parameter");
		System.out.println("String is " +str);
	}

	public Parameterised_Constructor_child(int i, int j) {
		System.out.println("Constructor with Integers as parameters");
		int c = i+j;
		System.out.println(c);


	}
		
	
}
