
public class Static_Variable {

	public class Static_variable
	{
		static int a = 10;
		static int b = 20;
		
		static void multiply(int a, int b) {
			
			System.out.println("Multiplication of a and b are : " +(a * b));
		}
		public static int Substract(int a, int b, int c) {
		int substract;
		return substract = a - b - c;
		// method can return only one value with return statement not two and we can
		// not return two values because after returning it goes to the main method
	}
	static {
		System.out.println("Intialising static block");
		// only and start executing each of them are execute in the order of their declaration.
		a = 15;
		
		}
	
    public static void main(String[] args) {
	    int c;
	    System.out.println("sum of static variable calling direct is " + (a + b));
	    multiply(a = 20, b = 30);
	    int value = Substract(a = 50, b = 30, c = 60);
	    System.out.println("Substraction of variable are " + value);
	    System.out.println("Substraction of variable are " + Substract(a = 110, b = 30, c = 60));
       }
	}
}
	
	
	   
    
		


	
