/*     Methods used in this program:

		Student Result System:
 1) int Students ( )
 2) double percentage(double marks)
3) double gpa (double percentage )  		//marks according to percentage or gpa equivalent
4) void gpa per subject ( )
5) void record (int n)
			*/

import java.util.Scanner ;
class Record {
	Scanner input = new Scanner( System.in ) ;

/*      Method for taking input of no. of student enrollment      */
	int Students ( )				
	{
		System.out.print ( "No.of Students enrolled : " ) ;
		int n = input.nextInt ( ) ;
		return n ;
	}

/*			Method for percentage calculator 			*/
	double Percentage ( double marks )	
	{
		double Percentage = ( marks * 100 ) / 100 ;
		return Percentage ;
	}



/*			Method for Gpa equivalence			*/
	double Gpa (double Percentage)		      
	{
		double gpa = 0.0 ;
		if    ( Percentage >= 87 )
			{	gpa = 4.0 ;	}
		else if   ( Percentage >= 80     &&     Percentage < 87 )
			{	gpa = 3.5 ;	}
		else if   ( Percentage >= 72     &&     Percentage < 80 )
			{	gpa = 3.0 ;	}
		else if   ( Percentage >= 66     &&     Percentage < 72 )
			{	gpa = 2.5 ;	}
		else if   ( Percentage >= 60     &&     Percentage < 66 )				
			{	gpa = 2.0 ;	}
		else
			{	gpa = 0.0 ;	}
		return gpa ;
	}




	/*	  	   Method for calculating Gpa per subject		         */
	void Gpa_Subject ( ) {					

			/*	variables for marks, M stands for marks.		*/
		double  M_Physics,   M_Programming,   M_Pakstudy,   M_Calculus,   M_English,   M_Ict ;		

			/*	variables for percentage, P stands for percentage		*/
		double  P_Physics,   P_Programming,   P_Calculus,P_Pakstudy,   P_English,   P_Ict ;		          

			/*		variables for GPA, G stands for GPA			*/
		double  G_Physics,   G_Programming,   G_Calculus,   G_Pakstudy,   G_English,   G_Ict ;		          


		System.out.print ( "Physics : " ) ;
		M_Physics = input.nextDouble ( ) ;	          //Marks_input
		P_Physics = Percentage ( M_Physics ) ;	     //Pecentage 
		G_Physics = Gpa ( P_Physics ) ;		// calculate gpa
		System.out.println ( "\t\t\t\t\t GPA : " + G_Physics ) ;
									
/*		 "\t" is escap character use for tab space			     */


		System.out.print ( "Programming Fundamentals : " ) ;
		M_Programming = input.nextDouble ( ) ;
		P_Programming = Percentage ( M_Programming ) ;
		G_Programming = Gpa ( P_Programming ) ;	
		System.out.println ("\t\t\t\t\t GPA : "+ G_Programming) ;

		System.out.print ( "Pakistan Study : " ) ;
		M_Pakstudy = input.nextDouble ( ) ;
		P_Pakstudy = Percentage ( M_Pakstudy ) ;
		G_Pakstudy = Gpa ( P_Pakstudy ) ;	
		System.out.println ( "\t\t\t\t\t GPA : " + G_Pakstudy ) ;

		System.out.print ( "Calculus : " ) ;
		M_Calculus = input.nextDouble ( ) ;
		P_Calculus = Percentage ( M_Calculus ) ;
		G_Calculus = Gpa ( P_Calculus ) ;	
		System.out.println ( "\t\t\t\t\t GPA : " + G_Calculus ) ;

		System.out.print ( "English : " ) ;
		M_English = input.nextDouble ( ) ;
		P_English = Percentage ( M_English ) ;
		G_English = Gpa ( P_English ) ;	
		System.out.println ( "\t\t\t\t\t GPA : " + G_English ) ;

		System.out.print ( "ICT : " ) ;
		M_Ict = input.nextDouble ( ) ;
		P_Ict = Percentage ( M_Ict ) ;
		G_Ict = Gpa ( P_Ict ) ;	
		System.out.println ( "\t\t\t\t\t GPA : " + G_Ict ) ;

/*		    CGPA  = Gpa per subject x credit hours		*/

		double CGPA = ( G_Physics *3 + G_Programming*4 + G_Pakstudy*2 + G_Calculus *3 + G_English *3 + G_Ict *3) / 18 ;

		System.out.println ( "\n\t\t\t\t\t CGPA is : " + String.format ( "%.2f", CGPA ) ) ;
		}

	void record ( int n ) 			//n = no. of enrolled students
	{
		Scanner a = new Scanner ( System.in ) ;
		for ( int i = 0 ; i < n ; i++ )
		{
			System.out.print ( "\t\t\t\t\t Student id no. :  " ) ;
			int id = input.nextInt ( ) ;
			System.out.print ( "\t\t\t\t\t Student Name :  " ) ;
			String name = a.nextLine ( ) ;
			System.out.println ( "\t\t\t\t\t No. of subjects : 6" ) ;
	
			Gpa_Subject ( ) ;

			System.out.println ( "\t\t\t\t_______________________________\n" ) ;
		}
	}
}


class Result {
	public static void main ( String args [ ] )
	{
		System.out.println ( "\t\t\t\t\t Program : BS-DS (2019-2023) " ) ;
		System.out.println ( "\t\t\t\t\t Semester : I " ) ;
		Record r = new Record ( ) ;
		int n = r.Students ( ) ;
		r.record ( n ) ;
	}
}
