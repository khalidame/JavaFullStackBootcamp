
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;



public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st = new StudentFeeDetails();
	
	    int id = 0;
	    
	    id = 2;
	    
	    if (id == 1) {
	    	st = new StudentFeeDetails("khalida", "email@gmail.com", "computer science", "1", 5000, 200);
	        double result = st.calcTuitionTotal(5000, 200);
		    
		    System.out.println("The total tuition for " +  st.getName() + " is $" + result);
		    System.out.println("The major of " +  st.getName() + " is " + st.getMajor());
	    } else {
	    	st = new StudentExamDetails("khalida", "email@gmail.com", "computer science", "1", "Java Exam", LocalDate.of(2021, 02, 20), LocalTime.parse("08:00"), LocalTime.parse("10:00"));
	    	System.out.println("The student " + st.getName() + " has a " + st.getExamName());
	    }
	    
	
	    
	

		

	}

}
