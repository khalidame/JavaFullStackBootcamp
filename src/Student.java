

public abstract class Student {

  
	    private String name;     
	    private String email;     
	    private String major; 
	    private String id;

	    
	    public Student() {
	        this("", "", "", "");
	    }
        


		public Student(String name, String email, String major, String id) {
			super();
			this.name = name;
			this.email = email;
			this.major = major;
			this.id = id;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public String getEmail() {
			return email;
		}



		public void setEmail(String email) {
			this.email = email;
		}



		public String getMajor() {
			return major;
		}



		public void setMajor(String major) {
			this.major = major;
		}



		public String getId() {
			return id;
		}



		public void setId(String id) {
			this.id = id;
		}
		
	    public double calcTuitionTotal(double tuition, double programFee) {
	    	double result = tuition + programFee;
	    	return result;
	    }
	    
	
	    
	 
		
		

	
}
