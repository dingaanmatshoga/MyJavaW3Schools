public class Modifiers1{
	static void StaticModify(){
		System.out.println("Static does not need to be called using an object");
		
	}
	public void PublicModify(){
		
		System.out.println("Public needs an object to be called using an object");
	}
	public static void main(String[] args){
		StaticModify();
		
		Modifiers1 MyObj = new Modifiers1();
		MyObj.PublicModify();
		
		
		
	}
	
}