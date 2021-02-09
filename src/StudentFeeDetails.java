
public class StudentFeeDetails extends Student {

	private double tuition;
	private double programFee;
	
	public StudentFeeDetails() {
		this("", "", "","", 0.0, 0.0);
		tuition = 0.00;
	}


	public StudentFeeDetails(String name, String email, String major, String id, double tuition, double programFee) {
		super(name, email, major, id);
		this.tuition = tuition;
		this.programFee = programFee;
	}


	public double getTuition() {
		return tuition;
	}


	public void setTuition(double tuition) {
		this.tuition = tuition;
	}


	public double getProgramFee() {
		return programFee;
	}


	public void setProgramFee(double programFee) {
		this.programFee = programFee;
	}


	
	
	
	
	
	
	
	
}
