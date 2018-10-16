package jobScheduling;

public class Job {

	private String jobName;
	private double duration;
	private int priority;
	private double deadline;
	private int userType;

	
	public Job() {

	}

	
	public Job(String jobName, double duration, int priority, double deadline, int userType) {
		super();
		this.jobName = jobName;
		this.duration = duration;
		this.priority = priority;
		this.deadline = deadline;
		this.userType = userType;
	}

	
	public String getJobName() {
		return jobName;
	}

	
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	
	public double getDuration() {
		return duration;
	}

	
	public void setDuration(double duration) {
		this.duration = duration;
	}

	
	public int getPriority() {
		return priority;
	}

	
	public void setPriority(int priority) {
		this.priority = priority;
	}

	
	public double getDeadline() {
		return deadline;
	}

	
	public void setDeadline(double deadline) {
		this.deadline = deadline;
	}

	
	public int getUserType() {
		return userType;
	}

	
	public void setUserType(int userType) {
		this.userType = userType;
	}

	
	@Override
	public String toString() {
		return "Input [jobName=" + jobName + ", duration=" + duration + ", priority=" + priority + ", deadline="
				+ deadline + ", userType=" + userType + "]";
	}

}