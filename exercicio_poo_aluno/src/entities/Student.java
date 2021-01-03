package entities;

public class Student {
	public String name;
	public double firstGrade;
	public double secondGrade;
	public double thirdGrade;
	public double finalGrade;
	
	public void setFinalGrade() {
		finalGrade = firstGrade + secondGrade + thirdGrade;
	}
	
	public String toString() {
		return "FINAL GRADE = " + String.format("%.2f", finalGrade);
	}
}
