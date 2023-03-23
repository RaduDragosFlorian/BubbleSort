import java.util.Scanner;

public class Student {
	private String name;
	private int grade;
	public Student(String name, int grade) {
		this.name=name;
		this.grade=grade;
	}
	public Student() {
		this.name="";
		this.grade=0;
	}
	public String GetName() {
		return this.name;
	}
	public void displayNameGrade() {
		System.out.println(name+"="+grade);
	}
	public void setterName(String name) {
		this.name=name;
	}
	public int GetGrade() {
		return this.grade;
	}
	public void setterGrade(int grade) {
		this.grade=grade;
	}
	public void readStudent() {
		Scanner scanner= new Scanner(System.in);
		setterName(scanner.next());
		setterGrade(scanner.nextInt());
	}
	
}
