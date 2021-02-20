import java.util.Scanner;

//Procedural Programs
public class AreaOfCircle {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the radius of circle : ");
		Scanner sc = new Scanner(System.in);
		double radius  = sc.nextDouble();
		System.out.println("The area of circle with radius:"+ radius + " is " + calAreaOfCircle(radius));
	}
	
	public static double calAreaOfCircle(double radius) {
		return Math.PI * radius * radius;
//		area of triangel = (l * b) /2; 
//		area of circle = PI*r*r;
//		area of square = l*l;
//		area of rect = l*b;
//		area if sphere  = 4 * PI * r * r;
		
//		perimetr of triangle = a+b+c;
//		perimeter of circle = 2 * PI*r;
//		perimeter of square = 4*l;
//		perimeter of rect = 2*(l+b);
//		circumference of sphere  = 2 * PI * r;
		
		
	}
	
	

}
