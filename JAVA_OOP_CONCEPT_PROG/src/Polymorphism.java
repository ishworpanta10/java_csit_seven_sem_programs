
//Polymorphism demo in java 

/*Polymorphism is the ability of an object to take on many forms.
The most common use of polymorphism in OOP occurs when a parent
class reference is used to refer to a child class object
*/

/*Polymorphism uses same methods to perform different tasks. This allows us to perform
a single action in different ways.

For example, think of a superclass called Animal that has a method called animalSound(). 
Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And they also have their own 
implementation of an animal sound method (the pig oinks, and the cat meows, etc.):*/

//Simple Example
/*class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class Main {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();  // Create a Animal object
    Animal myPig = new Pig();  // Create a Pig object
    Animal myDog = new Dog();  // Create a Dog object
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}*/

public class Polymorphism {

	public static void main(String[] args) {
		
//		Polymorphism with no abstract class
		Shape s = new Rectangle(4, 5);
		s.area();
		System.out.println("Area of Rect using no abstract class is :"+  s.area());
		
		
//		Polymorphism with abstract class
		Shape1 s1 = new Rectangle1(6, 7);
		s1.area();
		System.out.println("Area of Rect1 using abstract class is :"+  s1.area());
		
//		Polymorphism with interface 
		Shape2 s2 = new Rectangle2(7, 8);
		s2.area();
		System.out.println("Area of Rect2 using interface is :"+  s2.area());

	}

}

//with no abstract class
class Shape{
	public double area() {
		return 0;
	}
}


class Rectangle extends Shape{
	private double length ;
	private double breadth ;
	
	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public double area() {
		return length * breadth;
	}
}

//with abstract class 
abstract class Shape1 {
	public abstract double area();
}

class Rectangle1 extends Shape1{
	private double length ;
	private double breadth ;
	
	public Rectangle1(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public double area() {
		return length * breadth;
	}
}

//with interface 
interface Shape2{
	double area();
}

class Rectangle2 implements Shape2{
	private double length ;
	private double breadth ;
	
	public Rectangle2(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	public double area() {
		return length * breadth;
	}
}
