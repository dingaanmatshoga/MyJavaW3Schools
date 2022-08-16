public class Test{
	String ModelName;
	int ModelYear;

	public Test(String Name, int Year){
		ModelName = Name;
		ModelYear = Year;
		
	}
	public static void main(String[] args){
		Test MyCar = new Test("Mustang", 1969);
		System.out.println("The model of the car: " + MyCar.ModelName + " // Year of the make: " + MyCar.ModelYear);
		
		
	}
	
	
	
}
