package kodlamaIoOdev.entities;

public class Course {
	private int courseId;
	private String courseName;
	private String courseGivenEducator;
	private double courseFee;

	public Course(int courseId, String courseName, String courseGivenEducator, double courseFee) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseGivenEducator = courseGivenEducator;
		this.courseFee = courseFee;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseGivenEducator() {
		return courseGivenEducator;
	}

	public void setCourseGivenEducator(String courseGivenEducator) {
		this.courseGivenEducator = courseGivenEducator;
	}

	public double getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(double courseFee) {
		this.courseFee = courseFee;
	}

}
