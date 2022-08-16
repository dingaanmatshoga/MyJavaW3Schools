class MainAbstractSecond{
	public static void main(String[] args){
		Student  MyObj = new Student();
		System.out.println("full name: " + MyObj.fullName + " Age: " + MyObj.age );
		System.out.println("Your graduation year was on: " + MyObj.gradYear);
		MyObj.Study();

	}
}