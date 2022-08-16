public class Test3Construct{
	static void TestStatic(){
		System.out.println("This static does not neeed object");
		
	}
	public void TestPublic(){
		System.out.println("This is public needs object");
	}
	public static void main(String[] args){
		TestStatic();
		
		Test3Construct MyObj = new Test3Construct();
		MyObj.TestPublic();
		
	}
}
// Test github