package PackageDemo_Parent;

import PackageDemo_child.childClass;
import PackageDemo_child.childClass_2;

public class Baseclass {

	public static void main(String[] args) {
		
		childClass cc= new childClass();
		childClass_2 cc2 = new childClass_2();
		ParentPack_class1 pc = new ParentPack_class1();
		Baseclass bc = new Baseclass();
		
		cc2.childpackfunc1();
		cc2.childpackfunc2();
		pc.launch();
		pc.login();
		pc.logout();
		cc.childpack_class1();
		cc.childpack_class2();
		bc.testcase();
		

	}
	public void testcase()
	{
		System.out.println("Base class test case");
	}

}
