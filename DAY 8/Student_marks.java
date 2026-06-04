import java.util.Scanner;
public class Student_marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = {78,65,90,82,55};
		
		System.out.println("Student Marks:");
		for(int i =0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
