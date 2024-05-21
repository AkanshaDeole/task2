package codsoft.com;

import java.util.Scanner;

public class StudentCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of subjects of a Student:");
		int numsub = sc.nextInt();
		
		if(numsub <=0) {
			System.out.println("Enter the  valid number of Subjects (Positive Number)");
		}
		
		int total = 0;
		
		for (int i =1; i<= numsub; i++) {
			System.out.println("Enter the marks in subject " + i + "(between 0-100): ");
			int marks = sc.nextInt();
			
			total += marks;
			
		}
        
	    double percentage = total / numsub;
	    
	    String Grade;
	    
	    if(percentage >= 90 && percentage <=100) {
	    	Grade ="Grade A+";
	    }
	    else if(percentage >= 80) {
	    	Grade ="Grade A";  
	    }
	    else if(percentage >= 70) {
	    	Grade ="Grade B";
	    }
	    else if(percentage >= 60) {
	    	Grade ="Grade C";
	    }
	    else if(percentage >= 50) {
	    	Grade ="Grade D";
		}
	    else {
	    	Grade ="Grade E";
	    }
	    
	    
	    System.out.println("Total marks :" + 100*numsub);
	    System.out.println("\nTotal marks that student Obtained:" +total);
	    System.out.println("\nAverage Percentage of the Student :" + percentage);
	    System.out.println("\n Grade of a Student:" +Grade );
	    
	    

}
}
