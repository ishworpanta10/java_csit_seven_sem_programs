package simple_programs;

interface sport {
	double score = 88.53;

	void displaySportInfo();
}

class Test {
	final double marks = 86.66;

	public void displayTestResult() {
		System.out.println("Test Result");
	}
}

public class MultipleInheritance extends Test implements sport {

	@Override
	public void displaySportInfo() {
		System.out.println("Sport Result");
	}

	void displayAllResult() {
		displaySportInfo();
		displayTestResult();
		System.out.println("All Result Displayed");
	}

	public static void main(String[] args) {

		MultipleInheritance demo = new MultipleInheritance();
//		demo.displayAllResult();
//		demo.displayTestResult();
//		demo.displaySportInfo();

	
	
		
		System.out.println("Marks is :" + demo.marks);
		System.out.println("Score is :" + score);

	}

}
