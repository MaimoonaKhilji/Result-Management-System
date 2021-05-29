# Result-Management-System


This program is made for Result Management System or simply for Result record of students. It prints out DMC. Here in this program two classes are created:

Record (First Class): It consists of 5 methods. 
1.	int Students ( )
2.	double Percentage (double marks)
3.	double Gpa (double percentage ) 
4.	void Gpa_Subject ( ) 
5.	void Record (int n)

Result (Second Class): This is main class in which object of first class is created. Method Students( ) is called and stored in a variable n . This variable n  is then passed as an argument to the Record method. 


Methods and their purpose:

Method:	Int Students ( )	
Purpose: This method will take the input from user that “how many students have given the exam?” Or “ the number of enrolled students.”


Method: Double Percentage ( double marks)	
Purpose: It will take Marks as argument and will calculate percentage.


Method: Double Gpa ( double Percentage )	
Purpose: It will take Percentage as an argument and through if and elseif operations, it will return respective Gpa.


Method: Void Gpa_Subject ( )	
Purpose: Through this method, we will take marks as an input from user. Then by calling Percentage method, percentage will be calculated. Then by calling Gpa method, gpa will be calculated and at the end Cgpa will be calculated and through System.out.println
Cgpa will be printed.


Method: Void Record ( int n )	
Purpose: Here in this method, n i.e. number of enrolled students is passed as an argument. Then through for loop, we will take student name and id no.  as input from user. Then Gpa_Subject ( ) will be called. This loop will execute n times ( n = number of enrolled students).
For example: If no. of enrolled students is 5, then loop will execute 5 times.




