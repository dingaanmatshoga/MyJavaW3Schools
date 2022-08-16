abstract class MainAbstracact{
	public int age = 23;
	public String fullName = "Chimamanda";
	public abstract void Study();
	
}

class Student extends MainAbstracact{
	public int gradYear = 2014;
	public void Study(){
		System.out.println("Study all day and all night");
		
	}
	
}


