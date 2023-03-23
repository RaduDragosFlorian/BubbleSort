import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Input the number of students:");
		
		int n, aux=0;
		boolean swapped;
		String auxiliar="";
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		Student[] student= new Student[n];
		System.out.println("Input the name of the student followed by the grade:");
		for(int i=0;i<n;i++) {
			student[i]=new Student();
			student[i].readStudent();
		}
			for(int i=0;i<n-1;i++) {
				swapped=false;
				for(int j=0;j<(n-i-1);j++){
					if(student[j].GetGrade()>student[j+1].GetGrade()) {
						aux=student[j].GetGrade();
						auxiliar=student[j].GetName();
						student[j].setterGrade(student[j+1].GetGrade());
						student[j].setterName(student[j+1].GetName());
						student[j+1].setterGrade(aux);
						student[j+1].setterName(auxiliar);
						swapped=true;
					}
				}
				if(swapped==false)
					break;
			}
			for(int i=0;i<n;i++) {
				student[i].displayNameGrade();
			}

	}
}
