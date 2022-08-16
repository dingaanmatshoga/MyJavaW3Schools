public class Constructor3{
	int ModelYear;
	String ModelName;
	
	public Constructor3(int Year, String Name){
		ModelYear = Year;
		ModelName = Name;
	
	}
	public static void main(String[] args){
		Constructor3 MyObj = new Constructor3(1965, "Mustang");
		System.out.println("Year when the car was made: " + MyObj.ModelYear + " What was the cars name: " + MyObj.ModelName);
		
		
	}

}
/*test git hub
secong line quotes at the sametime/*