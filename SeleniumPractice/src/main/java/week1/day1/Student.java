package week1.day1;

public class Student {

	String studentName;
	String rollNo;
	String collegeName;
	int markScored;
	float cgpa;
	
 public Student(String studentName,String rollNo,String collegeName,int markScored)
	{
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.collegeName = collegeName; 
		this.markScored =markScored;
		calculateCGPA();
	}
	
public void calculateCGPA()
	{
		this.cgpa = markScored/6;
	}
	
}
