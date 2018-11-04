package constructorBasics;

/*Notes related to constructors- 
1. Name of the constructor should the name of the class only. 
2. Constructor will not have any return type. 
3. Whenever the object of the class is created, the constructor of that class is called by default. 
4. If the constructor is explicitly defined, then block of code defined inside the constructor is executed automatically. 
5. If the constructor is not defined explicitly, nothing happens and internally java constructor is called. 
6. Constructors are 2 types- Default constructor and Parameterised Constructor 
7. Default constructor is the one which doesn't have any parameters.
8. Parameterised constructor is the one which passes one or multiple parameters.
*/

public class Constructor_Parent {

	public static void main(String[] args) {
		Constructor_child cd = new Constructor_child(); // Object created, so this class's constructor will be called and exected
		cd.login();
		cd.logout();
	}

}
