package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.firstGrade = sc.nextDouble();
		student.secondGrade = sc.nextDouble();
		student.thirdGrade = sc.nextDouble();
		
		student.setFinalGrade();
		
		System.out.println(student);
		
		if (student.finalGrade < 60) {
			double missingPoints = 60 - student.finalGrade;
			System.out.println("FAILED");
			System.out.println("MISSING " + String.format("%.2f", missingPoints) + " POINTS");
		} else 
			System.out.println("PASS");
		
		sc.close();
	}
}
