import java.time.LocalDate;
import java.time.LocalTime;

public class StudentExamDetails extends Student{
	private String examName;
	private LocalDate examDate;
	private LocalTime examStartTime;
	private LocalTime examEndTime;
	

	public StudentExamDetails() {
		super("", "", "", "");
		this.examName = "";
		this.examDate = null;
		this.examStartTime = null;
		this.examEndTime = null;

	}

	public StudentExamDetails(String name, String email, String major, String id, String examName, LocalDate examDate, LocalTime examStartTime, LocalTime examEndTime ) {
		super(name, email, major, id);
		
		this.examName = examName;
		this.examDate = examDate;
		this.examStartTime = examStartTime;
		this.examEndTime = examEndTime;
		
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public LocalDate getExamDate() {
		return examDate;
	}

	public void setExamDate(LocalDate examDate) {
		this.examDate = examDate;
	}

	public LocalTime getExamStartTime() {
		return examStartTime;
	}

	public void setExamStartTime(LocalTime examStartTime) {
		this.examStartTime = examStartTime;
	}

	public LocalTime getExamEndTime() {
		return examEndTime;
	}

	public void setExamEndTime(LocalTime examEndTime) {
		this.examEndTime = examEndTime;
	}
	
	


	
	
	
	
  

}
