/*Aaron Templeton
 * CSIS 1410
 * A01 Student
 */

package student;

public class Student {

	/**
	 * Field for the first name of the student. this field is private
	 */
	private String firstName;
	/**
	 * Private field for the last name of student
	 */
	private String lastName;
	/**
	 * private field for the student number
	 */
	private int sNumber;
	/**
	 * private field for the major of the student
	 */
	private String major;
	/**
	 * private field for the student's GPA
	 */
	private double gpa;
	/**
	 * private integer for the student number auto increment. starts at 0
	 */
	private static int count = 0;
	/**
	 * private final integer for the starting student number.
	 */
	private final int startCount = 1234567;

	/**
	 * Constructor Student. creates the student number for a new student
	 */
	public Student() {
		sNumber = count + startCount;
	}

	/**
	 * Constructor Student will create the student. must have first name, last
	 * name, major, gpa
	 * 
	 * @param fName
	 * @param lName
	 * @param maj
	 * @param gpa
	 */
	public Student(String fName, String lName, String maj, double gpa) {
		sNumber = count + startCount;
		this.firstName = fName;
		this.lastName = lName;
		this.major = maj;
		this.gpa = gpa;
		count++;
	}

	/**
	 * getter for first name of student
	 * 
	 * @return
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * setter for first Name of student
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * getter for last name of student
	 * 
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * setter for last name of student
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * getter for student's major
	 * 
	 * @return
	 */
	public String getMajor() {
		return major;
	}

	/**
	 * setter for student major
	 * 
	 * @param major
	 */
	public void setMajor(String major) {
		this.major = major;
	}

	/**
	 * getter for student GPA
	 * 
	 * @return
	 */
	public double getGpa() {
		return gpa;
	}

	/**
	 * setter for student GPA
	 * 
	 * @param gpa
	 */
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	/**
	 * getter for student number
	 * 
	 * @return
	 */
	public int getsNumber() {
		return sNumber;
	}

	/**
	 * overrided toString method to display student information
	 */
	@Override
	public String toString() {

		return "Number: " + getsNumber() + " First Name: " + getFirstName() + " Last Name: " + getLastName()
				+ " Major: " + getMajor() + " gpa: " + getGpa();
	}

}
