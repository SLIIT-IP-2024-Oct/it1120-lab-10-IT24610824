import java.util.Scanner;
public class IT24610824Lab10Q1 {
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		
		System.out.print("Enter a mark(0-100) :");
		int mrk = scanner.nextInt();
		assert (mrk >= 0 && mrk <= 100): "Invalid Mark";
		System.out.println("Mark is Validated");

		char grade;
		if (mrk >= 75) 
          		grade = 'A';
        	else if (mrk >= 60 && mrk<=74) 
			grade = 'B';
       		else if (mrk >= 50 && mrk<=59) 
            		grade = 'C';
        	else if (mrk >= 40 && mrk<=49) 
            		grade = 'D';
        	else 
            		grade = 'F';
    
		assert (
			(grade=='A' && mrk >= 75) || 
			(grade=='B' && mrk >= 60 && mrk<=74) || 
			(grade=='C' && mrk >= 50 && mrk<=59) || 
			(grade=='D' && mrk >= 40 && mrk<=49) || 
			(grade=='F' && mrk < 40 )
		) : "Incorrect Grade Assigned";
        
       
		System.out.println("The Grade of the Entered Mark is : " + grade);

		
	}
}