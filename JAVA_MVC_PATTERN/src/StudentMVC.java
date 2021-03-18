
/*Some of the advantages of using JDBC below:

It is capable of reading any database. The only requirement for it to do so is the proper installation of all the drivers.
It automatically creates the XML format of data from the database.
It does not require the content to be converted.
It provides full support to query and stored procedure.
It provides support to both Synchronous and Asynchronous processing.
It supports modules.*/

public class StudentMVC {

	public static void main(String[] args) {

		StudentModel model = dataFromDB();
		StudentView view = new StudentView();
		StudentController controller = new StudentController(model, view);
		
		controller.studentView();
		
		controller.setStudentName("Sashita");
		controller.setStudentRollNo(12);
		controller.studentView();
	}
	
	public static StudentModel dataFromDB() {
		StudentModel studentModel =  new StudentModel();
		studentModel.setName("Ishwor");
		studentModel.setRollNo(14);
		return studentModel;
	}

}
