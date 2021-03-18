
public class StudentController {

	StudentModel model = new StudentModel();
	StudentView view = new StudentView();

	public StudentController(StudentModel model, StudentView view) {
		this.model = model;
		this.view = view;
	}

	void setStudentName(String name) {
		model.setName(name);
	}

	void setStudentRollNo(int roll) {
		model.setRollNo(roll);
	}

	int getStudentRollNo() {
		return model.getRollNo();
	}

	String getStudentName() {
		return model.getName();
	}

	void studentView() {
		view.display(model.getName(), model.getRollNo());
	}

}
