
//program to demonstrate encapsulation in java

/*Encapsulation is one of the four fundamental OOP concepts. 
 * The other three are inheritance, polymorphism, and abstraction.

Encapsulation in Java is a mechanism of
 wrapping the data (variables) and code acting on the data
  (methods) together as a single unit. In encapsulation, the
   variables of a class will be hidden from other classes, 
   and can be accessed only through the methods of their current class.
    Therefore, it is also known as data hiding.

To achieve encapsulation in Java −

Declare the variables of a class as private.

Provide public setter and getter methods to modify and view the variables values.*/

public class Encapsulation {

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Ishwor Panta");
		student.setRollNo(13);
		System.out.println("Student Name is :"+ student.getName());
		System.out.println("Student Roll No is :"+ student.getRollNo());

	}

}



class Student {
	private String name;
	private int rollNo;

//	getters

	public String getName() {
		return name;
	}

	public int getRollNo() {
		return rollNo;
	}

//	setters
	public void setName(String name) {
		this.name = name;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
}
