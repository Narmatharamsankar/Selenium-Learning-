package week1.day1;

public class Report {
   
	public Student[] St;
	
    public Report()
	{ 
         St = new Student[3];	
		 St[0] = new Student ("Narmatha Ramsankar","PA1014","SSN college of Engineering",569);
		 St[1] = new Student ("Brintha Ramsankar","PA1015","SSN college of Engineering",590);
		 St[2] = new Student ("Kamala Kannan","PA1016","SSN college of Engineering",532);
       
	}
  
	
	
	public static void main(String[] args)
	{
      Report Myreport = new Report ();
      Myreport.printReport();
    }
	
	public void printReport()
	{     
		System.out.println("*************STUDENT REPORT*************");
		
				for(Student S : St)
				{
					System.out.println("StudentName :"+ S.studentName );
					System.out.println("Roll Number :"+S.rollNo );
					System.out.println("College Name : " + S.collegeName );
					System.out.println("Marks :"+ S.markScored );
					System.out.println("CGPA :"+ S.cgpa );
				}
	}

}
