public class Methods{
	static void myMethod(){
		System.out.println("CALL METHODS:");
		System.out.println("I just got executed: ");
	
	}
	static void myMethod1(String fname){
			System.out.println(fname + "referance");
			
		}
	static void myMethod2(String fname, int age){
		System.out.println("");
		System.out.println(fname + "is " + age);

	}
		
	static int myMethod3(int x){
		return 5 + x;

	}	

		
	static int myMethod4(int x, int y){
		return x + y;
		
		
	}
	
	static int myMethod5(int x, int y){
		return x + y;
		
	}
	
	static void CheckAge(int age){
		if(age > 18){
			System.out.println("Access is granted: You are old enough ");

		}
		else{
			System.out.println("Access denied: You are not old enough ");	
	
	
		}
			
		
	}
	
	static int plusMethodInt(int x, int y){
		
		return x + y;
		
	}
	
	static double plusMethodDouble(double  x, double y){
		
		return x + y;
	}
	
	
	
	public static void main(String[] args){
		myMethod();
		
		myMethod1("Sam ");
		myMethod1("Summer ");
		myMethod1("Something ");
		
		myMethod2("Blue ", 24);
		myMethod2("Green ", 25);
		myMethod2("Red ", 26);
		System.out.println("");
		System.out.println("One variable");
		System.out.println(myMethod3(3));
		
		System.out.println("");
		System.out.println("Two variables");
		System.out.println(myMethod4(5,4));
		
		
		System.out.println("");
		System.out.println("Store the result in a variable");
		int z = myMethod5(9, 10);
		System.out.println(z);
		
		System.out.println("");
		System.out.println("Use if...else statements inside methods");
		CheckAge(20);
		
		
		System.out.println("");
		
		int myNum1 = plusMethodInt(8, 5);
		double  myNum2 = plusMethodDouble(4.3, 6.26);
		System.out.println("METHOD OVERLOADING");
		System.out.println("Int " + myNum1);
		System.out.println("Double "+ myNum2);
		
		
		
		
	}
	
		
	
		
}


	
		
		
		

	
	
