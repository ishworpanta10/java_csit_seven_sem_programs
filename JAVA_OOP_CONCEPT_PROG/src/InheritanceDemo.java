//Java Inheritance demo 
/*Inheritance can be defined as the process where one class acquires the properties
 *  (methods and fields) of another. With the use of inheritance the information is 
 *  made manageable in a hierarchical order.

The class which inherits the properties of other is known as subclass (derived class, 
child class) and the class whose properties are inherited is known as superclass (base
 class, parent class).

extends Keyword
extends is the keyword used to inherit the properties of a class. Following is the syntax 
of extends keyword.

Syntax

class Super {
   .....
   .....
}
class Sub extends Super {
   .....
   .....
}*/


public class InheritanceDemo {

	public static void main(String[] args) {
		double rectArea, triArea;
		

		Polygen p = new Polygen();
	

		Rectange r = new Rectange();
		r.setValue(4, 6);
		Triangle t = new Triangle();
		t.setValue(4, 6);

		rectArea = r.getArea();
		triArea = t.getArea();
		
		System.out.println("Rectangle Area is " + rectArea);
		System.out.println("Triangle Area is " + triArea);

	}

}

class Polygen {
	protected double length;
	protected double breadth;

	public void setValue(int l, int b) {
		this.length = l;
		this.breadth = b;
	}

}

class Rectange extends Polygen {
	double getArea() {
		return length * breadth;
	}
}

class Triangle extends Polygen {
	double getArea() {
		return (length * breadth) / 2;
	}
}
