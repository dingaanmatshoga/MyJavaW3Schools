public class Main{
	public static void main(String[] args){
		System.out.println("Hello World");
		System.out.println("I am learing java");
		System.out.println("It is awsome");
		System.out.println(3 + 3);
		System.out.print("Hello World! ");
		System.out.print("I will print on the same line.");
		System.out.println("");
		String name = "John";
		System.out.println("Hello "+name);
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the string is: " + txt.length());
		System.out.println(txt.toUpperCase());
		System.out.println(txt.toLowerCase());
		System.out.println("");
		// Switch
		System.out.println("Switch");
		int day = 6;
		switch (day){
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wedensday");
				break;
			case 4:
				System.out.println("Thursday");
				break;

			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;	
			case 7:
				System.out.println("Sunday");
				break;
		}	
		int weekend = 4;
		switch (weekend){
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Does not include weekend");
				break;
			
				
						
		}
		System.out.println("");
		// While loop
		System.out.println("While Loop");
		int i = 0;
		while (i < 5){
			System.out.println(i);
		i++;			
		}
		System.out.println("");
		int j = 0;
		do {
			System.out.print(j);
			j++;
			
		}
		while (j < 7);
		System.out.println("");
		// For Loops
		for (int l = 0; l <10; l++){
			System.out.println(l);
			
		}
		System.out.println("");
		System.out.println("For Loops Squence");
		for(int m = 9; m <100; m = m + 10 ){
			System.out.println(m);
		}
		
		System.out.println("");
		// For Each Loops
		System.out.println("For Each Loops: ");
		String[] cars = {"Volvo","BMW","Merc","Audi"};
		for (String k : cars){
			System.out.println(k);	
		
		}
			{
		System.out.println("");
		//Arrays
		
		System.out.println("Access the Elements of an Array: ");
		String[] carz = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(carz[0]);
		System.out.println("");
			}
		{
		System.out.println("");
		System.out.println("Change Elements of an Array: ");
		String[] carzz = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(carzz);
		System.out.println("");
		carzz [0] = "Opel";
		System.out.println(carzz[0]);
		System.out.println("");
		System.out.println("Array Length: ");
		System.out.println(carzz.length);
		System.out.println("");
		{
		System.out.println("Loop Through an Array: ");
		String[] car1 = {"Volvo", "BMW", "Ford", "Mazda"};
		for (int ii = 0; ii < car1.length; ii++){
			System.out.println(car1[ii]);
			}
				
				
		System.out.println("");
		for ( String ii : car1){
			System.out.println(ii);

			}
		}
			{
				//Multidimensional Arrays
				System.out.println("");				
				System.out.println("Multidimensional Arrays");
				int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
				int x = myNumbers[1][2];
				System.out.println(x);
				System.out.println("");	
				
				
				
			}
			{
				
				int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
				for (i = 0; i < myNumbers.length; ++i){
					for (j = 0; j < myNumbers[i].length; ++j){
						System.out.println(myNumbers[i][j]);
						
						
					}
				}
				
				
			}
				
				
		}
			
	}	
}

 
























