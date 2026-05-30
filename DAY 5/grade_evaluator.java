import java.util.Scanner;
public class grade_evaluator {

	String evaluator(double marks)
	{
		if(marks>=90)
		{
			return "Grade A";
		}
		else if(marks>=70)
		{
			return "Grade B";
		}
		else if(marks>=50)
		{
			return "Grade C";
		}
		else
		{
			return "failing grades";
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		grade_evaluator result = new grade_evaluator();
		System.out.println("Enter the marks:");
		double marks = sc.nextDouble();
		System.out.println("The student has got "+result.evaluator(marks));
		sc.close();
	}

}
