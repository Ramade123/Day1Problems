import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		var r=new Scanner(System.in);
        System.out.println("Enter a year :");
       year=r.nextInt();
       
       if ((year%400 == 0) || (year%4 == 0 && year%100 != 0))
       {
    	   System.out.println("Leap year");
       }
       else
       {
    	   System.out.println("Not a Leap Year");
       
       
       }
    	   
    	   

	}

}
