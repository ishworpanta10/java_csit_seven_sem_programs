
public class StudentBean implements java.io.Serializable {
	private int id;
	private String name;
	private int rollNo;

//	getter for id
	public int getId() {
		return id;
	}

//	setter for id
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public StudentBean() {
	}

}
