/*
Java try block is used to enclose the code that might throw an exception.
 It must be used within the method.

If an exception occurs at the particular statement of try block, the rest of 
the block code will not execute. So, it is recommended not to keeping the code 
in try block that will not throw an exception.

Java try block must be followed by either catch or finally block.

Syntax of Java try-catch
try{    
//code that may throw an exception    
}catch(Exception_class_Name ref){}  */  

//Exception type
/*ArrayIndexOutOfBoundsException
ArithmeticException*/


//Simple try catch exmaple

/*
 * public class TryCatchDemo {
 * 
 * public static void main(String[] args) { int data = 0;
 * 
 * try { data = 10 / 0; } catch (Exception e) { System.out.println("Error " +
 * e.getMessage()); }
 * System.out.println("Rest of code exectuted");
 * System.out.println("Value of data is :" + data);
 * 
 * }
 * 
 * }
 */

package simple_programs;

import java.util.Scanner;

class InvalidRadiusException extends Exception {
//	public String message;

	public InvalidRadiusException(String message) {
		super(message);
	}
	
}

class Circle{
	private double radius;
	
	public void setRadius(double radius) throws InvalidRadiusException {
		
		if(radius < 0) {
			throw new InvalidRadiusException("Radius can not be in negative ");
		}else {
			this.radius = radius;
		}
		
	}
	
	public double getArea() {
		return Math.PI * radius * radius; 
	}
}

public class TryCatchDemo {

	public static void main(String[] args) {
		
		System.out.println("Enter radius of a circle : ");
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		Circle c = new Circle();
		
		try {
			System.out.println("try bloc executed");
			c.setRadius(radius);	
		}catch  (InvalidRadiusException e){
			System.out.println("catch bloc executed");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Finally bloc always executed");
		}
		System.out.println("Area of Circle is :"+ c.getArea());
	}

}
