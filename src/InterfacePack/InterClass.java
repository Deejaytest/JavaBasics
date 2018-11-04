package InterfacePack;

public class InterClass implements InterfaceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterClass obj1 = new InterClass();
		InterfaceConcept obj2 = new InterClass ();
		obj1.newfunction();
		obj2.launch();
		obj2.login();
		obj2.logout();
	}

	@Override
	public void login() {
		System.out.println("Logged in");
	}

	@Override
	public void logout() {
		System.out.println("Logged out");

	}

	@Override
	public void launch() {
		System.out.println("Launched");

	}
	
	public void newfunction()
	{
		System.out.println("New function");

	}

}
