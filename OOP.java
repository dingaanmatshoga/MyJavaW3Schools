public class OOP{
	int x = 5;
	String fname = "John";
	String lname = "Doe";
	int age = 24;
	
	static void myMethod(){
		System.out.println("Hello WOrld");
				
	}
	
	public static void main(String[] args){
	OOP myObj = new OOP();
	System.out.println("CREATE OBJECT");
	System.out.println(myObj.x);
	
	OOP myObj1 = new OOP();
	OOP myObj2 = new OOP();
	System.out.println("");
	System.out.println("CREATE Multilple OBJECTS");
	System.out.println(myObj1.x);
	System.out.println(myObj2.x);
	
	System.out.println("");
	System.out.println("Modify Attributes");	
	myObj.x = 40;
	System.out.println(myObj.x);
	
	System.out.println("");
	System.out.println("Override existing values:");
	myObj.x = 24;
	System.out.println(myObj.x);
	
	System.out.println("");
	System.out.println("Multiple Attributes:");
	System.out.println("Name: "+ myObj.fname + " " + myObj.lname);
	System.out.println("Age"+ myObj.age);
	
	
	System.out.println("");
	System.out.println("Methods:");
	myMethod();
	}
	
	
	
}



