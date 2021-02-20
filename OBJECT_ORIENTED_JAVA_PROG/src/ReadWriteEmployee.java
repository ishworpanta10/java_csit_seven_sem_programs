import java.io.RandomAccessFile;
import java.util.Scanner;

public class ReadWriteEmployee {
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	private int id;
	private String name;
	private double salary;

	public static void main(String[] args) {
		final int size = 3;
		ReadWriteEmployee e[] = new ReadWriteEmployee[size];

		Scanner sc = new Scanner(System.in);

		int id;
		String name;
		double salary;
		
//		setting student objects

		for (int i = 0; i < size; i++) {
			e[i] = new ReadWriteEmployee();
			System.out.println("Enter Id of employee" + (i + 1) + ":");
			id = sc.nextInt();

			System.out.println("Enter name of employee" + (i + 1) + ":");
			name = sc.next();

			System.out.println("Enter salary of employee" + (i + 1) + ":");
			salary = sc.nextDouble();

			e[i].setId(id);
			e[i].setName(name);
			e[i].setSalary(salary);

		}
		
//		writing to file 
		try {
			RandomAccessFile f = new RandomAccessFile("/home/ishwor/Documents/Java Text/employee.txt", "rw");
			for(int i =0; i<size ; i++) {
				f.write(e[i].getId());
				f.writeUTF(e[i].getName());
				f.writeDouble(e[i].getSalary());
			
			}
			f.close();
		}catch (Exception er){
			er.printStackTrace();
		}
		
//		read the data from file and displaying user with salaray > 24000
		int id1[] = new int[size];
		String name1 [] = new String[size];
		double salary1[] = new double[size];
		
		try {
			RandomAccessFile f = new RandomAccessFile("/home/ishwor/Documents/Java Text/employee.txt", "r");
			System.out.println("Employee with salary greater than 24000");
			for(int i=0;i<size;i++) {
				id1[i] = f.read();
				name1[i] = f.readUTF();
				salary1[i] = f.readDouble();
				if(salary1[i] > 24000) {
					System.out.println("Id :"+ id1[i] + "\t Name :"+ name1[i]
							+ "\t Salary :"+ salary1[i]);
				}
			}
			f.close();
		}catch(Exception err) {
			err.printStackTrace();
		}
		

	}

}
